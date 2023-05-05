package Patterns;

import java.util.Scanner;

public class Pattern16 {

	public Pattern16() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        int x = 2*n-3;
        for (int i=1; i<=n; i++)
        {   System.out.println();
        	for (int j=1; j<=i;j++)
        	{   if (j!=(n))
        		{System.out.print(j +"\t");} else {break;}
        	}
        	for (int j=1; j<=x;j++)
        	{
        		System.out.print("\t");
        	}
        	for (int j=0; j<i;j++)
        	{ 
        		System.out.print((i-j) + "\t");
        	} x=x-2;
        }
	}

}
