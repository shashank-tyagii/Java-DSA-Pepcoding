package DynamicProgramming;
import java.util.Scanner;
public class CountEncodings {

	public CountEncodings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.next();
		
		countEncodings(str);

	}
	
	public static void countEncodings(String str) {
		
		//Example : 1232005
		
		int[] dp = new int[str.length()+1];
		dp[0] = 1 ;                         //If length =1, encodings =1, for length 0, encodings should be 0 but on adding any character it'll turn 1
		for (int i =1 ; i <str.length() ; i++) {
			
			if (str.charAt(i) == '0' && str.charAt(i-1) == '0') { dp [i] =0;}       // i= 5, charAt(5) = 0 and charAt(4) =0. There's no character associated with 0 or 00
			else if (str.charAt(i) == '0' && str.charAt(i-1) != '0') {              // i =4  charAt(4) = 0 and charAt(3) =2 . There's character associated with 20 but not with 0.
				     if (str.charAt(i-1) == '1' ||str.charAt(i-1) == '2' ) {dp[i] = dp[i-2];} }
			else if (str.charAt(i) != '0' && str.charAt(i-1) == '0') { dp[i] = dp[i-1] ;}
			else {    if (Integer.parseInt(str.substring(i-1, i+1) ) <=26) {
				            dp[i] = dp[i-1] +  (i >=2? dp[i-2] : 1) ;}             //Conditional if i >=2
			          else { dp[i] = dp[i-1];}
			    }
			
		}
		System.out.println(dp[str.length()-1]);
		
		
	}

}
