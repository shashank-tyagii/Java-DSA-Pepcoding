package DynamicProgramming;
import java.util.Scanner;
public class CountBinary {

	public CountBinary() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string length");
		int n = scn.nextInt();
		
		countStringlength(n);
	}
	
	public static void countStringlength(int n) {
		
		int c0 = 1;                               //Total one digit numbers ending with 0
		int c1 = 1;                               //Total one digit numbers ending with 1
		
		for (int i =2 ; i<=n ; i++) {
			int temp = c0;
			c0 = c1;                             // Consecutive zeroes are not allowed
			c1 = temp + c1;                      // Consecutive ones are allowed
		}
		
		System.out.println(c0 + c1);
		
	}

}
