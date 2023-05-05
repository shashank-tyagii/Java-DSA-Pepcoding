package FunctionAndArrays;
import java.util.Scanner;
public class AnyBaseToDecimal {

	public AnyBaseToDecimal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      double d = getValueIndecimal(n, b);
	      System.out.println(d);
	   }
	  
	   public static double getValueIndecimal(int n, int b){
	      int x =0; double digit =0;
	      while (n>0) {
		   int rem = n %10;
		   n =n/10;
		   digit = digit + rem * Math.pow(b,x) ;
		   x++;} return digit;
	   }

}
