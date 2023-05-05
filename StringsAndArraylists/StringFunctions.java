package StringsAndArraylists;

public class StringFunctions {

	public StringFunctions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
     String s = "Shashank";
     System.out.println(s);
     System.out.println(s.length());      //To know the length of a string. In strings it is a function , different from an array
     String name = s + "Tyagi";           //Addition of strings
     System.out.println(name);
     
     for(int i =0; i<s.length(); i++)
     {
    	 char c = s.charAt(i);             //To read any element of an string. modifying any element is not possible.
    	 System.out.print(c + "\t");
     }

     for(int i =0; i<s.length(); i++)
     {
    	 for(int j =i+1; j<=s.length(); j++)   //Important, since substring does not include last element
    	 {
    	 String x = s.substring(i,j);           //To print all substrings
    	 System.out.print(x);
     }
    	 
     } System.out.println();
     
     String[] split = s.split("s");           //To print the split of a string
     for (int i =0; i <split.length; i++)
     {
    	 System.out.println(split[i]);
     }
	}

}
