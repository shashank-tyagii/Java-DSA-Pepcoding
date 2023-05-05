package JavaProjects;

import java.util.Scanner;
import java.math.*;

public class PythagoreanTriplet {

	public PythagoreanTriplet() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First number");
		int x = scn.nextInt();
		System.out.println("Enter Second number");
		int y = scn.nextInt();
		System.out.println("Enter Third number");
		int z = scn.nextInt();
		
		int x1 = x*x;
		int y1 = y*y;
		int z1 = z*z;
		
		if (((x1 + y1) == z1 ) || ((x1 + z1) == y1 ) || ((z1 + y1) == x1 ))
		{System.out.println("True");}
		else {System.out.println("False");}
		
	}

}
