package Recursion;

import java.util.Scanner;

public class printIncreasingDecreasing {

	public printIncreasingDecreasing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
        pid(n);
	}
	
	public static void pid(int n)
	{   
		if(n==0 ) {return;}
		System.out.println(n);
		pid(n-1);
		System.out.println(n);
		
		
	}

}