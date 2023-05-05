package ArrayRecursions;

import java.util.Scanner;

public class ArrayMaximum {

	public ArrayMaximum() {
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
		int x =maxarray(array, n);
		System.out.println(x);
	}
	
	public static int maxarray(int[] array, int n)
	{   if (n ==0) { return 1;}
	    int max = maxarray(array, n-1);           //Consider we know the max of n-1 size array. Then we only need to compare it with the n-1 element
	    if (max < array[n-1])
	    {
	    	max = array[n-1];
	    }
		return max;
	}
}
