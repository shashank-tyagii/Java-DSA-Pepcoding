package Patterns;


import java.util.Scanner;

public class rightangle3 {

	public rightangle3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        
        for (int i=1 ; i<=n ; i++)
        {   System.out.print("\n");
        	for (int j =1; j<i; j++)
        	{
        		System.out.print(" ");
        	}
        	for (int k =n; k>=i; k--)
        	{
        		System.out.print("*");
        	}
        	
        }
	}

}
