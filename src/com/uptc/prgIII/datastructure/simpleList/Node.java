package com.uptc.prgIII.datastructure.simpleList;

public class Node <T>{

	protected T info;
	protected Node <T> next;

	public Node(T info) {
		this.info = info;
		this.next = null;
	}
	
	public Node(T info, Node<T> next) {
		this.info = info;
		this.next = next;
	}
	
	public Node<T> getNext(){
		return next;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}