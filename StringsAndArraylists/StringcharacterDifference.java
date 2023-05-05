package StringsAndArraylists;
import java.util.Scanner;
public class StringcharacterDifference {

	public StringcharacterDifference() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		
		System.out.println(stringdifference(str));
		

	}
	public static String stringdifference(String str) {
		StringBuilder sb = new StringBuilder(str);
		int[] array = new int [sb.length()];
		int x = sb.length() -1;
		for (int i =x-1; i >=0 ; i--)
		{
			array[i] = (sb.charAt(i+1) - sb.charAt(i));
			//sb.insert(i-1,n);
		}
		for (int i =x-1; i >=0 ; i--)
		{
			//array[i] = (sb.charAt(i) - sb.charAt(i-1));
			sb.insert(i+1,array[i]);
		}
		return sb.toString();
	}

}
