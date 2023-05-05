package RecursionUp;
import java.util.Scanner;
public class PrintKeyPadCharacter {

	public PrintKeyPadCharacter() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	String str = scn.next();
	String ans = "";
	printKPC(str, ans);
	}
	
	public static void printKPC(String str , String ans)
	{   if (str.length() == 0) {System.out.println(ans); return;}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		String[] arr= {".;" , "abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
		String str1 = arr[ch-48];
		
		for (int i =0; i <str1.length(); i++) {	
				printKPC(ros, ans+ str1.charAt(i));
		}
		
	}
}
