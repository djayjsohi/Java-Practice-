package com.deepak.searching;

public class Mergesort {
	
	int [] arr;
	int [] tempArrayMerge;
	int length;
	public static void main(String[] args) {
		int [] array1= {49,33,56,34,54,65,53,52,47};
		Mergesort ms=new Mergesort();
		   ms.sort(array1);
	
	for(int i:array1) {
		System.out.println(i);
	}
	}
	private void sort(int[] array1) {
		
		
		this.arr=array1;
		this.length=array1.length;
		this.tempArrayMerge=new int[length];
		
		
	}
	public void divideArray(int lowerindex, int higherindex){
		
		
		if(lowerindex<higherindex) {
			int mid=lowerindex+(higherindex-lowerindex)/2;
			
			//it will sort left side of array
			
			divideArray(lowerindex,mid);
			
			//it will sort array from right side of an array 
			divideArray(mid+1,higherindex);
		}
	}
	
public void MergeArray(int lowerindex, int mid, int higherindex) {
      for(int i=lowerindex;i<=higherindex;i++) {
    	  tempArrayMerge[i]=arr[i];
      }
int i=lowerindex;
int j=mid+1;
int k=lowerindex;
while(i<=mid && j <=higherindex) {
	if(tempArrayMerge[i]<=tempArrayMerge[j])
	{
		arr[k]=tempArrayMerge[i];
		i++;
	}else {
		arr[k]=tempArrayMerge[j];
		j++;
	}
	k++;
}

while(i<=mid) {
	arr[k]=tempArrayMerge[i];
   k++;
   i++;
}
}
}
