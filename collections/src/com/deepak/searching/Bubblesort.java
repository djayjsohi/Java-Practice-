package com.deepak.searching;

class Bubblesort{
	public static void main(String[] args) {
		int[] ar= {34,35,12,13,4,9,78,99,87,18,17,19,22};
		
		for (int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length-i-1;j++) {
			         if(ar[j]>ar[j+1]) {
			        	int temp=ar[j];
			        	ar[j]=ar[j+1];
			        	ar[j+1]=temp;
			         }	
			}
		}
	
	   for(int i=0;i<ar.length;i++) {
		     System.out.println(ar[i]);
	   }
	}
	
}