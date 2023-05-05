package FunctionAndArrays;

import java.util.Scanner;

public class DigitFrequency {

	public DigitFrequency() {
		// TODO Auto-generated constructor stub
	}
	
	public static int DigitFrequency(int n, int d) {
		int count = 0;
		while (n>0) {
			int digit = n%10;
			n=n/10;
			if (digit == d) { count++;} else {}
		} return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = scn.nextInt();
    System.out.println("Enter the digit");
    int d = scn.nextInt();
    int f = DigitFrequency(n,d);
    System.out.println(f);
	}

}
