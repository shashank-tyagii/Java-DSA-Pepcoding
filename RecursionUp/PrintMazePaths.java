package RecursionUp;

import java.util.Scanner;

public class PrintMazePaths {

	public PrintMazePaths() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		System.out.println("Enter the number of columns");
		int m = scn.nextInt();
        printMazePaths(0, 0, n-1, m-1, "");

	}
	
	public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
		if (sr>dr || sc>dc) {return;}
		else if (sr ==dr && sc ==  dc) {System.out.println(path); return;}
		printMazePaths(sr, sc+1, dr, dc, path + "H");
		printMazePaths(sr+1, sc, dr, dc, path + "V");
		
		
	}

}
