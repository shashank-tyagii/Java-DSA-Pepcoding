package TwoDarrays;

import java.util.Scanner;

public class Search2DsortedArray {

	public Search2DsortedArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scn.nextInt();
		int[][] array = new int[n][n];
		System.out.println("Enter the array elements");
		for (int i =0; i<n; i++)
		{
			for (int j =0; j<n; j++)
			{
				array[i][j] = scn.nextInt();
			}
		}
		System.out.println("Enter the element to search");
		int p = scn.nextInt();
		
		for (int i =0; i< n ;i++)
		{
			if (array[i][n-1] >p) 
			    {
				for (int j = n-1 ; j>=0; j--) 
				   {
					if (array[i][j] == p) {System.out.println(i + ", " +j); return;}
				    }
				}
		}
		System.out.println("Not found");

	}

}
