package TimeAndSpaceComplexity;

import java.util.Scanner;

public class ArrayPartition {

	public ArrayPartition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) {
			arr[i] = scn.nextInt();
			}
		System.out.println("Enter the pivot element");
		int p = scn.nextInt();
		int[] arr3 = ArrayPartition(arr , p);
		for(int i = 0; i <arr3.length ; i++) {
			System.out.println(arr3[i]);
			}

	}
     public static int[] ArrayPartition(int[] arr , int p) {
    	 
    	 int i = 0; int j = 0;
    	  while (i < arr.length)
    	  {
    		  if (arr[i] <= p) { swap (arr , i ,j) ; i++ ; j++; }         //Goes from 0 to j-1 
    		  else { i++; }                                               //Goes from j to i-1
    	  }
    	  
    	  return arr ;
    	 
     }
     public static void swap(int[] arr , int x , int y) {
 		int temp = arr[x];
 		arr[x] = arr[y];
 		arr[y] = temp;
 	}
}
