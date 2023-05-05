package FunctionAndArrays;
import java.util.Scanner;
public class AnyBaseAddition {

	public AnyBaseAddition() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	      Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      double d = getSum(b, n1, n2);
	      System.out.println(d);
	   }
	  
	   public static double getSum(int b, int n1, int n2){
		   int x =0; double num =0; int c= 0; int sum =0;
	       while (n1 >0 || n2 >0 || c>0) {
	    	   int rem1 = n1%10;
		       int rem2 = n2%10;
		       n1 = n1/10; n2= n2/10;
		          rem1 = rem1 + c;                          //C is the carry
		          sum = rem1+ rem2;
		       
		       if ( sum >= b) {
		    	    sum= rem1+rem2-b;
		    	    c=1;                                //Add carry in next & subtract b from here
		    	   
		       } else {
		    	   sum = rem1+ rem2;
			       c=0;
		       }
		       num = num + sum * Math.pow(10, x) ; x++;
	       } 
		   return num;
	       
	   }

}
