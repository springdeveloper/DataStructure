package com.app.navneet.singlelinkedlist;

public class App {

	public static void main(String[] args) {
		SingleLinkedList list=new SingleLinkedList();
		list.addFirst(23);
		list.addFirst(46);
		list.addFirst(43);
		list.addLast(99);
		list.addFirst(90);
		list.print();
		System.out.println(list.size);
       System.out.println("======================");
		list.addAfterElemnt(43,88);
		list.print();
		System.out.println(list.size);
		list.delete(90);
		list.print();
		System.out.println(list.size);
	}

}
