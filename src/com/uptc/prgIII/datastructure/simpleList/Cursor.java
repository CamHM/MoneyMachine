package com.uptc.prgIII.datastructure.simpleList;

public class Cursor<T> {

	private SimpleList<T> simpleList;
	private Node<T> actualPosition;
	
	public Cursor(SimpleList<T> simpleList) {
		this.simpleList = simpleList;
		this.actualPosition = simpleList.head;
	}
	
	public void reset(){
		this.actualPosition = this.simpleList.head;
	}
	
	public void next(){
		this.actualPosition = this.actualPosition.next;
	}
	
	public boolean isOut(){
		return this.actualPosition == null;
	}
	
	public T getActualInfo(){
		return this.actualPosition.info;
	}
	
	public void position(Cursor<T> cursor){
		this.actualPosition = cursor.actualPosition;
	}
}