package com.mmcoe.ds;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(40);

		l.print();
		System.out.println();
		l.insert(0, 5);
		l.insert(2, 15);
		l.insert(5, 70);
		l.print();
		System.out.println();
		l.remove(5);
		l.print();
		
		System.out.println();
		l.add(80);
		l.print();
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Anuja");
		l1.add("Patil");
		
		l1.print();
		
	}
}
