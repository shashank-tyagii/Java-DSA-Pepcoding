package JavaProjects;

import java.util.Scanner;
import java.math.*;

public class InverseNumber {

	public InverseNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scn.nextInt();
        int x= 1; int y =1; float num = 0;
	    while (number > 0)
	    {
	    	int digit = number % 10;                           // remove last digit 
	    	
	    	num = (int)(num + x * Math.pow(10, (digit-1)));    // place value becomes 
	    	
	    	x++;
	    	number = number/10;
	    }
	    System.out.println(num);
	}

}
