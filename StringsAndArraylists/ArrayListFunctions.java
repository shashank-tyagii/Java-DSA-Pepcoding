package StringsAndArraylists;
import java.io.*;
import java.util.*;
public class ArrayListFunctions {

	public ArrayListFunctions() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n =0;;
		ArrayList<Integer> list= new ArrayList<Integer>(n);          //Declaration, always with zero size
		System.out.println(list + "--->" + list.size());             //Size of listarray
		
		for (int i = 1; i <=5 ; i++)
                 {
	               list.add(i);                                      //Adding element to an arraylist
                  }
		System.out.println(list + "--->" + list.size());  

		list.add(3, 100);                                           //Add number to n location
		System.out.println(list + "--->" + list.size());  
		
		list.set(2, 8);                                            // Replacing an element 
		System.out.println(list + "--->" + list.size());  
		
		list.get(1);                                                //Accessing any element
		System.out.println(list + "--->" + list.size());
		
		list.remove(0);
		System.out.println(list + "--->" + list.size());            // Deleting an element
	}

}
