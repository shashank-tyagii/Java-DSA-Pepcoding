package ArrayRecursions;

import java.util.Scanner;

public class AllindicesofArray {

	public AllindicesofArray() {
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n= scn.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[n];
		for (int i =0; i<n; i++)
		    {
			array[i] = scn.nextInt();
			}
		System.out.println("Enter the element to search");
		int x= scn.nextInt();
		indexarray(array, n , x);
	}
	
	public static void indexarray(int[] array, int n , int x)
	{   if( n==0) {return;}
		if (x == array[n-1]) {System.out.println(n-1) ;}
		indexarray(array, n-1, x); 
	}
}