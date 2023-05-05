package DynamicProgramming;

import java.util.Scanner;

public class MinStairsMoves {

	public MinStairsMoves() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of stairs");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[n+1];
		for(int i =0 ; i <n ; i ++) {
			array[i] = scn.nextInt();
		}
        
		stairsminJump (n , array ); 

	}
	
	public static void stairsminJump(int n , int[] arr) {
		Integer[] dp = new Integer[n + 1];
	      dp[n] = 0;

	      for (int i = n - 1; i >= 0; i--) {
	         if (arr[i] > 0) {                                            //Ignore cases which have null parameter
	            int min = Integer.MAX_VALUE;                              //Sets minimum value as some random maximum number

	            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
	               if(dp[i + j] != null){                                 //Ignore those places which have null in them
	                  min = Math.min(min, dp[i + j]);
	               }
	            }

	            if(min != Integer.MAX_VALUE){                            //If at all places there was null, then minimum value will nor change
	               dp[i] = min + 1;
	            }
	         }
	      }

	      System.out.println(dp[0]);
	   }

	}