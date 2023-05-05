package DynamicProgramming;

import java.util.Scanner;

public class ArrangeBuildings {

	public ArrangeBuildings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of plots on one side of road");
		int n = scn.nextInt();
		
		countBuildings(n);
	}
	
	public static void countBuildings(int n) {
		// Buildings -0 , Plots 1
		
		int c0 = 1;                               //Total one digit numbers ending with 0
		int c1 = 1;                               //Total one digit numbers ending with 1
		
		for (int i =2 ; i<=n ; i++) {
			int temp = c0;
			c0 = c1;                             // Consecutive buildings are not allowed
			c1 = temp + c1;                      // Consecutive plots are allowed
		}
		
		System.out.println((c0 + c1)* (c0 + c1)); // No of ways = x*x
		
	}

}