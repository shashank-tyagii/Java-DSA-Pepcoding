package TimeAndSpaceComplexity;
import java.util.Arrays;
import java.util.Scanner;
public class TargetSumPair {

	public TargetSumPair() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    System.out.println("Enter the array size");
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    System.out.println("Enter the array elements");
	    for (int i = 0; i < n; i++) {
	      arr[i] = scn.nextInt();   }	
	    System.out.println("Enter target size");
	    int target = scn.nextInt();
	    Arrays.sort(arr);
	    targetSumPair(arr, target);
	    
	      }
       public static void targetSumPair(int[] arr , int target) {
    	   int l = 0 , r = arr.length-1;
    	   
    	   while (l<r) {
    		   int sum = arr[l]+arr[r] ;
    		   if ( sum == target) {System.out.println(arr[l] + "," + arr[r]); l++ ; r-- ;}
    		   else if (sum > target) {r-- ;}
    		   else { l ++;}
    		   
    	   }
       }
}
