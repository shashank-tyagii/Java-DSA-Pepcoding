package Recursion;

import java.util.Scanner;

public class PrintZigZg {

	public PrintZigZg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		pzz(n);
	}
	 public static void pzz(int n) {
		    if(n == 0){
		      return;
		    }
		    
		    System.out.print(n + " ");                     //Pre
		    pzz(n - 1);                                    //Left call
		    System.out.print(n + " ");                     //In
		    pzz(n - 1);                                    //Right call
		    System.out.print(n + " ");                     //Post
		  }
}
