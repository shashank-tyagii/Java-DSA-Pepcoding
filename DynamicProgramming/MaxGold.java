package DynamicProgramming;

import java.util.Scanner;

public class MaxGold {

	public MaxGold() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		System.out.println("Enter the array columns");
		int m = scn.nextInt();
		System.out.println("Enter the array elements");
		int[][] array = new int[n][m];
		for(int i =0 ; i <n ; i ++) {
			for (int j =0 ; j <m ; j++) {
			array[i][j] = scn.nextInt(); }
		}
		maxGold(array);
		
        
	}
	
	public static void maxGold(int[][] arr) {
		int n = arr.length; int m = arr[0].length;
		int[][] dp = new int[n][m];
		
		for (int j = m-1 ; j>=0 ; j--) {
		
			for (int i = n-1 ; i>=0 ; i--) {
				
				int max = Integer.MIN_VALUE;
				if ( j == m-1) {max = arr[i][j];}                                           
				
				else if (i ==0 && j <m-1 ) {                                                
				      int x = arr[i][j] + dp[i][j+1];           
				      int y = arr[i][j] + dp[i+1][j+1];
				      max = Math.max( x, y); }
				
				else if ( i == n-1 && j <m-1) {
					  int x = arr[i][j] + dp[i][j+1];           
			          int y = arr[i][j] + dp[i-1][j+1];
			          max = Math.max( x, y);    
			          }      
				else if ( i < n-1 && j <m-1) { 
					  int x = arr[i][j] + dp[i][j+1];           
				      int y = arr[i][j] + dp[i+1][j+1];
				      int z = arr[i][j] + dp[i-1][j+1];
				      max = Math.max( x, y );
				      max = Math.max( max,z);
				      }              
				
				dp[i][j] = max;
			}
		}
		
		int max = dp[0][0];
	      for (int i = 1; i < dp.length; i++) {
	         max = Math.max(max, dp[i][0]);
	      }
	      System.out.println(max);
		
	}

}
