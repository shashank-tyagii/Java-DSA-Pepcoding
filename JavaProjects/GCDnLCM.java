package JavaProjects;

import java.util.Scanner;
import java.math.*;

public class GCDnLCM {

	public GCDnLCM() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 System.out.println("Please enter the first number");
	 		int x = scn.nextInt();
	 System.out.println("Please enter the second number");
	 		int y = scn.nextInt();	
     int lcm =1 ; int hcf =1;
//Program for HCF
	 	for( int i=x; i>=1; i--)
	 	{   int a = x % i;
	 	    int b = y % i;
	 		if (a==0 && b==0)
	 		{ hcf =i;
	 		break; }
	 	}
	 	System.out.println(hcf);
//Program for LCM
	 	lcm = (x*y)/hcf ;
	 	System.out.println(lcm);
	}

}
