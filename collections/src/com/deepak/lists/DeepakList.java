package com.deepak.lists;

public class DeepakList<E> {
	Node head;
	
	class Node{
		//int data
		E data;
		Node next;
		//public Node(int data, Node next)
		public Node(E data, Node next) {
			this.data=data;
			this.next=next;
		}
	}

	public void add(E i) {
		Node listHead=head;
		if(listHead!=null) {
			while(listHead.next!=null) {
				listHead=listHead.next;
			}
			Node n= new Node(i, null);
			listHead.next=n;
		}
		else {
			Node n= new Node(i, null);
			head=n;
		}
	}
	
	
	/*
	 * public void remove() throws com.deepak.Exception { Node listHead = head; Node
	 * newLastNode = listHead; if (listHead == null) { throw new
	 * IllegalArgumentException("List is empty not possible to Remove"); } else {
	 * while(listHead.next!=null) { newLastNode=listHead; listHead=listHead.next; }
	 * newLastNode.next=null; }
	 * 
	 * }
	 */
	
	public void printList() {
		Node listHead=head;
		while(listHead!=null) {
			System.out.println(listHead.data);
			listHead=listHead.next;
		}
	}


	public void remove(int index) throws Exception  {
		// 1-2-3-4
	    Node listHead=head;
		Node previous;
		Node next;
		int count=0;
		
		if(listHead==null) {
			throw new IndexOutOfBoundsException("Element not found in list");
		}
		else {
			previous=head;
			while(count <index) {
				previous=previous.next;
				count++;
			}
			
			
			Node curr =previous.next;
			previous.next=curr.next;
		}
		
		
	}

	
}

