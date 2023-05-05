package TwoDarrays;
import java.util.Scanner;
public class MatrixMultiplication {

	public MatrixMultiplication() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Rows[1] : m1");
		int m1 = scn.nextInt();
		System.out.println("Enter Columns[1] : n1");
		int n1 = scn.nextInt();
		System.out.println("Enter elements of array1");
		int[][] array1 = new int[m1][n1];
		for (int i=0; i< array1.length; i++)
		{
			for (int j=0; j< array1[0].length ; j++)
			{
				array1 [i][j]= scn.nextInt();
			}
		}
		System.out.println("Enter Rows[2] : m2");
		int m2 = scn.nextInt();
		System.out.println("Enter Columns[2] : n2");
		int n2 = scn.nextInt();
		System.out.println("Enter elements of array2");
		int[][] array2 = new int[m2][n2];
		for (int i=0; i< array2.length; i++)
		{
			for (int j=0; j< array2[0].length ; j++)
			{
				array2 [i][j]= scn.nextInt();
			}
		}

	      if (n1 != m2) {
	         System.out.println("Invalid input");
	         return;}
		
		int [][] sumarray = new int[m1][n2];
		
		for (int i =0; i<m1; i++)
		{
			for (int j=0; j< n2; j++)
			{   int sum = 0;
				for (int k=0; k< n1; k++)
				{
				sum = sum + array1[i][k]* array2[k][j];
				} 
				sumarray[i][j] = sum;
			}
		}
		for (int i =0; i< m1; i++)
		{
			for (int j =0; j<n2; j++)
			{
				System.out.print(sumarray[i][j] + "\t");
			}
			System.out.println();
	}
	      }
}

