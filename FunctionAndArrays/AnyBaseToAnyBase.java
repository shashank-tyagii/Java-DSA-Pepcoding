package FunctionAndArrays;
import java.util.Scanner;
public class AnyBaseToAnyBase {

	public AnyBaseToAnyBase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b1 = scn.nextInt();
	      int b2 = scn.nextInt();
	  
	      double d = getnumber(n, b1, b2);
	      System.out.println(d);
	   }
	  
	   public static double getnumber(int n, int b1, int b2){               //to be converted from basde 1 to base 2
	        double newNum = 0; int x=0;
		   while (n>0) {
			   int rem = n % b2;
			   n = n/b2;
			   newNum = newNum + rem * Math.pow(b1,x);
			   x++;
		   }
		    return newNum;
		   
	   }

}
