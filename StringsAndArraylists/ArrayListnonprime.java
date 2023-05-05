package StringsAndArraylists;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class ArrayListnonprime {

	public ArrayListnonprime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the arraylist size");
		int num = scn.nextInt();
		for (int i=0; i<num; i++)
		{
			int x = scn.nextInt();
			list.add(x);
		}
		System.out.println("The list is : " + list);
		for (int i=0; i<list.size(); i++)
		{
			int number = list.get(i);
			if (prime(number) == true) {}
			else if (prime(number) == false) {list.remove(i); }
		}
		System.out.println("The list is : " + list);
		
		
	}
	
	public static boolean prime(int n)
	{    boolean p = false;
		        for (int j=2; j<n ; j++)
		        {
		         if ((n % j) ==0)
		         {p = false;
		         break;
		         }
		         else if (j == (n-1))
		         {p = true;}
		        }
		        return p;
		      }
	 
	}

