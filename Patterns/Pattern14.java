package Patterns;

import java.util.Scanner;

public class Pattern14 {

	public Pattern14() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("Please enter value of n");
        int n = scn.nextInt();
        
        for (int i =1; i<=10; i++)
        {
        	System.out.println(n + "*" + i + "=" + (n*i));
        }
        
		
	}

}
