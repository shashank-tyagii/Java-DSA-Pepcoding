package StringsAndArraylists;
import java.util.Scanner;
public class StringCompression {

	public StringCompression() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		System.out.println(Stringcompression1(s));
		System.out.println(Stringcompression2(s));
	}
	
	public static String Stringcompression1(String str) {
	    String strr = ""; strr = strr + str.charAt(0);
		for (int i =1; i <str.length(); i++)
		{
			if (str.charAt(i-1) == str.charAt(i)) {strr =strr;}
			else {strr = strr + str.charAt(i); }
		}
		
		return strr;
	}
	
	public static String Stringcompression2(String str) {
		String strr = ""; strr = strr + str.charAt(0); int x =1;
		for (int i =1; i <str.length(); i++)
		{   
			if (str.charAt(i-1) == str.charAt(i)) {strr =strr; x ++;}
			else if (x!=1) {strr = strr + x + str.charAt(i); x=1; }
			else {strr = strr + str.charAt(i);}
			
			if (i ==(str.length()-1) && x !=1) { strr= strr +x;}
			
		}
		
		return strr;
	}

}
