package FunctionAndArrays;

import java.util.Scanner;

public class ReverseArray2 {

	public ReverseArray2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scn.nextInt();
		int array[] = new int[n];
		for (int i =0 ; i <array.length ; i++)
		{
			array[i] = scn.nextInt();
		}
		 int i =0;
		 int j = array.length-1;
		  while (i <j)
		  {   int temp = array [i];
			  array [i] = array [j];
			  array [j] = temp;
			  i ++ ; j--;
		  }
		  
		  for ( i = 0 ; i <array.length ; i++)
			{
				System.out.print(array[i]);
		
	}

}
}