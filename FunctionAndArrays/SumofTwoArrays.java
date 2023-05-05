package FunctionAndArrays;
import java.util.Scanner;
public class SumofTwoArrays {

	public SumofTwoArrays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scn = new Scanner(System.in);
     System.out.println("Enter the size of array1");
     int n1 = scn.nextInt();
     System.out.println("Enter the size of array2");
     int n2 = scn.nextInt();
     int z =0; int y =0;
     int array1[] = new int[n1];
     int array2[] =new int[n2];
     System.out.println("Enter the elements of array1");
     for (int i =0; i< array1.length ; i++)
     {
    	 array1[i] = scn.nextInt();
     }
     System.out.println("Enter the elements of array2");
     for (int i =0; i< array2.length ; i++)
     {
    	 array2[i] = scn.nextInt();
     }
     if (n1>n2) { z =n2; y =n1;} else {z =n1; y=n2;}
     int sumArray[] = new int[y];
      for ( int i =0; i< sumArray.length ; i++)
      {  if (i < z) { sumArray[i] = array1[i] + array2[i];  }
         else if ( n1 >n2 ) {sumArray[i] = array1[i]; } 
         else {sumArray[i] = array2[i];} 
      }
      
      for ( int i =0; i< sumArray.length ; i++)
      {
    	  System.out.println(sumArray[i]);
      }
}
}
