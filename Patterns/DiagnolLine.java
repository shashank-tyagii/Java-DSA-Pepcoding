package Patterns;

import java.util.Scanner;

public class DiagnolLine {

	public DiagnolLine() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        
        for (int i=1; i<=n; i++)
        {
        	for (int j=1; j<i; j++)
        	{
        		System.out.print(" ");
        	}
        	System.out.println("*");
        }

	}

}
