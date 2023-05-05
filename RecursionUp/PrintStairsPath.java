package RecursionUp;

import java.util.Scanner;

public class PrintStairsPath {

	public PrintStairsPath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number of stairs");
		int n = scn.nextInt();
        printStairPaths(n, "");
	}
	
	public static void printStairPaths(int n, String path) {
		if(n==0) {System.out.println(path); return;}
		else if (n<0) {return;}
		
		printStairPaths(n-1 , path + "1");
		printStairPaths(n-2 , path + "2");
		printStairPaths(n-3 , path + "3");
    }

}
