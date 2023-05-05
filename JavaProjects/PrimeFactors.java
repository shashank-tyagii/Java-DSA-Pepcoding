package JavaProjects;


import java.util.Scanner;
import java.math.*;

public class PrimeFactors {

	public PrimeFactors() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	
      Scanner scn = new Scanner(System.in);
      System.out.println("Please enter the number ");
      int n = scn.nextInt();
      int i =2;
      while (n >1)
      {
    	 int rem = n % i;
    	 if (rem ==0)
    	 { n= n/i;
    	  System.out.println(i);
    	  i=2; }
    	 else
    	 { i++;}
    	 }
      }
	}

