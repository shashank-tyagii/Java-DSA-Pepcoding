package FunctionAndArrays;
import java.util.Scanner;
public class SubArrays {

	public SubArrays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int array[] = new int[n];
		for (int i =0 ; i <array.length ; i++)
		{
			array[i] = scn.nextInt();
		}
	// Total number of subsets will be n! 
		
		for (int i =0; i< array.length; i++)                //Start point
		{
			for (int j =i; j<array.length; j++)             //End point
			{       
				for (int k =i; k<=j; k++)                   //Print in between start and end point
				{
					System.out.print(array[k] + "\t");
				}   System.out.println();

			}
		}
		
	}

}
