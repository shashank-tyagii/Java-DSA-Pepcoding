package DynamicProgramming;
import java.util.Scanner;
public class TargetSumSubset {

	public TargetSumSubset() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[n];
		for(int i =0 ; i <n ; i ++) {
			array[i] = scn.nextInt(); 
		}
		System.out.println("Enter the target element");
		int target = scn.nextInt();
		
		targetSum(array , target , new boolean[n+1][target+1] );
	}

	
	public static void targetSum(int[] arr , int target , boolean[][] dp) {
		int n = dp.length;                                                   //No of rows
		int m = dp[0].length;                                                //No of columns
		
		for (int i = 0 ; i < n ; i++) {
			
			for (int j =0; j <m ; j++) {
				
				if (j == 0) { dp [i][j] =true ; }                            //First column, all zero possible
				else if (i == 0 && j>0 ) { dp [i][j] = false;}               //First row, all impossible because subset of 0 is only zero
				else if ( i>0 && j >0 ) {                                    //Any element
					                       int x = arr[i-1];                 
					                       if (dp[i-1][j]== true) {dp [i][j] = true;}  //If it's true in previous row, it's true then
					                       if (j >=x ) { if( x == j || dp[i-1][j-x] == true ) {dp [i][j] = true;} }   // If it's 0 or x, depending
				}
				
				
			}
			
		}
		System.out.println(dp[n-1][m-1]);
		
		
	}

}
