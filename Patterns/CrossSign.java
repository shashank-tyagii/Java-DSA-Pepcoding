package Patterns;

import java.util.Scanner;

public class CrossSign {

	public CrossSign() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        
        int x= n/2;
        int y =1;
        int z =3; 
        for (int i=1; i<=n; i++)
        {    System.out.print("\n");
        	for (int j=1; j<y; j++)
        	{
        		System.out.print(" ");
        	}
        	    System.out.print("*");
        	for (int j=1; j<=z; j++)
        	{
        		System.out.print(" ");
        	}   if (i==3)
        	{} else {
        	    System.out.print("*");}
        	
        	    if ( i <=n/2)
        	    {
        	    	z=z-2;
        	    	y++;
        	    } else {
        	    	z=z+2;
        	    	y--;
        	    }
        	    
        }
	}

}
