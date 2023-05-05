package DynamicProgramming;
import java.util.Scanner;
public class FriendsPairing {

	public FriendsPairing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of friends");
		int n = scn.nextInt();
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		for (int i =3 ; i <=n ; i++) {
			dp[i] = dp[i-1] + (i-1) * dp[i-2];
		}
		
		System.out.println(dp[n]);

	}

}
