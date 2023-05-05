package TimeAndSpaceComplexity;
import java.util.Scanner;
public class InsertionSort {

	public InsertionSort() {
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
		insertionSort(arr);
		for (int i =0; i < n ; i++) {
			System.out.println(arr[i]);
		}
		
	}  public static void insertionSort(int[] arr) {
		
		int n = arr.length;
		
		for (int i = 1 ; i < n; i++) {
		
		for (int j = i; j > 0 ; j--) {
			if ( arr[j-1] > arr[j]) {swapping (arr , j , j-1);}
		}
		}
		
	}
	
	public static void swapping(int[] arr , int x , int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}

