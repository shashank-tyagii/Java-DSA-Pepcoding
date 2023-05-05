package Patterns;

import java.util.Scanner;

public class Pattern10Linediagnolrhombus {

	public Pattern10Linediagnolrhombus() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        int x =2;
        int y =1;
        		
        for (int i=1; i<=n ; i++)
        {   System.out.print("\n");
        	for (int j=x; j>=1; j--)
        	{
        		System.out.print(" ");
        	}   System.out.print("*");
        	for (int j=1; j<y; j++)
        	{
        		System.out.print(" "); }
        	   if ( i==1 || i==n)
        		   {} else {System.out.print("*");}
        	    
        	  if( i <= n/2)
        	  {
        		  x--;
        		  y =y+2;
        	  } else {
        		  x++;
        		  y= y-2;
        	  }
        }
	}

}
