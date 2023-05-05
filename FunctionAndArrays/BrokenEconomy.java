package FunctionAndArrays;
import java.util.Scanner;
public class BrokenEconomy {

	public BrokenEconomy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[n];
		for (int i =0; i< array.length; i++ )
		{
			array[i] = scn.nextInt();
		}
		System.out.println("Enter the data");
		int data = scn.nextInt();
		
		int l= 0;
		int h =  array.length-1;
	
		while ( l<=h)
		{   int m = (l +h) /2;
			if (array[m] == data) { System.out.println(array[m]); break;}
			else if ( array[m] > data) { h = m -1 ;}
			else  { l = m+1; }
		}
       if ( array[l] != data && array[l]< data) { System.out.println(array[l]);System.out.println(array[l+1]);}
       else {System.out.println(array[l]);System.out.println(array[l-1]);}
	}

}
