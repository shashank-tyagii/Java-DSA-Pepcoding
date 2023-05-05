package JavaProjects;
import java.util.Scanner;

public class Rotatenumber {

	public Rotatenumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size= 0;
		int digit = 1;
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter the number");
       int num = scn.nextInt();
       int number = num;
       
       // Now we will calculate the size of number
       while ((num % 10) !=0 || (num !=0))
       {
    	   size++;
    	   num = num/10;
       }
       System.out.println("Size = " + size);
       System.out.println("Enter the value k : ");
       int k = scn.nextInt();
       if (k <= size)
       {k = k; }
       else
       { k= k % size;}
       for (int i=1; i <=k ; i++)
       {
          digit = digit* 10;                  //TO Remove 1 digit, divide by 10, to remove 2 digit, divide by 100.....
       }
       
       int first = number % digit;            // ex k=2; remove last two digits (divide by 100 ) and place in front
       number = number/digit;
       System.out.print(first);
       System.out.print(number);
	}

}
