package TwoDarrays;
import java.util.Scanner;
public class Towdimentionalarray {

	public Towdimentionalarray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int m = scn.nextInt();
		System.out.println("Enter the number of columns");
		int n = scn.nextInt();
		int [][] array = new int[m][n];
		for (int i =0; i< m; i++)
		{
			for (int j =0; j<n; j++)
			{
				array[i][j]= scn.nextInt();
			}
		}
		for (int i =0; i< m; i++)
		{
			for (int j =0; j<n; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}

}
