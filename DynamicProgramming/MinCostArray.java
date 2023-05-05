package DynamicProgramming;
import java.util.Scanner;
public class MinCostArray {

	public MinCostArray() {
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
		minCost(array);
		
        
	}
	
	public static void minCost(int[][] arr) {
		int n = arr.length; int m = arr[0].length;
		int[][] dp = new int[n][m];
		
		for (int i = n-1 ; i>=0 ; i--) {
	
			for (int j = m-1 ; j>=0 ; j--) {
				int min = Integer.MAX_VALUE;
				if ( i == n-1 && j == m-1) {min = arr[i][j];}                     // Target location
				else if (i < n-1 && j <m-1) {                                     // Any location in the matrix
				      int x = arr[i][j] + dp[i+1][j];           
				      int y = arr[i][j] + dp[i][j+1];
				      min = Math.min( x, y); }
				else if ( i == n-1) { min = dp[i][j+1] + arr[i][j];}              // Last row
				else if ( j == m-1) { min = dp[i+1][j] + arr[i][j];}              // Last column
				
				dp[i][j] = min;
			}
		}
		
		System.out.println(dp[0][0]);
		
	}

}
