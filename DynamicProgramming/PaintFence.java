package DynamicProgramming;

import java.util.Scanner;

public class PaintFence {

	public PaintFence() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		System.out.println("Enter the number of colors");
		int k = scn.nextInt();
		
		int[][] dp = new int [3][n+1];
		dp[0][1] = 0;
		dp[1][1] = k;
		dp[2][1] = k;
        for (int i =2; i <=n ; i++) {
		dp[0][i] = dp[1][i-1];
		dp[1][i] = dp[2][i-1] * (k-1);
		dp[2][i] = dp[0][i] + dp[1][i];
        }
        
        
        System.out.println(dp[2][n]);
		
		
	}

}
