package Recursion;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Factorial {

	public Factorial() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
        System.out.println(factorial(n));
        
	}
	
	public static int factorial(int n)
	{   if (n==1) { return n =1;}
		int fact = factorial(n-1);
		int num = fact * n;
		return num;
	}

}
