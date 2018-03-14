package com.uptc.prgIII.datastructure.simpleList;

import java.util.Comparator;

public class SimpleList<T> {

	protected Node<T> head;
	private boolean isSort;
	private Comparator<T> comparator;
	
	public SimpleList() {
		this.head = null;
		this.isSort = false;
	}
	
	public SimpleList(boolean sort, Comparator<T> comparator) {
		this.head = null;
		this.isSort = sort;
		this.comparator = comparator;
	}
	
	public Node<T> getHead() {
		return head;
	}
	
	public boolean isEmpty(){
		return this.head == null;
	}
	
	public void add(T info){
		if(isSort){
			add(info,comparator);
		}else{
			if (this.head != null) {
				Node<T> next = head;
				while(next.next != null){ // penultimo elemento
					next = next.next;
				}
				next.next = new Node<>(info);
			} else {
				this.head = new Node<>(info);
			}
		}
	}
	
	public void add(T info, Comparator<T> comparator){
		if(this.head != null){
			Node<T> aux = head;
			Node<T> before = aux;
			Node<T> next = new Node<>(info);
			while(aux.next != null){
				if(comparator.compare(info, aux.getInfo()) == -1){
					if(aux == head){
						next.next = head;
						head = next;
					}
					next.next = aux;
					return;
				}
				before = aux;
				aux = aux.next;
			}
			aux.next = next;
		}else {
			this.head = new Node<>(info);
		}
	}
	
	/*
	 * Agrega Al inicio
	 */
	public void insert(T info){
		if(this.head != null){
			this.head = new Node<>(info, this.head);			
		}else{
			this.head = new Node<>(info);
		}
	}
	
	public Node<T> simpleSearch(T info) throws Exception{
		if(this.head != null) {
			Node<T> aux = this.head;
			while(aux.next != null && aux.getInfo() != info) {
				aux = aux.next;
			}
			if(aux.getInfo() == info) {
				return aux;
			}
		}
		throw new Exception("Element not found");
	}
	
	public void remove(T info){ 
		if(info == head.info){
			this.head = this.head.next;
		}else{
			Node<T> aux = head;
			Node<T> before = head;
			while (aux.next != null && aux.info != info) {
				before = aux;
				aux = aux.next;
			}
			if(aux != null && aux.info == info){
				before.next = aux.next;
			}
		}
	}
	
	
}