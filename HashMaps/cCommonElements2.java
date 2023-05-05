package HashMaps;
import java.util.HashMap;
import java.util.Scanner;

public class cCommonElements2 {

	public cCommonElements2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the size of array1");
		int n = scn.nextInt();
		System.out.println("Enter the elements of array1");
		int[] arr1 = new int[n];
		for (int i = 0 ; i <n ; i++) {
			arr1[i] = scn.nextInt();
		}
		System.out.println("Enter the size of array2");
		int m = scn.nextInt();
		System.out.println("Enter the elements of array2");
		int[] arr2 = new int[m];
		for (int i = 0 ; i <m ; i++) {
			arr2[i] = scn.nextInt();
		}
// Create a frequency HashMap
		HashMap <Integer , Integer> fmap1 = new HashMap<>();
		for (int i = 0 ; i < arr1.length ; i++) {
			if (fmap1.containsKey(arr1[i]) == true) {
				int x = fmap1.get(arr1[i]);
				fmap1.put(arr1[i], x++);
			} else {
			fmap1.put(arr1[i], 1);  }
		}
		
		for (int i = 0 ; i < arr2.length ; i++) {
			if (fmap1.containsKey(arr2[i]) == true && fmap1.get(arr2[i]) !=0) {
				int x = fmap1.get(arr2[i]);
				System.out.println(arr2[i]);
				fmap1.put(arr2[i], x--);
			} 
		}
	}

}
