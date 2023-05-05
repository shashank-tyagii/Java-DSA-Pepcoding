package ArrayListsRecursions;
import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.util.Scanner;
public class SubsequenceString {

	public SubsequenceString() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
        ArrayList <String> arr = gss(str);
        System.out.println(arr);
        
        	}
      
	public static ArrayList<String> gss(String str)           //Example : abc
	 {  if( str.length() == 0) {
		 ArrayList <String> zerocase = new ArrayList<>();
		 zerocase.add("");
		 return zerocase; 
	 }
		char ch = str.charAt(0);                            //  a
		String s = str.substring(1);                        //  bc
		ArrayList <String> arr1 = gss(s);                   // Function will call itself and we expect the output :[ bc, b-, -c, --]
		ArrayList <String> arr2 = new ArrayList<>();        // Output arrayList
		for (int i =0; i<arr1.size(); i++)                  // for each arr1 element, add first character and -  
		{
			arr2.add(ch + arr1.get(i));
			arr2.add("" + arr1.get(i));
		}
		return arr2;		
	}
	
	public static int decimaltobinary(int n)
	{ int p =1; int num = 0;
		while (n >0)
		{
			int rem = n%2;
			num = num +rem *p;
			p= p*10;
			n =n/2;
	}
		return num;
}
}