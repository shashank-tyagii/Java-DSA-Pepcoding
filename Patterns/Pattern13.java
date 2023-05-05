package Patterns;

import java.util.Scanner;

public class Pattern13 {

	public Pattern13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        
        for( int i =0; i<n ; i++)
        {   int val = 1;                                         //First term is always 1
        	for (int j =0; j<=i; j++)
        	{   System.out.print(val + "\t");
        	   val= (val * (i-j))/(j+1);                        // nCk+1 = nCk * (n-k)/(k+1)
        	}
        	    System.out.print("\n");
        	}   
        } 
	}
