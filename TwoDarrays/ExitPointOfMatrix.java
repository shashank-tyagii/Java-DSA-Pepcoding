package TwoDarrays;

import java.util.Scanner;

public class ExitPointOfMatrix {

	public ExitPointOfMatrix() {
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
		
		int dir = 0;
		int i=0; int j =0;
		while (array[i][j] == 0 || array[i][j] == 1)
		{   dir = (dir + array[i][j]) /4; 
			if (dir == 0) {j++;}
			else if(dir ==1) { i++;}
			else if (dir ==2) {j--;}
			else if(dir ==3) {i--;}
		}
		System.out.println(i+1); System.out.println(j+1);

	}

}
