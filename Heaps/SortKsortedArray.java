package Heaps;
import java.util.PriorityQueue;
import java.util.Scanner;
public class SortKsortedArray {

	public SortKsortedArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scn.nextInt();
		System.out.println("Enter the elements of array");
		int[] arr = new int[n];
		for (int i = 0 ; i <n ; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Enter the value of k");
		int k = scn.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int i =0 ; i <k+1 ; i++) {
			pq.add(arr[i]);
		}
		
		for (int i =k+1 ; i< arr.length ; i++) {
			System.out.println(pq.peek());
			pq.remove();
			pq.add(arr[i]);
		}
		 while(pq.size() > 0){
	         System.out.println(pq.remove());
	      }
		
	}

}
