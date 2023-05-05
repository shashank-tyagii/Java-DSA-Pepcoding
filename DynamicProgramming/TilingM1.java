package DynamicProgramming;

import java.util.Scanner;

public class TilingM1 {

	public TilingM1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the length of floor");
		int n = scn.nextInt();
		System.out.println("Enter the width of floor");
		int m = scn.nextInt();
		
		int[] dp = new int[n+1];
		for (int i=0 ; i <m ; i ++) {
			dp[i] = 1;
		}
		for (int i=m ; i <=n ; i ++) {
			dp[i] = dp[i-1] + dp[i-m];
		}
		
		System.out.println(dp[n]);

	}

}
