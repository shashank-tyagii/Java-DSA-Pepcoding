package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Stock2transactions {

	public Stock2transactions() {
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
//Maximum from front to end		
		int buy = array[0];
		int sell =array[0];
		int[] dp1 = new int[n];
		dp1[0] = 0;
		
		for (int i = 1 ; i <n ; i++) {                                 
			
			if (array[i] >=buy) { sell = array[i];}
			if (array[i] < buy) { buy = array[i]; sell = array[i];}
			int profit = sell-buy;
			if (profit > dp1[i-1]) {dp1[i] = profit;} else {dp1[i] = dp1[i-1];}
			
		}
// Maximum from back to front
		buy = array[n-1];
		sell =array[n-1];
		int[] dp2 = new int[n];
		dp1[n-1] = 0;
		
        for (int i = n-2 ; i >=0 ; i--) {
			
			if (array[i] > sell) { buy = array[i] ; sell = array[i];}
			if (array[i] < buy) { buy = array[i]; }
			int profit = sell-buy;
			if (profit > dp2[i+1]) {dp2[i] = profit;} else {dp2[i] = dp2[i+1];}
			
		}
// Add both maximum
		int[] dp3 = new int[n];
        for (int i = 0; i<n ; i++) {
        	dp3[i] = dp1[i] + dp2[i];
        }
 // Calculate the maximum value
        int max =Arrays.stream(dp3).max().getAsInt();
		
		System.out.println(max);
		
		
	/*	int buy = array[0];
		int sell =array[0];
		int[] dp = new int[n];
		int maxProfit = 0;
		
		for (int i = 1 ; i <n ; i++) {
			
			if (array[i] > array[i-1]) { sell = array[i];}
			if (array[i] < array[i-1]) { buy = array[i]; sell = array[i];}
			int profit = sell-buy;
			dp[i] = profit;
			
		}
		int max1 =Arrays.stream(dp).max().getAsInt();           // Calculate max profit value
		int x = max1;
		for (int i =0 ; i<n ; i++) {
			int diff = max1- dp[i];
			if (diff <x && diff !=0) { x = diff;}
			
		}
		int max2 = max1-x;
		
		System.out.println(max1 + max2);
		*/	
	}

}
