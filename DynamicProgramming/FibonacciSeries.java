package DynamicProgramming;
import java.util.Scanner;
public class FibonacciSeries {

	public FibonacciSeries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the nth element");
	int n = scn.nextInt();
	int ans = fib(n , new int[n+1]);
	System.out.println(ans);

	}
	
	public static int fib (int n , int[] qb) {
		if ( n==0 || n ==1) {return n;}
		if (qb[n] !=0) {return qb[n];}
		
		int fib1 = fib(n-1, qb);
		int fib2 = fib(n-2, qb);
		int fibb = fib1 + fib2 ;
		qb[n] = fibb;
		return fibb;
		
	}

}
