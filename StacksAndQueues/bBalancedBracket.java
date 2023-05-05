package StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;

public class bBalancedBracket {

	public bBalancedBracket() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scn = new Scanner (System.in);
		String str = scn.next();
//Define stack
		Stack <Character> st = new Stack <>();

		for (int i = 0; i < str.length() ; i++) {
// Push only brackets, not characters		
		if ( str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {st.push(str.charAt(i));}
		
		else if (str.charAt(i) == ')') { 
			if (st.size() == 0 || st.peek() != '(') {System.out.println("False"); return;} else {st.pop();}
			}
		else if (str.charAt(i) == '}') {
			if (st.size() == 0 || st.peek() != '{') {System.out.println("False"); return;} else {st.pop();}
			}
		else if (str.charAt(i) == ']') {
			if (st.size() == 0 || st.peek() != '[') {System.out.println("False"); return ;} else {st.pop();}
			}
		
		}
		if (st.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
		
		
	}

}
