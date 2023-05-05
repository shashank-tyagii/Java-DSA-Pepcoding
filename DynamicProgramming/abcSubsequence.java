package DynamicProgramming;

import java.util.Scanner;

public class abcSubsequence {

	public abcSubsequence() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the string");
			String str = scn.next();
			
			countSubs(str);

		}
		
		public static void countSubs(String str) {
			
			int[] dp = new int[str.length()];
			
			int a =0 ; int ab =0 ; int abc = 0;
			for (int i =0 ; i <str.length(); i++) {
				
				if (str.charAt(i) == 'a') {         //	If character is a, the ab and abc will remain unchanged
					  a = 2* a +1;
					  dp[i] = a;
				}
                if (str.charAt(i) == 'b') {         //	If character is b, the a and abc will remain unchanged
                	  ab = 2* ab +a;
                	  dp[i] = ab;
				}
                if (str.charAt(i) == 'c') {         //	If character is c, the a and ab will remain unchanged
	                  abc = 2*abc + ab;
	                  dp[i] = abc;
                 }
				
			}
			
			System.out.println(dp[str.length()-1]);
			
			
	}

}
