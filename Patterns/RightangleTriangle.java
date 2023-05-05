package Patterns;


import java.util.Scanner;

public class RightangleTriangle {

	public RightangleTriangle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn= new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = scn.nextInt();
    
    for (int i=1; i<=n ; i++)
    {  System.out.print("\n*");
    	for (int j=2 ; j<=i ; j++)
    	{
    		System.out.print("*");
    	}
    	
    }
	}

}
