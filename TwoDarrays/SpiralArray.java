package TwoDarrays;
import java.util.Scanner;
public class SpiralArray {

	public SpiralArray() {
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows[1] : m1");
		int m1 = scn.nextInt();
		System.out.println("Enter Columns[1] : n1");
		int n1 = scn.nextInt();
		System.out.println("Enter elements of array1");
		int[][] array = new int[m1][n1];
		for (int i=0; i< array.length; i++)
		{
			for (int j=0; j< array[0].length ; j++)
			{
				array [i][j]= scn.nextInt();
			}
		}
		int x =0;
		if (m1 %2 ==0) {x = m1/2; } else { x= m1/2 +1;}
		int i =0; int j =0; int k =0;
		for (k=0; k<x; k++)
		{
		//	if (m1-k<=k) {break;}
		for ( i =k ; i< m1-k ; i++)
		{   
			int digit = array[i][j];
			System.out.println(digit); }
		  i= m1-k-1;
		 //if (n1-k <= k+1) { break;}
		for ( j =k +1 ; j< n1-k ; j++)
		{   
			int digit = array[i][j];
			System.out.println(digit); }
		j= n1-k-1;
		 //if (k <= m1-1-k) {break;}
		for ( i =m1-1-k-1 ; i>=k ; i--)
		{   
			int digit = array[i][j];
			System.out.println(digit);  }
		i = k;
		 //if (k+1 <= n1-1-k) {break;}
		for ( j =n1-1-k-1 ; j>=k+1 ; j--)
		{   
			int digit = array[i][j];
			System.out.println(digit);  }
		j= k+1;
		}	
			

	}

}
