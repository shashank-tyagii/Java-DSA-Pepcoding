package TwoDarrays;
import java.util.Scanner;
public class SaddlePrice {

	public SaddlePrice() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = scn.nextInt();
		int[][] array = new int[n][n];
		System.out.println("Enter the array elements");
		for (int i =0; i<n; i++)
		{
			for (int j =0; j<n; j++)
			{
				array[i][j] = scn.nextInt();
			}
		}
		int x= 0; int y=0;
		for (int i =0; i<n; i++)
		{ int min = array[i][0]; int max = array[i][0];
			for (int j =0; j<n; j++)
			{
				if (array[i][j] < min) {min = array[i][j]; y = j;} else {}        // finding minimum value in row and note down the column number
			}
			
			for(int k=0 ; k <n ; k++)
			{
				if(array[k][y] > max) { max = array[k][y]; x= k;} else {}        // finding max value in that same column
			}
			if (min==max) {System.out.println(max); return;}
		}
		System.out.println("No saddle Point found");
		
		

	}

}
