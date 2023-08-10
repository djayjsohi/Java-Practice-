package com.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.security.auth.login.AccountLockedException;

public class LLUseCase {
	public static void main(String[] args) {
		LinkedList<String> myLL=new LinkedList<>();
		myLL.add("Deepak");
		myLL.add("Dinesh");
		myLL.add("Harish");
		myLL.add("Himanshu");
		//System.out.print(strLLinkedList);
		myLL.addFirst("Sangeeta"); //in the beginning of list
		//System.out.print(strLLinkedList);
		myLL.add(2, "Himesh"); //add at an index
		//System.out.print(strLLinkedList);
		//addAll(Collection c);
		//strLLinkedList.addAll(strLLinkedList);
		String[] strArr = {"A", "B", "C"};
		List<String> arrList = Arrays.asList(strArr);
		//arrList.add("D"); ..gives error as ..arrList is immutable due to the fact
		//arrList is fixed size list backed by the array..hence it can't be changed. 
		//myLL.addAll(arrList);
		myLL.addAll(2, arrList);
		myLL.add("A");
		System.out.print(myLL);
		//myLL.remove(); //removes first element
		//myLL.remove(2); //removal by index
		//myLL.remove("Himesh");
		//myLL.removeFirst();
		//myLL.removeLast();
		
		myLL.removeLastOccurrence("A");
		//myLL.removeAll(arrList);
		
		/*
		 * ArrayList<String> myAL= new ArrayList<>(); myAL.add("Himesh");
		 * myAL.add("Sangeeta")
		 */;	 
		System.out.print("\n"+myLL);
		
		
	}
}
