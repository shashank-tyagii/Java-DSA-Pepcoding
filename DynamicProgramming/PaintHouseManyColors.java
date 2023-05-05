package DynamicProgramming;

import java.util.Scanner;

public class PaintHouseManyColors {

	public PaintHouseManyColors() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		System.out.println("Enter the number of colors");
		int m = scn.nextInt();
		System.out.println("Enter the array elements");
		int[][] array = new int[n][m];
		for(int i =0 ; i <n ; i ++) {
			for (int j =0 ; j <3 ; j++) {
			array[i][j] = scn.nextInt(); }
		}
		
		int[][] dp = new int [n][m];
		
		for (int j =0 ; j < m ; j++) {
		dp[0][j] = array[0][j];       }
		
		for (int i =1 ; i <n ; i++) {
			
			for (int j =0 ; j <m ; j++) {
				int min = Integer.MAX_VALUE;
				for(int k =0 ; k < m ; k ++) {
					if (k !=j) {if (dp[i-1][k] < min) {min = dp[i-1][k];}}
				}
				
			dp[i][j] = array[i][j] + min; }
				
			}
		int minimum = Integer.MAX_VALUE;
		 for (int j =0 ; j<m ; j++) {
			 if (dp[n-1][j] < minimum) {minimum = dp[n-1][j];}
		 }
		 System.out.println(minimum);
			
		}

	}



