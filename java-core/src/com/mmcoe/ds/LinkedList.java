package com.mmcoe.ds;

public class LinkedList <T> {
	private class Node{
		private T data;
		public Node next;
		

		private Node(T data) {
			this.data = data;
		}
	}
	
	private Node head,last;
	private int size;
	
	public LinkedList() {
		head=null;
		last=null;
	}
	
	public void add(T data) {
		Node n=new Node(data);
		
		if(head==null) {
			head=n;
			last=n;
		}
		else {
				last.next=n;
		}
		last=n;
		size++;
		
	}
	
	public void insert(int pos,T data) {
		Node n =new Node(data);
		Node temp=head;
		int t=0;
		if(pos > size) {
			throw new IllegalArgumentException("Index out of bound");
		}
		if(pos==0) {
			n.next=head.next;
			head=n;
			size++;
			return;
		}
		while(t < pos-1) {
			temp=temp.next;
			t++;
		}
		n.next=temp.next;
		temp.next=n;		
	}
	public void remove(int pos) {
		int t=0;
		Node temp=head;
		if(pos > size) {
			throw new IllegalArgumentException("Index out of bound");
		}
		if(pos == 0) {
			head=head.next;
			size--;
			return;
		}
		while(t < pos-1) {
			temp=temp.next;
			t++;
		}
		temp.next=temp.next.next;
		if(temp.next==last) {
			last=temp;
		}
	}
	
	public void print() {
		Node temp=head;
		while(temp!= null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
