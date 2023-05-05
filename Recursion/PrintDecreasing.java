package Recursion;
import java.util.Scanner;
public class PrintDecreasing {

	public PrintDecreasing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
        printdecreasing(n);
	}
	
	public static void printdecreasing(int n)
	{   
		if( n==0) {return;}
		System.out.println(n);
		printdecreasing(n-1);
	}

}
