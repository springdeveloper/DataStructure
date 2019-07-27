package com.app.navneet.singlelinkedlist;

public class SingleLinkedList {

	Node head;
	int size = 0;

	public void addLast(Object data) {
		if (data == null) {
			throw new NullPointerException("Null Not Allowed");
		}
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node current = this.head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;
		size++;
	}

	public void addFirst(Object data) {
		if (data == null) {
			throw new NullPointerException("Null Not Allowed");
		}
		Node node = new Node();
		node.data = data;
		node.next = head;
		head = node;
		size++;
	}

	public void delete(Object data) {
		if (data == null) {
			throw new NullPointerException("Null Not Allowed");
		}
		if(head.data==data) {
			head=head.next;
			size--;
			return;
		}
		Node current = this.head;
		Node prev = null;
		while (current.next != null && current.data!=data) {
			prev = current;
			current = current.next;
		}
		prev.next = prev.next.next;
		size--;
	}
	
	public void addAfterElemnt(Object after,Object elm) {
		if (after == null || elm==null) {
			throw new NullPointerException("Null Not Allowed");
		}
		Node node = new Node();
		node.data = elm;
		Node current = this.head;
		while (current.next != null && current.data!=after) {
			current = current.next;
		}
		node.next=current.next;
		current.next=node;
		size++;
	}

	public void print() {
		Node current = this.head;
		while (current != null) {
			System.out.println("data " + current.data);
			current = current.next;
		}
	}

	public int getSize() {
		return size;
	}
}
