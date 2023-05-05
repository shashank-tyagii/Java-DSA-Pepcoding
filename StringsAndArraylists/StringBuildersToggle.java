package StringsAndArraylists;
import java.util.Scanner;
public class StringBuildersToggle {

	public StringBuildersToggle() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string to toggle");
		String name = scn.next();
		System.out.println(togglecase(name));

	}
	
	public static String togglecase(String str)
	{
		StringBuilder sb = new StringBuilder (str);
		for (int i =0; i < sb.length(); i++ )
		{
			char ch = sb.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				char uch = (char)('A' + ch - 'a'); sb.setCharAt(i, uch);
			}
			else if (ch >= 'A' && ch <='Z') {
				char lch = (char)('a' + ch - 'A'); sb.setCharAt(i, lch);
			}
		}
		return sb.toString();
	}

}
