package com.deepak.searching;

public class Insertionsort {
	public static void main(String[] args) {
		int[] a= {5,1,6,2,4,5,7,8,9,10};
		int temp,j;
		for(int i=1;i<a.length;i++) {
			temp =a[i];
			j=i;
			while(j>00 && a[j-1]>temp) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
