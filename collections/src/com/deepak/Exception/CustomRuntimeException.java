package com.deepak.Exception;

import java.util.Scanner;

class underAgeException extends RuntimeException{
	
	underAgeException(){
		super("You are not allowed");
	}
	underAgeException(String str){
		super(str);
	}
}


public class CustomRuntimeException {
 public static void main(String[] args) {
	int age = 0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the age : ");
	      int age1=sc.nextInt();
try {
	if(age1<18) {
		throw new Exception("not allowed below 18");
	}
	else {
		System.out.println("You can vote now...");
	
	}
}catch(Exception e) {
	e.printStackTrace();
	System.out.println(" Go Back and try again");
}
}
}
