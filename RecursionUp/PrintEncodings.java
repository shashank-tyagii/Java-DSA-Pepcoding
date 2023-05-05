package RecursionUp;
import java.util.Scanner;

public class PrintEncodings {

	public PrintEncodings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String ques = scn.next();
		String ans = "";
		printEncodings(ques, ans);
	}
	
   public static void printEncodings(String ques,String ans) {
       if (ques.length() == 0) {                                      //String length = 0
           System.out.println(ans);
           return;
           
       } else if (ques.length() == 1) {                              //String length =1
           if (ques.charAt(0) == '0') {
               return;
           } else {
               String ch0 = ques.substring(0, 1);
               String roq0 = ques.substring(1);
               String code0 = (char)('a' + (Integer.parseInt(ch0) - 1)) + "";      //Conversion from integer to character
               printEncodings(roq0, ans + code0);
           }
       } else {                                                        //String length 2 or more
           if (ques.charAt(0) == '0') {
               return;
           } else {
               String ch0 = ques.substring(0, 1);
               String roq0 = ques.substring(1);
               String code0 = (char)('a' + (Integer.parseInt(ch0) - 1)) + "";
               printEncodings(roq0, ans + code0);

               String ch01 = ques.substring(0, 2);
               String roq01 = ques.substring(2);
               String code01 = (char)('a' + (Integer.parseInt(ch01) - 1)) + "";

               if (Integer.parseInt(ch01) <= 26) {
                   printEncodings(roq01, ans + code01);
               }
           }
       }
   }
}
