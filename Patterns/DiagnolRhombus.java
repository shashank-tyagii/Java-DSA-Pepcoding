package Patterns;
import java.util.Scanner;
public class DiagnolRhombus {

	public DiagnolRhombus() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        System.out.println("Please enter value of n");
	        int n = scn.nextInt();
	        
	        int q = n/2;
	        int x =1;
	        
	        for (int i=1; i <=n; i++)
	        {
	        	for (int j=1; j<=q; j++)                 // print two space in first ;ine
	        	{
	        		System.out.print(" ");
	        	}
	        	for (int j=1; j<=x; j++)
	        	{
	        		System.out.print("*");
	        	}
	        	if (i <= n/2)
	        	{ 
	        		q--;                                // Space is reducing by 1
	        		x=x+2;                              // Stars are increasing by 2
	        	} else {  
	        		q++;                                // Space is increasing by 1
	        		x= x-2;                             // Stars are decreasing by 2
	        	} System.out.println();
	        }

	}
}