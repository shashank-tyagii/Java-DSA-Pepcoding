package FunctionAndArrays;

import java.util.Scanner;

public class DifferenceOfTwoArrays {

	public DifferenceOfTwoArrays() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	     System.out.println("Enter the size of array1");
	     int n1 = scn.nextInt();
	     System.out.println("Enter the size of array2");
	     int n2 = scn.nextInt();
	     int z =0; int y =0; int c =0;
	     int array1[] = new int[n1];
	     int array2[] =new int[n2];
	     System.out.println("Enter the elements of array1");
	     for (int i =0; i< array1.length ; i++)
	     { array1[i] = scn.nextInt();}
	     System.out.println("Enter the elements of array2");
	     for (int i =0; i< array2.length ; i++)
	     { array2[i] = scn.nextInt();}
	     
	     int differenceArray[] = new int[n1 >n2 ? n1:n2];        //if n1>n2, then n1 else n2
	     int i = array1.length -1;
	     int j = array2.length -1;
	     int k = differenceArray.length -1;
	     
	     while (k >=0)
	     {
	    	 int d = c;
	    	 if (i >=0) { d = d + array1[i];}
	    	 if (j >=0) { d = d - array2[j];}
	    	 
	    	 if (d < 0) {d = d+10; c=-1;} else {c=0; d=d;}
	    	 differenceArray[k] = d;
	    	 i-- ; j--; k--;
	     }
	     if (c!=0) {System.out.println (c);}
	     for (i =0 ; i < differenceArray.length; i++)
	     {
	    	 System.out.println (differenceArray[i]);
	     }
}
	}
