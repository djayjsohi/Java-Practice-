package com.collections.lists;

public class Node {
	String data;
	Node next;
	
	public Node(String data) {
		this.data=data;
		this.next=null;
	}
	
	public Node(String data, Node n) {
		this.data=data;
		this.next=n;
	}
}
