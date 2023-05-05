package DynamicProgramming;
import java.util.Scanner;
public class VariableStairsJump {

	public VariableStairsJump() {
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
        
		stairscountTab (n , array ); 

	}
	
	public static void stairscountTab(int n , int[] array) {
		int[] dp = new int [n+1];
		
		dp[n] =1;
		for (int i =n-1 ; i >=0 ; i--) {
			
			for (int j = array[i] ; j >0 && i + j < dp.length; j--) {
				dp [i] = dp[i] + dp[i +j];
			}
		}
		
		System.out.println(dp[0]);
	}
}
