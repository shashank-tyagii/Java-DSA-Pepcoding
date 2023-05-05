package HashMaps;
import java.util.HashMap;
import java.util.Scanner;
public class bCommonElements1 {
	public bCommonElements1() {
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
		HashMap <Integer , Integer> hm = new HashMap<>();
		
		for (int i = 0 ; i < arr2.length ; i++) {
			int x =1;
			for (int j =0 ; j <arr1.length ; j++) {
				if (arr2[i] == arr1[j] && hm.containsKey(arr2[i]) == false) {
					x++;
				} 
			} 
			hm.put(arr2[i], x);
			if (x >=2) { System.out.println(arr2[i]);}
		}
		

	}

}
