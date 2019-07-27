package com.app.navneet.doublylinkedlist;

public class DllList {

	Node first;
	Node last;
	int size;

	public void addFirst(Object data) {
		if (data == null) {
			throw new NullPointerException();
		}
		Node node = new Node();
		node.data = data;
		if (first == null) {
			last = node;
		} else {
			first.prev = node;
		}

		node.next = first;
		first = node;
		size++;
	}

	public void addLast(Object data) {
		if (data == null) {
			throw new NullPointerException();
		}
		Node node = new Node();
		node.data = data;
		if (first == null) {
			first = node;
		} else {
			last.next = node;
			node.prev = node;
		}

		last = node;
		size++;
	}

	public boolean addAfter(Object elm, Object after) {
		if (elm == null || after == null) {
			throw new NullPointerException();
		}
		Node node = new Node();
		node.data = elm;
		Node current = this.first;
		if (after == last.data) {
			addLast(elm);
			return true;
		}
		
		while (!current.data.equals(after)) {
			if (current == null)
				return false;
			current = current.next;
		}
		if (current == last) {
			current.next = null;
			last = node;
		} else {

			node.next = current.next;
			current.next.prev = node;
		}
		node.prev = current;
		current.next = node;
		return true;
	}

	public void deleteLast() {
		if (first.next == null) {
			first = null;

		} else {
			last.prev.next = null;
			last = last.prev;
		}
	}
	
	public void deleteFirst() {
		if (first.next == null) {
			first = null;

		} else {
			first.next.prev = null;
			first = first.next;
		}
	}

	public void delete(Object element) {
		if (element.equals(first.data)) {
			deleteFirst();
			return;
		}
		if (element.equals(last.data)) {
			deleteLast();
			return;
		}
		Node temp = first;
		Node prev = null;
		while (!temp.data.equals(element)) {
			prev = temp;
			temp = temp.next;
		}
		System.out.println("delete  = " + prev.data);
		prev.next = temp.next;
		temp.next.prev = prev;

	}

	public synchronized void print() {
		Node temp = first;
		while (temp != null) {
			System.out.println("Element  = " + temp.data);
			temp = temp.next;
		}
	}

	public int getSize() {
		return this.size;
	}
}
