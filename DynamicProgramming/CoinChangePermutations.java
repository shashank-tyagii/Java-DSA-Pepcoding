package DynamicProgramming;

import java.util.Scanner;

public class CoinChangePermutations {

	public CoinChangePermutations() {
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
		
		CoinPermutation(array , target , new int[target+1] );
	}

	
	public static void CoinPermutation(int[] arr , int target , int[] dp) {
		int n = arr.length;                                                          //No of rows
		int m = dp.length;                                                           //No of columns
		dp[0] =1;
		for (int i = 1 ; i < m ; i++) {                                              //Outside loop is of dp size
			
			for (int j =0; j < n ; j++) {                                            //Inside loop is of array elements 
				if(i- arr[j] >=0) {
			    dp [i] = dp[i] + dp[i- arr[j]]; }
				
			}
			
		}
		System.out.println(dp[target]);
		
	}

}
