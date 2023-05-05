package Patterns;

import java.util.Scanner;

public class Pattern17Arrowsign {

	public Pattern17Arrowsign() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        int x=2; int y =n/2; int z=1;
        
        for (int i=1; i<=n ;i++)
        {  if(i != (y+1)) 
             { for (int j=1; j<=y; j++)
    	             {System.out.print("\t");}}
               else { for (int j=1; j<=y; j++)
    	            { System.out.print("*\t");} }
        	for (int j=1; j <=z; j++ )
        	{
        		System.out.print("*\t");
        	}
        	if (i<=n/2) { z++;} else {z--;}
        	System.out.print("\n");
        }
	}

}
