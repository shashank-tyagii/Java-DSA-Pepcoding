package DynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class StockKtransactions {

	public StockKtransactions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of days");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[n];
		for(int i =0 ; i <n ; i ++) {
			array[i] = scn.nextInt(); 
		}
		System.out.println("Enter the number of transactions");
		int t = scn.nextInt();

		int[][] dp = new int[t+1][n];
		
		for (int i = 0 ; i<=t  ; i++) {
			
			for (int j = 0 ; j < n ; j++) {
				
				if ( i ==0 || j == 0) {dp[i][j] = 0;}
				else {
				int max1 = dp[i][j-1]; int max2=0;
				
				for(int k= j-1 ; k>=0 ; k--) {
					
					int maxx = array[j]- array[k] + dp[i-1][k];
					if( maxx > max2) { max2 = maxx;}
					
				}
				
				dp[i][j] = Math.max(max1, max2); }
				
			}
		}
		
		System.out.println(dp[t][n-1]);
		
		

	}

}
