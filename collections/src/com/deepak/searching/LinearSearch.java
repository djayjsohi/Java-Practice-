package com.deepak.searching;

public class LinearSearch {
   private static final String ith = null;

public static void main(String[] args) {
	String arr[]= {"Deepak","Abhishek","Jyoti","Rohan","Puneet","BP","Sangeeta","SDD","HDD"};
	   String n ="Rohit";
	   int temp=0;
	     
	          for(int i=0;i<arr.length;i++) {
	        	  if(arr[i].equals(n)) {
	        		  System.out.println("The number is prsent at position " +i+ " index position");
	        	     temp=temp+1;
	        	  }
	          }
	          if(temp==0) {
	        	  System.out.println("Element is not present");         }
	   
	   
}
	
	 //complexity  best case === bigO(1)
       // worst case === big o (n)
}
