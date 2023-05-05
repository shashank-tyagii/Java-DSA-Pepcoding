package FunctionAndArrays;
import java.util.Scanner;
public class ArraySpan {

	public ArraySpan() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		System.out.println("Please enter the array size");
		int n = scn.nextInt();
        
		int[] array = new int[n];
		System.out.println("Please enter the array elements");
		
		for (int i =0; i<n ; i++)
		{
			array [i] = scn.nextInt();
		}
		
		int max = array[0];
		int min = array[0];
		
		for (int i =0; i<n; i++)
		{
			if ( array[i] > max) { max = array[i];} else {}
			if ( array[i] < min) { min= array[i]; } else {}
		}
		int difference = max- min;
		System.out.println("The span of the array is : " + difference);
	}
}

		