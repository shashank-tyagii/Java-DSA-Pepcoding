package TimeAndSpaceComplexity;
import java.util.Scanner;
public class CountSort {

	public CountSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		    Scanner scn = new Scanner(System.in);
		    System.out.println("Enter the array size");
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    int max = Integer.MIN_VALUE;
		    int min = Integer.MAX_VALUE;
		    System.out.println("Enter the array elements");
		    for (int i = 0; i < n; i++) {
		      arr[i] = scn.nextInt();
		      max = Math.max(max, arr[i]);
		      min = Math.min(min, arr[i]);
		    }
		    countSort(arr,min,max);
		    
		  }
	public static void countSort(int[] arr, int min, int max) {
		   int[] farray = new int[max -min +1]; 
		   int[] ans = new int[arr.length];
		   int count =0;
		   for ( int i =min ; i<=max ; i++) {
			   for( int j =0 ; j < arr.length ; j++) {
				   if ( i == arr[j]) { count ++ ; farray[i-min] = count;}       //Count value will keep on adding to incorporate prefix sum. It will tell the index, since we re starting from 0
			   }
		   }
		   for( int j =0 ; j < farray.length ; j++) { farray[j]-- ;}            //Converting to Index i.e Subtracting 1 from each farray value
		   
		   
		    //stable sorting(filling ans array)
		    for(int i = arr.length - 1; i >= 0; i--){
		      int pos = farray[arr[i] - min];
		      ans[pos] = arr[i];
		      farray[arr[i] - min]--;
		    }
			
		   for (int i = 0; i < ans.length; i++) {
			      System.out.println(ans[i]); }
		    
		  }


}
