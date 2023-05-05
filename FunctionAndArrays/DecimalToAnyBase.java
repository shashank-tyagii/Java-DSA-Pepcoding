package FunctionAndArrays;
import java.util.Scanner;
public class DecimalToAnyBase {

	public DecimalToAnyBase() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		 System.out.println("enter the number");
	      int n = scn.nextInt();
	      System.out.println("enter the base");
	      int b = scn.nextInt();
	      double dn = getValueInBase(n, b);
	      System.out.println(dn);
	   }
	  
	   public static double getValueInBase(int n, int b){
	     int x = 0; double digit =0;
		   while (n>0) {
			  float rem = n%b;
			  n = n/b;
			  digit= digit +rem * Math.pow(10, x);
			  x++;
		   }
		   return digit;
	   }

	}
