package com.deepak.lists;

import java.util.LinkedList;

public class DeepakListTest {
	public static void main(String[] args) throws Exception {
		LinkedList<Integer> intLL=new LinkedList<>();
		DeepakList<Integer> intDL= new DeepakList();
		intLL.add(1);
		intDL.add(1);
		//intDL.printList();
		//System.out.println("===");
		intLL.add(2);
		intDL.add(2);
		//intDL.printList();
		//System.out.println("===");
		intLL.add(3);
		intDL.add(3);
		//vbintDL.printList();
		//System.out.println("===");
		//intDL.add("/Hello Ji");
		//intDL.printList();
		//System.out.println("===");
		intLL.add(4);
		intDL.add(4);
		intDL.printList();
		System.out.println("===");
		//intLL.remove();
		//intDL.remove();
		//intDL.printList();
		intDL.remove(0);
		intDL.printList();
		
	}
}
