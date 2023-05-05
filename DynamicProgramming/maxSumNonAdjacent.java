package DynamicProgramming;
import java.util.Scanner;
public class maxSumNonAdjacent {

	public maxSumNonAdjacent() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[n];
		for(int i =0 ; i <n ; i ++) {
			array[i] = scn.nextInt(); 
		}
		
		int inc = array[0];
		int exc = 0;
		for(int i =1; i<n ; i++) {
			int temp = inc;
			inc = exc + array[i];
			exc = Math.max(temp, exc);
		}
		System.out.println(Math.max(inc, exc));

	}

}
