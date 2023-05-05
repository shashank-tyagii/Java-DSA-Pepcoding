package ArrayListsRecursions;
import java.util.ArrayList;
import java.util.Scanner;
public class KeypadCharacters {

	public KeypadCharacters() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the string");
    String strr = scn.next();
    ArrayList<String> arr = getKPC(strr);
    System.out.println(arr);
    

	}
	
	public static ArrayList<String> getKPC(String str)          //786
	{   if (str.length() == 0 ) {
		ArrayList<String> str2 = new ArrayList<>();
		str2.add("");
		return str2;
	}
		char ch = str.charAt(0);                               //7
	    String ss = str.substring(1);                          //86
		ArrayList<String> arr = new ArrayList<>();
		arr.add(".;");                                   //0
		arr.add("abc");                                  //1
		arr.add("def");                                  //2
		arr.add("ghi");                                  //3
		arr.add("jkl");                                  //4
		arr.add("mno");                                  //5
		arr.add("pqrs");                                 //6
		arr.add("tu");                                   //7
		arr.add("vwx");                                  //8
		arr.add("yz");                                   //9
		ArrayList<String> arr2 = getKPC(ss);             //86 outputs,(faith)
		ArrayList<String> arr3= new ArrayList<>();       //OutputArrayList
		String strrr= arr.get(ch-48);                    //String at position 7 i.e tu
		for (int i =0; i< strrr.length();i++ )
		{
			char chh = strrr.charAt(i);
			for (int j= 0; j < arr2.size(); j++)
			{
				arr3.add(chh + arr2.get(j));
			}
		}
		return arr3;
	}

}
