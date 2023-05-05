package DynamicProgramming;
import java.util.Scanner;
public class StairsCase123 {

	public StairsCase123() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the nth element");
		int n = scn.nextInt();
        //int count = stairscount (n , new int[n+1]);              //In this question, we have to tell only the count of paths, not the number of paths
        //System.out.println(count);
		stairscountTab (n ); 

	}
    
	public static int stairscount(int n , int [] qb) {
		
		if ( n < 0 )  { return 0 ; }
		if ( n  == 0) { return 1 ; }
		
		if (qb[n] !=0) { return qb[n];}
		
		int x =stairscount(n-1 , qb);
		int y =stairscount(n-2 , qb);
		int z =stairscount(n-3 , qb);
		
		int count = x+y+z;
		qb[n] = count;
		return count;
		
		
	}
	
	public static void stairscountTab(int n) {
		
		int[] dp = new int [n+1];
		dp[0] =1;
		
		for (int i =1 ; i <=n ; i++) {
			if( i == 1) { dp[i] = dp[i-1];}
			else if (i ==2) {dp[i] = dp[i-1] + dp[i-2]; }
			else { dp[i] = dp[i-1] + dp[i-2]+ dp [i-3];}
		}
		
		System.out.println(dp[n]);
	}
}
