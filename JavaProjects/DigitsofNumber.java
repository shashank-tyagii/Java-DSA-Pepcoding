package JavaProjects;

import java.util.Scanner;

public class DigitsofNumber {

	public DigitsofNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int digit=0;
		Scanner scn = new Scanner (System.in);
		System.out.println("Please enter any natural number");
		int x = scn.nextInt();
		int num =x;
		
		while ((num %10) !=0 && num !=0)
		{
	      digit = digit + (num %10) ;                //reversing the number 
	      if (num <10)
	      {digit= digit;}
else
	      {digit = digit * 10;}
	      num = num/10;
		}
         
         while ((digit %10) !=0 && digit !=0)
         {
        	 int a = digit %10;
        	 System.out.println(a);
        	 digit = digit/10;
         }
         
	}

}
