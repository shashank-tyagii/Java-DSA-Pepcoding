package Recursion;
import java.util.Scanner;
public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    System.out.println("Enter the nth element");
	    int n = scn.nextInt();
	    int ans = fib(n);
	    System.out.println(ans);

	}
	
	public static int fib(int n) {
		if( n ==0 || n ==1) { return n;}
		int fib1 = fib(n-1);
		int fib2= fib(n-2);
		int fibb = fib1 + fib2;
		return fibb;
	}

}
