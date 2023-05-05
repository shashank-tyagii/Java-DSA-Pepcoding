package TimeAndSpaceComplexity;

import java.util.Scanner;

public class SelectionSort {

	public SelectionSort() {
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
		selectionSort(arr);
		for (int i =0; i < n ; i++) {
			System.out.println(arr[i]);
		}
		
	}  public static void selectionSort(int[] arr) {
		
		int n = arr.length;
		
		for (int j = 0 ; j < n-1; j++) {
			int min = arr[j]; int idx = j;
		for (int i =j+1; i < n ; i++) {
			if ( arr[i] < min) {min = arr[i] ; idx = i ; swapping (arr , j , idx);}
		}
		}
		
	}
	
	public static void swapping(int[] arr , int x , int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
