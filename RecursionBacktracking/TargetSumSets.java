package RecursionBacktracking;
import java.util.Scanner;
public class TargetSumSets {

	public TargetSumSets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 Scanner scn = new Scanner (System.in);
	 System.out.println("Enter the array size");
	 int n = scn.nextInt();
	 int[] array = new int[n];
	 System.out.println("Enter the array elements");
	 
	 for (int i =0; i <n ; i++) {
		 array[i] = scn.nextInt();
	 }
	 System.out.println("Enter the target sum");
	 int tar = scn.nextInt();
	 printTargetSumSubsets(array,0 , "", 0, tar);

	}
	
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
        if(idx == arr.length) {
        	if (sos == tar) {System.out.println(set); }
        	return;
        }
    	// every number has two options. Whether to include itself or not. Then it will go to next number.
    	printTargetSumSubsets(arr, idx +1 , set + arr[idx] + ",", sos + arr[idx], tar);         //True case
    	printTargetSumSubsets(arr, idx +1 , set, sos , tar);                                    //False case
	
	
    }

}

