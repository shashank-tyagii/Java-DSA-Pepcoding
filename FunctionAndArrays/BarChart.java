package FunctionAndArrays;
import java.util.Scanner;
public class BarChart {

	public BarChart() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the array size");
    int n = scn.nextInt();
    System.out.println("Enter the array elements");
    int array[] = new int[n];
    int max = array[0];
    for (int i =0; i< array.length ; i++)                    
    {
    	array[i] = scn.nextInt();
    }
    for (int i =0; i < array.length; i++)                             // Calculating the maximum array number
    {
    	if (array[i] > max) { max = array[i]; } else { }
    }
     
    for ( int i = max; i >0; i--)                                    // from maximum number
    {
    	for ( int j =0; j < array.length ; j++)
    	{
    		if ( array [j] >= i ) { System.out.print("*\t");} else {System.out.print("\t");}   //If element is greater than the rowth
    	}
    	System.out.println();
    }
    
	}

}
