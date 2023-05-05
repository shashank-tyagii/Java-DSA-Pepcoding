package FunctionAndArrays;

import java.util.Scanner;
public class Anybasesubtraction {

	public Anybasesubtraction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	      double d = basedifference(b, n1, n2);
	      System.out.println(d);}
	      
  public static double basedifference( int b, int n1 ,int n2) {
	  double number = 0; int x =0; int diff = 0; int y =0;
	  while (n1>0) {
	   int rem1 = n1 % 10;
	   int rem2 = n2% 10;
	   n1 = n1/10; n2= n2/10;
	   rem1 = rem1 + y;                                        //y is the carry
	   
	   if ( rem1 >=rem2 ) {
	                     diff = rem1-rem2; y =0;}
	   else {           
		                 diff = b +rem1 - rem2; y = -1;           // if taken carry, it will add the base value
		   
	   } number  = number + diff * Math.pow(10,x);
	   x++;
	   
  } return number;
  }
}
