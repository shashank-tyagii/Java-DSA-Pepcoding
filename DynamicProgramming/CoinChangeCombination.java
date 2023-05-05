package DynamicProgramming;

import java.util.Scanner;

public class CoinChangeCombination {

	public CoinChangeCombination() {
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
		
		CoinCombination(array , target , new int[target+1] );
	}

	
	public static void CoinCombination(int[] arr , int target , int[] dp) {
		int n = arr.length;                                                              //No of rows
		int m = dp.length;                                                           //No of columns
		
		for (int i = 0 ; i < n ; i++) {                     //Outside loop is array elements
			int x = arr[i];
			dp[0] =1;
			for (int j =x; j <m ; j++) {                    //Important to have a coin of that row in combination. So starting from x
			
				dp[j] = dp[j] + dp[j-x];
				
			}
			
		}
		System.out.println(dp[target]);

		
		
		
	}

}
