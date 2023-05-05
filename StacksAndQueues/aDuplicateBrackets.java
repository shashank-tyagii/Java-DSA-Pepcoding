package StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;
public class aDuplicateBrackets {

	public aDuplicateBrackets() { }
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scn = new Scanner (System.in);
		String str = scn.next();
//Define stack
		Stack <Character> st = new Stack <>();

		for (int i = 0 ; i < str.length(); i++) {
//Check if the element is ) or any other element.
			if (str.charAt(i) == ')') {
//If the previous element added was just ( , then bracket was empty and were duplicate.
				if (st.peek() == '(') {System.out.println("True");  return; }
				else {   
					while (st.peek() != '(') {
						st.pop();
					}
					st.pop();
					
				}
			}
			
			else {st.push(str.charAt(i));}

		}
		
		System.out.println("False");
		
		
		
	}

}
