//package com.deepak.Exception;

import java.util.Scanner;

// custom checked exception
 class UnderAgeException extends Exception{
	 public UnderAgeException() {
		 // TODO Auto-generated constructor stub
	  super("You are under age");
	 }
	 UnderAgeException(String msg)
	 {
		 super(msg);
	 }
 }
public class customCheckedexception {
	
	public static void main(String[] args) {
		
        int age=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Age: ");
         int age1=sc.nextInt(); 
 try {
 if(age1<=118) {
	throw new UnderAgeException("You are below 18 hence not allowed for voting");
 }
 }
 catch(UnderAgeException e) {
	e.printStackTrace(); 
 }
 }
}

