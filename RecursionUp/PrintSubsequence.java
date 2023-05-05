package RecursionUp;
import java.util.Scanner;
public class PrintSubsequence {
	public PrintSubsequence() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the string");
	String ques = scn.next();
	String ans = "";
	printSS(ques,ans);
	}

	public static void printSS(String ques, String ans) {
		if(ques.length() == 0) {
			System.out.println(ans); return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		printSS(roq, ans + "");
		printSS(roq, ans + ch);
	}
}
