package com.collections.lists;

public class NodeTest {
	public static void main(String[] args) {
		Node head = constructList();
		printNode(head);
		
	}

	public static Node constructList() {
		Node head;
		Node n1 = new Node("Deepak");
		head=n1;
		Node n2 = new Node("Himanshu");
		Node n3 = new Node("Geeta");
		Node n4 = new Node("Sheetal");
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return head;
	}

	private static void printNode(Node n) {
		/*
		 * recursion code
		 * if(n==null) return; else { System.out.println(n.data); printNode(n.next); }
		 */
		
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
}
