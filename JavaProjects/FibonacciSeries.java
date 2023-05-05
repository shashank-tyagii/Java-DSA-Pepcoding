package JavaProjects;

import java.util.Scanner;

public class FibonacciSeries {

	public FibonacciSeries() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n1 = 0 ; int n2= 1;
		Scanner scn = new Scanner (System.in);
		System.out.println("Please enter the number of Fibonacci series");
		int num = scn.nextInt();
		System.out.println("The number selected is : " + num);
		System.out.println("\n0\n1");
		for (int i =1; i<=(num-2); i++)
		{
		int n3 = n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
		}
		}
		
	}