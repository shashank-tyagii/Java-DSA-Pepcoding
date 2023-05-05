package FunctionAndArrays;

import java.util.Scanner;

public class FirstandlastIndex {

	public FirstandlastIndex() {
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
		int l =0;
		int h = array.length -1;
		int lowLimit =0; int highLimit=0;
        while (l<=h)
        {  int m = (l+h)/2;
        	if ( array[m] == data) { 
        	int y =m; int z =m;lowLimit = m; highLimit = m; 
        	while (array [y] == array[y-1]) { y--; lowLimit--;}
        	while (array [z] == array[z+1]) { z++; highLimit++;} break;
        		}
        	else if ( array[m] < data) {l = m+1;}
        	else { h = m-1; }
        	
	} System.out.println(lowLimit); System.out.println(highLimit);

}
}
