package com.deepak.Exception;

public class arithmeticException {
	public static void main(String[] args) {
		int i=10;
		int j=0;
		int d;
		try{
		 d =i/j;
		}catch(ArithmeticException e) {
			System.out.println("Not possible");
		}
	finally {
		System.out.println("This man doing wrong");
	}
	}

	}
