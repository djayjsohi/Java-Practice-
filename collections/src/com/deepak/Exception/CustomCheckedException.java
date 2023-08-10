package com.deepak.Exception;
class DeepakException extends RuntimeException{
	  public DeepakException(String str) {
		  super(str);
	  }
  }
public class CustomCheckedException    {
	
	public static void main(String[] args) {
		int i=10;
		int j=5;
		try{
		 int d =i/j;
	  throw new DeepakException("Pls dont do this");
		 }
		catch(DeepakException e) {
			System.out.println("Not possible");
		}
	finally {
		System.out.println("This man doing wrong");
	}
	}

	}

	
	
	
	
	
	
	
	
	


