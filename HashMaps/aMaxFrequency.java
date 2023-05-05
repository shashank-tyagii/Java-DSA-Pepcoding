package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class aMaxFrequency {

	public aMaxFrequency() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.next();
		
// We will create a hashmap of character vs frequency
		HashMap <Character, Integer> hm = new HashMap<>();
		int max = 0; char character= str.charAt(0);
		for (int i = 0 ; i< str.length() ; i++) {
			char ch = str.charAt(i);
			if (hm.containsKey(ch) == true ) {
				int x =hm.get(ch);
				hm.put(ch, x+1);
			} else {
			hm.put(ch, 1); }
			if (hm.get(ch)> max) {
				max = hm.get(ch);
				character = ch;
			}
		}
  System.out.println(character);
		
	}

}
