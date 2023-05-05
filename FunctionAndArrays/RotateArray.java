package FunctionAndArrays;

import java.util.Scanner;

public class RotateArray {

	public RotateArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[n];
		for (int i =0 ; i <array.length ; i++)
		{
			array[i] = scn.nextInt();
		}
		System.out.println("Enter the rotate number");
		int k = scn.nextInt();
		int j = array.length-1;
		
		for ( int i =0; i <k ; i++)
		{   
			int temp = array[j];
			for ( int p =j ; p >0 ; p--)
			{   
				array[p]= array[p-1]; 
			}
			array[0] = temp;
		}
		
		for ( int i = 0 ; i <array.length ; i++)
		{
			System.out.print(array[i]); }
	}

}
