package JavaProjects;
import java.util.Scanner;

public class CountdigitsofNumber {

	public CountdigitsofNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int count =0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any digit natural number ");
		int num = scn.nextInt();
		while ((num %10) !=0 && num !=0)
		{
         count++;
         num = num/10;
		}	
		System.out.println(count);
	}

}
