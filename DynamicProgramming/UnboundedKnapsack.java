package DynamicProgramming;

import java.util.Scanner;

public class UnboundedKnapsack {

	public UnboundedKnapsack() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of items");
		int n = scn.nextInt();
		System.out.println("Enter the values of items");
		int[] array1 = new int[n];
		for(int i =0 ; i <n ; i ++) {
			array1[i] = scn.nextInt(); 
		}
		
		System.out.println("Enter the weight of items");
		int[] array2 = new int[n];
		for(int i =0 ; i <n ; i ++) {
			array2[i] = scn.nextInt(); 
		}
		System.out.println("Enter the target bag weight");
		int target = scn.nextInt();
		
		maxValue(array1, array2, target);

	}
	
	public static void maxValue(int[] arr1 , int[] arr2 , int target) {
		//Since duplicacy is allowed, the dp matrix will be a 1-D matrix
		//Since we need to calculate the value, both permutation way & combination way will give the same results.
		//Meaning : Max value upto ith element
		int[] dp = new int[target+1];
		int n= target , m= arr1.length;
		dp[0] = 0; int max =0;
		for (int i = 1 ; i <= n ; i++) {
			
			for (int j = 0; j <m ; j++) {
			if (arr2[j] <=i) { 
				int z = arr1[j] + dp[i-arr2[j]] ;
				if (z >max) {max =z;}    	
				
				
			}
			dp[i] = max;
		}
		
}                System.out.println(dp[n]);
}
}

