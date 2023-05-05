package StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;

public class dStockSpan {

	public dStockSpan() {
	
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
		
		int[] span = new int[n];
		span[0] = 1;
		st.push(arr[0]);
		for (int i =1 ; i <arr.length ; i++) {
		
			while (st.size()>0 && arr[i] >= st.peek()) {            // Delete small elements in stack
				st.pop();
			}
			if (st.size() == 0) {span[i] = i+1;}                    // If stack became empty i.e. no larger element 
			else { span[i] = st.peek()- arr[i];}                    // If stopped at larger element. Calculate the span
			st.push(arr[i]);                                        // Add current element in stack
		
		}
		
		for (int i = 0 ; i < span.length ; i ++) {
			System.out.println(span[i]);
		}

	}
	}

