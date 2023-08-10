package com.collection.comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Emo {
	
	public static void main(String[] args) {
		List<Laptop> Laptop=new LinkedList <>();
		
		 Laptop.add(new Laptop("acer",2011,34));
		 Laptop.add(new Laptop("asus",2013,35));
		 Laptop.add(new Laptop("HP",2010,24));
		 Laptop.add(new Laptop("Dell",2015,36));
		 Laptop.add(new Laptop("apple",2014,35));
		 
		 Collections.sort(Laptop);
		 //lambda
		 
		 //collections.sort(Laptop,(o1 ,o2)->(int) (o1.getid()-o2.getid());
		 for(Laptop n: Laptop)
		 System.out.println(n);
		
	}

}
