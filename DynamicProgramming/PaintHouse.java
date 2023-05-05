package DynamicProgramming;

import java.util.Scanner;

public class PaintHouse {

	public PaintHouse() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		int m = 3;
		System.out.println("Enter the array elements");
		int[][] array = new int[n][m];
		for(int i =0 ; i <n ; i ++) {
			for (int j =0 ; j <3 ; j++) {
			array[i][j] = scn.nextInt(); }
		}
		
		int[][] dp = new int [n][m];
		
		dp[0][0] = array[0][0];
		dp[0][1] = array[0][1];
		dp[0][2] = array[0][2];
		
		for (int i =1 ; i <n ; i++) {
			
			dp[i][0] = array[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = array[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = array[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
				
			}
		
		 System.out.println(Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2])));
			
		}

	}


