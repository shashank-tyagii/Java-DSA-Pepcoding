package StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;
public class fSlidingWindowMax {

	public fSlidingWindowMax() {
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
		System.out.println("Enter the window size");
		int k = scn.nextInt();
		int[] nge = NextRight(arr);
		int[] window = new int[arr.length-k];
		Stack <Integer> st = new Stack <>();
        int j =0; int max = 0;
		for (int i = 0 ; i < arr.length - k ; i ++) {
			j = i;
			max = arr[i];
			while (nge[j] - i < k) {
				max = arr[nge[j]];
				j= nge[j];
			}
			window[i] = max;
		}
		for (int i=0 ; i <window.length ; i++) {
			System.out.print(window[i] + "  ");
		}
		
	}
	
	public static int[] NextRight(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] nge = new int[arr.length];
		nge[arr.length -1] = arr.length;
		st.push(arr.length - 1);
		for (int i =arr.length-2 ; i >=0 ; i--) {
		
			while (st.size()>0 && arr[i] > arr[st.peek()]) {            // Delete small elements in stack
				st.pop();
			}
			if (st.size() == 0) {nge[i] = arr.length;}                  // If stack became empty i.e. no larger element 
			else { nge[i] = st.peek();}                                 // If stopped at larger element
			st.push(i);                                                 // Add current element in stack
		
		}
		
		return nge;
	}

}
