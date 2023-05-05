package StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;

public class eLargestAreaHistogram {

	public eLargestAreaHistogram() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter the array Size");
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] arr= new int[n];
		for (int i = 0; i < n ; i++) {
			arr[i] = scn.nextInt();
			}
		Stack<Integer> stl = new Stack<>();
		Stack<Integer> str = new Stack<>();
		stl.push(0);
		str.push(arr.length-1);
		int[] lmin = new int[n];                                            //Will store the index of smallest to left
		int[] rmin = new int [n];                                           //Will store the index of smallest to right
		lmin[0] = -1;                                                      //It doesn't have next smallest element on left
		rmin[arr.length-1] = arr.length;                                   //It doesn't have next smallest element on right
		
		for (int i =1 ; i <arr.length ; i++) {
		
			while (stl.size()>0 && arr[i] <= arr[stl.peek()]) {             // Delete large elements in stack
				stl.pop();
			}
			if (stl.size() == 0) {lmin[i] = -1;}
			else {lmin[i] = stl.peek();}
		     stl.push(i);
		}
		
		for (int i =arr.length-2 ; i >= 0 ; i--) {
			
			while (str.size()>0 && arr[i] <= arr[str.peek()]) {             // Delete large elements in stack
				str.pop();
			}
			if (str.size() == 0) {rmin[i] = arr.length;}
			else {rmin[i] = str.peek();}
		     str.push(i);
		}
		int max =0;
		for (int i= 0 ; i < arr.length ; i ++) {
			int width = rmin[i] - lmin[i] -1;
			int height = arr[i];
			int area = height * width;
			if ( area > max ) {max = area;}
		}
		
		System.out.println(max);
		
	}
	}

