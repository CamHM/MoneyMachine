package test;

import com.uptc.prgIII.datastructure.simpleList.Node;

import model.Game;

public class ModelTest {

	public static void main(String[] args) {
		Game game = new Game(5);
		for (int i = 0; i < game.getColumnsAmount(); i++) { //Agrega Cantidad de elementos a cada list
			game.addColumnElements(i, 8);
		}
		
		for (int i = 0; i < game.getColumnsAmount(); i++) { //Imprime info en cada lista
			System.out.println("Columna: " + i + " ....");
			Node<String> aux = game.getColumn(i).getPointer(); 
			for (int j = 0; j < 5; j++) { //Hasta 10 elementos
				System.out.println(""+aux.getInfo());
				aux = aux.getNext();
			}
		}
	}
}