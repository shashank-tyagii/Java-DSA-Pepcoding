package Patterns;

import java.util.Scanner;

public class Pattern18Sandwatch {

	public Pattern18Sandwatch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        int x = n; int y=0;
        for (int i=1; i<=n; i++)
        {
        	for (int j=1; j<=y; j++)
        	{
        		System.out.print("\t");
        	}
        	for (int j=1; j<=x; j++)
        	{ 
        		if ( i>1 && i<=n/2 && j>1 && j<x) {System.out.print("\t"); }
        		else {System.out.print("*\t");}
        	}if (i<=n/2) { y++; x=x-2;} else {y--; x=x+2;}
        	System.out.print("\n");
        }
	}

}
