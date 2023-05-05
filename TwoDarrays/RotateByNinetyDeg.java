package TwoDarrays;

import java.util.Scanner;

public class RotateByNinetyDeg {

	public RotateByNinetyDeg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows[1] : m1");
		int m1 = scn.nextInt();
		System.out.println("Enter Columns[1] : n1");
		int n1 = scn.nextInt();
		System.out.println("Enter elements of array1");
		int[][] array = new int[m1][n1];
		for (int i=0; i< array.length; i++)
		{
			for (int j=0; j< array[0].length ; j++)
			{
				array [i][j]= scn.nextInt();
			}
		}
		for (int i =0; i < array.length; i++)
		{
			for (int j=0; j<i; j++)           //Transpose of a matrix
			{
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i]= temp;
			}
		}
		for (int j =0; j < (m1/2); j++)
		{
			for (int i=0; i< m1; i++)           //Reversing the columns
			{         
				int temp = array[i][j];
				array[i][j] = array[i][m1-j-1];
				array[i][m1-j-1]= temp;
			}
		}
		
		for (int i =0; i < array.length; i++)
		{
			for (int j=0; j< array[0].length; j++)           //Reversing the columns
			{         
				System.out.print(array[i][j] + "\t");
				
			} System.out.println();
		}
		
		

	}

}
