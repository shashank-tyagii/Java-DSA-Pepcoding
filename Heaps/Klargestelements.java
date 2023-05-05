package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Klargestelements {

	public Klargestelements() {
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
		for (int i=0; i <k ; i++) {
			pq.add(arr[i]);                 //Example. Add three elements if k=3
		}
		for(int i =k; i < arr.length ; i++) {
			if ( arr[i] > pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		for (int i =0 ; i <k ; i++) {
			System.out.println(pq.peek());
			pq.remove();
		}
	}

}
