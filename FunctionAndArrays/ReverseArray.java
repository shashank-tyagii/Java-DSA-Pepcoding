package FunctionAndArrays;
import java.util.Scanner;
public class ReverseArray {

	public ReverseArray() {
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
		
		for ( int i = (array.length -1) ; i>=0 ; i--)
		{
			System.out.print(array[i]);
		}
		
	}

}
