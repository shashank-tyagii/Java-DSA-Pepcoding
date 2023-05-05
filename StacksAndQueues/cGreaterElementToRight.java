package StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;

public class cGreaterElementToRight {

	public cGreaterElementToRight() {
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
	Stack<Integer> st = new Stack<>();
	int[] nge = new int[n];
	nge[arr.length -1] = -1;
	st.push(arr[arr.length - 1]);
	for (int i =arr.length-2 ; i >=0 ; i--) {
	
		while (st.size()>0 && arr[i] >= st.peek()) {            // Delete small elements in stack
			st.pop();
		}
		if (st.size() == 0) {nge[i] = -1;}                      // If stack became empty i.e. no larger element 
		else { nge[i] = st.peek();}                             // If stopped at larger element
		st.push(arr[i]);                                        // Add current element in stack
	
	}
	
	for (int i = 0 ; i < nge.length ; i ++) {
		System.out.println(nge[i]);
	}

}
}
