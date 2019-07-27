package com.app.navneet.doublylinkedlist;

public class Apss {

	public static void main(String[] args) throws InterruptedException {
		DllList dl=new DllList();
		dl.addFirst(123);
		dl.addFirst(456);
		dl.addFirst(423);
		dl.addFirst(12);
		dl.print();
		//dl.addLast(567);
		System.out.println("==============");
		dl.print();
		System.out.println("============= size "+dl.size);
		Thread.sleep(100);
		dl.addAfter(34,423);
		System.out.println("==========");
		dl.print();
		dl.addAfter(34,123);
		System.out.println("==========");
		dl.print();

	}

}
