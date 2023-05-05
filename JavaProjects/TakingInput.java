package JavaProjects;

import java.util.Scanner;

public class TakingInput {

	public TakingInput() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);                // Define the system for scanning
		System.out.println("What is your name");
		String name = x.next();
		System.out.println("My name is " + name );
		System.out.println("What is your age");            // int age = x.nextInt(); 
		int age = Integer.parseInt(x.next());              // Special case when string and integer both are used in same program
		System.out.println("My age is " + age );
	}

}
