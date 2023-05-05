package Recursion;
import java.util.Scanner;
public class LinearPower {

	public LinearPower() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		int abc = power(x,n);
		System.out.println(abc);

	}
	public static int power(int x, int n){
		if (n ==1) {return x;}
        int prevPower = power (x , n-1);
        int num = x * prevPower;
        return num;
    }

}
