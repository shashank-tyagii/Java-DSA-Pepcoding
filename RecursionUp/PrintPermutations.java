package RecursionUp;
import java.util.Scanner;
public class PrintPermutations {

	public PrintPermutations() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String ques = scn.next();
		String ans = "";
		printPermutations(ques,ans);
	}
	
    public static void printPermutations(String str, String ans) {
    	if (str.length() == 0) {System.out.println(ans); return;}
    	
    	for (int i =0; i <str.length(); i++) {
    		StringBuilder sb1 = new StringBuilder(str);
    		char ch = sb1.charAt(i);
    		StringBuilder sb2 = sb1.deleteCharAt(i);
    		printPermutations(sb2.toString(), ans + ch);
    	}
    }

}
