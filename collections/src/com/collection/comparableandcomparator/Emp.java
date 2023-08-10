package com.collection.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Emp {
	public static void main(String[] args) {
   
		
	  List<Employee> em=new ArrayList<>();
	         em.add(new Employee("Deepak", 1204, 844986585));
	         em.add(new Employee("Ramesh", 1201,959683735));
	         em.add(new Employee("Mahesh", 1103, 757685494));
	         em.add(new Employee("Jignesh",1205,984857565));
	         em.add(new Employee("Himesh", 1206, 848573125));
	         em.add(new Employee("Himesh", 1207, 848758125));

	         //System.out.println(em);
	         
	         Collections.sort(em, new idComparator());
	         
	         //comparable
	        System.out.println(em);
	         
//	         List<Employee> em1=new ArrayList<>(em); 
//	         Collections.sort(em1,new nameComaparator());
//	         System.out.println(em1);
	         
	}


}
