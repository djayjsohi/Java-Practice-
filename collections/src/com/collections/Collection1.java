package com.collections;

import java.util.*;
import java.util.Collection;
import java.util.LinkedHashSet;

import javax.lang.model.element.Name;


public class Collection1 {
	public static void main(String[] args) {
		Collection<String> coll;
		ArrayList<String> myAList;
		LinkedHashSet<String> linkedHashSet;
		TreeSet<String> treeSet;
		
		
	 Set<String > set=new TreeSet<>();  // string order sorted natural order from a to z
		/*
		 * set.add("Deepak"); set.add("Joshi"); set.add("Joshi"); set.add("ABC");
		 * System.out.println(set);
		 * 
		 * ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c",
		 * "d")); ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("a", "b",
		 * "e", "f"));
		 * 
		 * //missing items in listOne listTwo.removeAll(listOne);
		 * System.out.println(listTwo);
		 */
	    
	 
	List<String> namesList = new ArrayList<String>(Arrays.asList( "alex", "brian", "charles") );
             namesList.add(2,"Deepak");
             namesList.remove(1);
             System.out.println(namesList);
             
             System.out.println("iterate using for loop ......");
			 for(int i = 0; i < namesList.size(); i++)
			 {
			     System.out.println(namesList.get(i));
			    
			 }
             System.out.println("iterate using for Each ......");
			 for(String n : namesList) {
				 System.out.println(n);
				 
			 }
	   /*Person P1= new Person();
	   Person P2=new Person();
	   System.out.println(P2.equals(P1));
	 */
	
	}
}
