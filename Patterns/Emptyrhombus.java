package Patterns;

import java.util.Scanner;

public class Emptyrhombus {

	public Emptyrhombus() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        
        int x = n/2;
        int y = 0;
        int z= n/2;
        for (int i=1; i <=n; i++)
        {   System.out.print("\n");
        	for (int j=0; j<=x; j++)                          //Print stars
        	{
        		System.out.print("*");
        	}
        	for (int j=0; j<y; j++)                           // Print spaces
        	{
        		System.out.print(" ");
        	}
        	System.out.print(" ");                             // Constant Space in between
        	for (int j=0; j<y; j++)                            //print spaces
        	{
        		System.out.print(" ");
        	}
        	for (int j=0; j<=x; j++)                           //print stars
        	{
        		System.out.print("*");
        	}
        	if(i<=(n/2))
        	{
        		x--;                                            //Stars reduce by 1
        		y++;                                            //Spaces increase by 1
        	} else {
        		x++;
        		y--;
        	}
        }
	}

}
