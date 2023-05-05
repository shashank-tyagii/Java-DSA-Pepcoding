package TwoDarrays;

import java.util.Scanner;

public class Wakanda1 {

	public Wakanda1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows[1] : m1");
		int m1 = scn.nextInt();
		System.out.println("Enter Columns[1] : n1");
		int n1 = scn.nextInt();
		System.out.println("Enter elements of array1");
		int[][] array1 = new int[m1][n1];
		for (int i=0; i< array1.length; i++)
		{
			for (int j=0; j< array1[0].length ; j++)
			{
				array1 [i][j]= scn.nextInt();
			}
		}
		
		for (int j=0; j<n1; j++)
		{
			for (int i =0; i <m1; i++)
			{  if (j %2 ==0) {System.out.print(array1[i][j]);}
			   else {System.out.print(array1[m1-1-i][j]);}
			}   System.out.println();
		}

	}

}
