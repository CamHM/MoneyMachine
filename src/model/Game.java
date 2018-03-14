package model;

import java.util.Random;

import com.uptc.prgIII.datastructure.simpleList.CircularSimpleList;

public class Game {

	private CircularSimpleList<String>[] columns;
	
	@SuppressWarnings("unchecked")
	public Game(int columnsAmount) {
		this.columns = new CircularSimpleList[columnsAmount];
		init();
	}
	
	private void init() {
		for (int i = 0; i < columns.length; i++) {
			this.columns[i] = new CircularSimpleList<>();
		}
	}
	
	public void addColumnElements(int column, int elementsAmount) {
		Random random = new Random();
		for (int i = 0; i < elementsAmount; i++) {
			this.columns[column].add(String.valueOf(random.nextInt(elementsAmount)));
		}
	}
	
	public int getColumnsAmount() {
		return this.columns.length;
	}
	
	public CircularSimpleList<String> getColumn(int number){
		return this.columns[number];
	}
 }