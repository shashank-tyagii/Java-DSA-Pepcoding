package Patterns;

import java.util.Scanner;

public class Diagnolline2 {

	public Diagnolline2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        
        for (int i=1; i<=n; i++)
        {
        	for (int j=n; j>i; j--)
        	{
        		System.out.print(" ");
        	}
        	System.out.println("*");
        }
	}

}
