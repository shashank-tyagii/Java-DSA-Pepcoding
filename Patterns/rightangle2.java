package Patterns;

import java.util.Scanner;

public class rightangle2 {

	public rightangle2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scn= new Scanner(System.in);
	    System.out.println("Enter the value of n : ");
	    int n = scn.nextInt();
	    
	    for (int i=1; i<=n ; i++)
	    {  System.out.print("\n");
	    	for (int j=(n-i) ; j>=1 ; j--)
	    	{
	    		System.out.print("*");
	    	}
	    	for(int k =1; k<=i;k++)
	    	{
	    		System.out.print("o");
	    	}
	    }
		}
	}
