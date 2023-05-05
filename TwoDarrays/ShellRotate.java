package TwoDarrays;

import java.util.Scanner;

public class ShellRotate {

	public ShellRotate() {
		// TODO Auto-generated constructor stub
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
		
		System.out.println("Enter Shell number");
		int s = scn.nextInt();
		
		System.out.println("Enter rotation number");
		int r = scn.nextInt();
		
		int[] temp = new int[2*(m1-1) + 2*(n1-1)- 8*(s-1)];
		int i =0; int j =0; int k =s -1; int x=0;
		//	if (m1-k<=k) {break;}
		for ( i =k ;  i< m1-k ; i++)
		{    j = k;
			temp[x] = array[i][j]; x++;
			 }
		   
		 //if (n1-k <= k+1) { break;}
		for ( j =k +1 ; j< n1-k ; j++)
		{    i= m1-k-1;
			temp[x] = array[i][j]; x ++;
			 }
		
		 //if (k <= m1-1-k) {break;}
		for ( i =m1-1-k-1 ; i>=k ; i--)
		{   j= n1-k-1;
			temp[x] = array[i][j]; x++;
			  }
		
		 //if (k+1 <= n1-1-k) {break;}
		for ( j =n1-1-k-1 ; j>=k+1 ; j--)
		{   i = k;
			temp[x] = array[i][j]; x++;
			 }
        x--;
		int[] temp2 = new int[2*(m1-1) + 2*(n1-1)- 8*(s-1)];
		for (i =0; i<r ; i++)
		{   int z = temp[x];
			for ( j =x; j >0 ;j-- )
			{
				temp[j] = temp[j-1];
			}   temp[0] = z;
		}
		
		i =0; j =0;  k =s -1;  x=0;
		//	if (m1-k<=k) {break;}
		for ( i =k ; i< m1-k ; i++)
		{   j=k;
			array[i][j] = temp[x] ; x++;
			 }
		    i= m1-k-1;
		 //if (n1-k <= k+1) { break;}
		for ( j =k +1 ; j< n1-k ; j++)
		{   
			array[i][j] = temp[x]; x ++;
			 }
		j= n1-k-1;
		 //if (k <= m1-1-k) {break;}
		for ( i =m1-1-k-1 ; i>=k ; i--)
		{   
			array[i][j] = temp[x]; x++;
			  }
		i = k;
		 //if (k+1 <= n1-1-k) {break;}
		for ( j =n1-1-k-1 ; j>=k+1 ; j--)
		{   
			array[i][j] = temp[x]; x++;
			 }
		
		for ( i = 0; i< m1; i++)
		{
			for ( j =0; j< n1; j++)
			{
				System.out.print(array[i][j] + "\t");
			}   System.out.println();
		}
		
			

	}


}
