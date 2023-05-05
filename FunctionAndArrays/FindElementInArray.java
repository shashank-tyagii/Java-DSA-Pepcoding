package FunctionAndArrays;
import java.util.Scanner;
public class FindElementInArray {

	public FindElementInArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner (System.in);
    System.out.println("Please enter the array size");
    int n = scn.nextInt();
    System.out.println("Please enter the array elements");
    int array[] = new int [n];
    
    for (int i=0; i <array.length ; i++ )
    {
    	array[i] = scn.nextInt();
    }
    
    System.out.println ("Please enter the number you want to search");
    int x = scn.nextInt(); int z = -1;
    
    for (int i =0; i< array.length ; i++)
    {
    	if (array[i] == x) { z =i; break; } else { z= -1;}
    }
    System.out.println(z);
	}

}
