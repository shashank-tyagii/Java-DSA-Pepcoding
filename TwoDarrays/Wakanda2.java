package TwoDarrays;

import java.util.Scanner;

public class Wakanda2 {

	public Wakanda2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array size : m");
		int m = scn.nextInt();
		System.out.println("Enter elements of array");
		int[][] array = new int[m][m];
		for (int i=0; i< array.length; i++)
		{
			for (int j=0; j< array[0].length ; j++)
			{
				array [i][j]= scn.nextInt();
			}
		}
		int x = 0; int y=0;
		for (int i=0; i <m; i++) 
		{ 
			for (int j=(m-1); j>=i; j--)
			{   
				System.out.println(array[x][y]);
				x++;y++;
			} y =i+1; x=0;
			
		}

	}

}
