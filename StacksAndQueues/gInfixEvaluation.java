package StacksAndQueues;
import java.util.Scanner;
import java.util.Stack;
public class gInfixEvaluation {

	public gInfixEvaluation() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
	System.out.println("Enter the string");
	Scanner scn = new Scanner (System.in);
	String str = scn.next();
	
	Stack <Integer> st1 = new Stack <>();               //Digits stack
	Stack <Character> st2 = new Stack <>();             //Symbol stack
	
	for (int i = 0 ; i < str.length() ; i++) {
		char ch = str.charAt(i);
		if (Character.isDigit(ch)) {st1.push(ch-'0');}
		else if (ch == '(') {st2.push(ch);}
		else if (ch == ')') {
			while (st2.size() >0 && st2.peek() != '(') {
				int val2 = st1.pop();
				int val1 = st1.pop();
				char op = st2.pop();
				int val = operation(val1,val2,op);
				st1.push(val);
			}
			if (st2.size() >0) {st2.pop();}
			
		}
		else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
			while (st2.size() >0 && priority(ch) <= priority(st2.peek()) && st2.peek() != '(') {
				int val2 = st1.pop();
				int val1 = st1.pop();
				char op = st2.pop();
				int val = operation(val1,val2,op);
				st1.push(val);
			}
			st2.push(ch);
		}
	
	}
	while (st2.size() > 0) {
	      int val2 = st1.pop();
	      int val1 = st1.pop();
	      char op = st2.pop();
	      int opval = operation(val1, val2, op);
	      st1.push(opval);
	    }
	
	System.out.println(st1.pop());

	}
	public static int priority(char op){
	    if(op == '+'){
	      return 1;
	    } else if(op == '-'){
	      return 1;
	    } else if(op == '*'){
	      return 2;
	    } else {
	      return 2;
	    }
	  }
	
	public static int operation  (int val1 , int val2 , char op) {
		 if(op == '+'){
		      return val1 + val2;
		    } else if(op == '-'){
		      return val1 - val2;
		    } else if(op == '*'){
		      return val1 * val2;
		    } else {
		      return val1 / val2;
		    }
	}

}
