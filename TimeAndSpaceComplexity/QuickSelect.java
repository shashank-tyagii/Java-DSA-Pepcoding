package TimeAndSpaceComplexity;

import java.util.Scanner;

public class QuickSelect {

	public QuickSelect() {
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
		System.out.println("Enter the kth element");
		int kk = scn.nextInt();
		int kth = QuickSelect(arr , 0 , arr.length-1 , kk-1);
		
			System.out.println(kth);
	
	}
	public static int QuickSelect(int[] arr, int lo, int hi, int k) {
	    int pivot = arr[hi];
	    int pidx = ArrayPartition(arr,pivot,lo,hi);
	    if(pidx == k){
	      return arr[pidx];
	    }else if(pidx < k){
	      return QuickSelect(arr, pidx + 1, hi, k);
	    }else{
	      return QuickSelect(arr, lo, pidx - 1, k);
	    }
	  }
	
	
 public static int ArrayPartition(int[] arr , int pivot , int lo , int hi)  {
		    
		    int i = lo, j = lo;
		    while (i <= hi) {
		      if (arr[i] <= pivot) {
		        swap(arr, i, j);
		        i++;
		        j++;
		      } else {
		        i++;
		      }
		    }
		    
		    return (j - 1);
		  }
     public static void swap(int[] arr , int i , int j) {
 		int temp = arr[i];
 		arr[i] = arr[j];
 		arr[j] = temp;
 	}
}
