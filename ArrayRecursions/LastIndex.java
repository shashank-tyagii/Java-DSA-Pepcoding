package ArrayRecursions;

import java.util.Scanner;

public class LastIndex {

	public LastIndex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)  {
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
		int i =indexarray(array, n , x);
		System.out.println(i);
	}
	
	public static int indexarray(int[] array, int n , int x)
	{   if( n==0) {return -1;}
		if (x == array[n-1]) {return n-1 ;}
		else {
		int idx = indexarray(array, n-1, x);
		return idx; }
	}
}