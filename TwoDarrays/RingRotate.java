package TwoDarrays;

import java.util.Scanner;

public class RingRotate {

	public RingRotate() {
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
	}

}
