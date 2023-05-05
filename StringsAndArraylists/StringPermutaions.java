package StringsAndArraylists;
import java.util.Scanner;
public class StringPermutaions {

	public StringPermutaions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scn.nextLine();
		stringpermutations(str);
	}
    public static void stringpermutations(String s)
    {
    	int l= s.length();
    	int n = factorial(l);
    	 for (int i =0; i <n; i++)
    	 {   StringBuilder sb = new StringBuilder(s);
    	      int temp = i;
    		 for (int j =l; j >0; j--)
    		 {
    			 int y = temp/j;
    			 int x = temp %j;
    			 System.out.print(sb.charAt(x));
    			 sb.deleteCharAt(x);
    			 temp = y;
    		 }
    		     System.out.println();
    	 }
    	 
    }
    
    public static int factorial(int n)
    { int val =1;
    	for (int i=1; i<=n; i++)
    	{
    		val = val*i;
    	}
    	return val;
    }
}
