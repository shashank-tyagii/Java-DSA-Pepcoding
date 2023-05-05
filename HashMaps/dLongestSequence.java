package HashMaps;
import java.util.HashMap;
import java.util.Scanner;
public class dLongestSequence {

	public dLongestSequence() {
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
		HashMap<Integer,Integer> hm = new HashMap<>();
		int max =0; int digit = 0;
		for (int i = arr.length-1 ; i >=0 ; i--) {
			int num = arr[i]; int y =1; int key = num+1;
			if (hm.containsKey(key) == true) {
				int x = hm.get(key);
				y=x+1;
				hm.put(num, y);
			}
			else {
				hm.put(num, y);
			}
			
			if (y > max) {
				max = y;
				digit = num;
			} 
		}
		
		for (int i =0 ; i<max ; i++) {
			System.out.println(digit +i);
		}
		
	}

}
