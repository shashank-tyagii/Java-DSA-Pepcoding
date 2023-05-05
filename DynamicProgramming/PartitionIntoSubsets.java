package DynamicProgramming;

import java.util.Scanner;

public class PartitionIntoSubsets {

	public PartitionIntoSubsets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int players = scn.nextInt();
		
		System.out.println("Enter the number of teams");
		int teams = scn.nextInt();
		
		int[][] dp = new int[teams+1][players+1];
		
		for (int k =0 ; k <= teams ; k ++) {
			
			for (int n = 0; n <=players ; n++) {
				
				if (n == 0) { dp[k][n] = 0;}
				else if (k == 0) { dp[k][n] = 0;}
				else if (n <k) { dp[k][n] = 0;}
				else if (n == k) {dp[k][n] = 1;}
				else {
					dp[k][n] = dp[k-1][n-1] + k * dp[k][n-1];
				}
				
				
			}
			
		}
		System.out.println(dp[teams][players]);
		
		
	}

}
