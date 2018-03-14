package com.uptc.prgIII.datastructure.simpleList;

public class CircularSimpleList<T> {

	protected Node<T> pointer;
	
	public CircularSimpleList() {
		this.pointer = null;
	}
	
	public boolean isEmpty() {
		return this.pointer == null;
	}
	
	/*
	 * Agrega la información inmediatemente después del apuntador
	 * 
	 * */
	public void add(T info) {
		if(pointer != null) {
			this.pointer.next = new Node<>(info, this.pointer.next);
		}else {
			this.pointer = new Node<>(info);
			this.pointer.next = this.pointer;
		}
		
	}

	public Node<T> getPointer() {
		return this.pointer;
	}
}