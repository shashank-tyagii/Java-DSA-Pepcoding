package DynamicProgramming;

import java.util.Scanner;

public class FractionalKnapsack {

	public FractionalKnapsack() {
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
		//Since duplicacy is not allowed, the dp matrix will be a 2d matrix
		//Meaning : Max value possible upto that j weight with all <=i bags
		float[][] dp = new float[arr1.length+1][target+1];
		int n= target , m= arr1.length;
		
		for (int i = 1 ; i <= m ; i++) {
			int x = arr1[i-1] , y = arr2[i-1];
			float max =0;
			for (int j = 1; j <=n ; j++) {
				
				if (j<y) { 
					float max1= x * j /y;                   
					float max2 = dp[i-1][j];
					max = Math.max(max1, max2);}
				
				else {
				    float max1 = dp[i-1][j];                //If it opts not to be put
					float max2 = x + dp[i-1][j-y];          //If it opts to be put into bag
					max = Math.max(max1, max2);    	
			}        
				   dp[i][j] = max;	
		}
		
	}
		System.out.println(dp[m][n]);
}
}
