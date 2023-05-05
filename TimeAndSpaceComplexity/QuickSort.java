package TimeAndSpaceComplexity;

import java.util.Scanner;

public class QuickSort {

	public QuickSort() {
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
		QuickSort(arr , 0 , arr.length-1);
		for (int i = 0 ; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
		

	}
	public static void QuickSort(int[] arr , int idx1 , int idx2) {
		if(idx1 > idx2) {return;}
		
		int p = arr[idx2];
		int pi = ArrayPartition(arr , p);                                   //Pivot index
		QuickSort(arr , idx1 , pi-1);
		QuickSort(arr, pi+1 , idx2);
	}
	
	
 public static int ArrayPartition(int[] arr , int p) {
    	
    	 int i = 0; int j = 0;
    	  while (i < arr.length)
    	  {
    		  if (arr[i] <= p) { swap (arr , i ,j) ; i++ ; j++; }         //Goes from 0 to j-1 
    		  else { i++; }                                               //Goes from j to i-1
    	  }
    	  
    	  return j-1 ;                                                    //Pivot location
    	 
     }
     public static void swap(int[] arr , int x , int y) {
 		int temp = arr[x];
 		arr[x] = arr[y];
 		arr[y] = temp;
 	}
}
