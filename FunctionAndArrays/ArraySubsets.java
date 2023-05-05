package FunctionAndArrays;
import java.util.Scanner;
public class ArraySubsets {

	public ArraySubsets() {
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
		int limit = (int)Math.pow(2, n);
		int finalarray[]= new int[n];
		for (int i =0; i< limit ; i++)
		{  int k = decimaltobinary(i);            // convert the decimal to binary
			for (int j =0; j < n; j++)
			{
				int digit = k % 10;              //takeout last digit
				k= k/10;
				finalarray[n-j-1]= digit;        // put into array in reverse order
			}
			for (int j =0; j < n; j++)
			{
				if ( finalarray[j] == 0)  {System.out.print("-");}           // if digit is 0 , print -
				else { System.out.print(array[j]);}                          // if digit is 1, print the value of corresponding element
			} System.out.println();                
		}
	}
	public static int decimaltobinary(int n) {
		int p =1; int sum =0;
		while (n >0)
		{
			int d = n % 2 ; n =n/2;
			sum = sum + d *p;
			p =p*10;
			
		}
		return sum;
	}
}
