package Patterns;

import java.util.Scanner;

public class Pattern15 {

	public Pattern15() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        int x = n/2;
        int y =1;
        int z =0;
        for (int i =1; i<=n; i++)
        {  if (i<=(1+n/2)) {z=i; } else { z= n+1-i;}  
        	for (int j =1 ; j<=x; j++)
        	{ System.out.print("\t");}
        	for (int j =1; j<=y; j++)
        	{   
        		System.out.print(z + "\t");
            	
        	  if (j<=y/2) { z++;}  else {z--;}
        	  
        	}
        	
        	if (i <= n/2)
        	{ x-- ; y=y+2;} 
        	else
        	{x++ ; y=y-2;}
        	System.out.print("\n");
        }   
        
	}

}
