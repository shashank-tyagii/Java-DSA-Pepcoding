package ArrayRecursions;

import java.util.Scanner;

public class PrintReverseArray {

	public PrintReverseArray() {
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
		printarray(array,n);
	}
	
	public static void printarray(int[] array , int n)
	{ if(n==0) { return;}
	   System.out.println(array[n-1]);
		printarray(array, n-1);
		
	}
}
