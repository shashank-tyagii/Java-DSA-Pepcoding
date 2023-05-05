package FunctionAndArrays;
import java.util.Scanner;
public class InverseArray {

	public InverseArray() {
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
		int invArray[] = new int[n];
		
		for ( int j =0; j< array.length ; j++)
		{   
			int y = array[j];
			invArray[y] = j;
		}
		for ( int k = 0 ; k <invArray.length ; k++)
		{
			System.out.print(invArray[k]); }
	}

}
