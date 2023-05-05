package TimeAndSpaceComplexity;
import java.util.Scanner;
public class BubbleSorting {

	public BubbleSorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the size of array");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] arr = new int[n];
		for(int i = 0; i <n ; i++) {
			arr[i] = scn.nextInt();
			}
		bubbleSort(arr);
		for (int i =0; i < n ; i++) {
			System.out.println(arr[i]);
		}
		
	}  public static void bubbleSort(int[] arr) {
		
		int n = arr.length;
		
		for (int j = 0 ; j < n-1; j++) {
		for (int i =0; i < n - j-1 ; i++) {
			if ( arr[i] > arr[i+1]) {swapping (arr , i , i+1);}
		}
		}
		
	}
	
	public static void swapping(int[] arr , int x , int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
