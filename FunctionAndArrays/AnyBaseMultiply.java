package FunctionAndArrays;
import java.util.Scanner;
public class AnyBaseMultiply {

	public AnyBaseMultiply() {}
	
	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    
    double d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
      int finalProduct =0; int z =1; int c=0; int q=1; int my= n1;
	  while (n2 >0) {
	  int rem2 = n2%10 ;  n2 = n2/10; int p =1;int product = 0; n1 =my;
	  while ( n1 >0 || c >0 ) {
		  int rem1 = n1%10; n1 = n1/10;
		  int multiply = rem1 * rem2+ c; 
		  if ( multiply >= b) { z = multiply % b ; c = multiply /b; }  else { z= multiply; c=0;}
		  product = getSum(b , product, z*p);
		  p =p *10; 
	  }
	  finalProduct = getSum (b, finalProduct, product *q); q=q*10;
	 
	 }return finalProduct;
 }

 public static int getSum(int b, int n1, int n2){
	   int x =0; int num =0; int c= 0; int sum =0; int p =1;
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
	       num = num + sum * p ; x++; p = p*10;
     } 
	   return num;
     
 }
}
