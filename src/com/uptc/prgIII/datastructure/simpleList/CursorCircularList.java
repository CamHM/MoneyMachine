package com.uptc.prgIII.datastructure.simpleList;

public class CursorCircularList<T> {

	private CircularSimpleList<T> circularSimpleList;
	private Node<T> actualPosition;
	
	public CursorCircularList(CircularSimpleList<T> circularSimpleList) {
		this.circularSimpleList = circularSimpleList;
	}
	
	public void reset() {
		this.actualPosition = circularSimpleList.pointer;
	}
	
	public void next() {
		this.actualPosition = this.actualPosition.next;
	}
	
	public T getActualInfo() {
		return this.actualPosition.info;
	}
}