//public class BinarySearch {
//   public static void main(String[] args) {
//	int arr[]= {1,2,3,4,6,8,12,16,17,19,20,21,22,24,25,26};
//	
//	int num=17;
//	int high =arr.length-1;         //16-1=15
//	int low=0;
//	int mid=low+high/2;             //15/2==7
//	
//	while(low<=high){
//	       if(arr[mid]==num) {
//	    	   System.out.println("The element is present at" +mid+ "Index");
//	    	    break;
//	       }else if(arr[mid]<num) {
//	    	   low=mid+1;
//	    	 }
//	       else {
//	    	   high=mid-1;
//	       }
//	       mid=high+low/2;
//	       if(low>high) {
//	    	   System.out.println("The element is not found");
//	       }
//	 }
//	}
//}
