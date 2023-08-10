package com.collection.Map;

import java.util.HashMap;
import java.util.Map;

public class EqualTest {
			public static void main(String[] args) {
			EmployeeMap e1 = new EmployeeMap();
			EmployeeMap e2 = new EmployeeMap();

			e1.setId(100);
			e2.setId(100);

			System.out.println(e1.equals(e2));	//false
			

			//Map<EmployeeMap> employees = new HashMap<EmployeeMap>();
			//employees.add(e1);
			//employees.add(e2);

			//System.out.println(employees);
			
			System.out.println(e1.equals(e2));
			
		}
	}


