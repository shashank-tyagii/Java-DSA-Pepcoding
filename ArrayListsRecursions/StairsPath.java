package ArrayListsRecursions;
import java.util.ArrayList;
import java.util.Scanner;
public class StairsPath {

	public StairsPath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number of stairs");
		int n = scn.nextInt();
		ArrayList <String> array = stairspath(n);
		System.out.println(array);
		
	}
	
	public static ArrayList<String> stairspath(int n)
	{  if(n <= 0){
        ArrayList<String> bres = new ArrayList<>();

        if(n == 0){
            bres.add("");
        }

        return bres;
    }
		ArrayList <String> arr1 = new ArrayList<>();
		ArrayList <String> arr2 = new ArrayList<>();
		ArrayList <String> arr3 = new ArrayList<>();
		ArrayList <String> arr4 = new ArrayList<>();
		arr1 = stairspath(n-1);
		for (int i =0; i < arr1.size() ; i++)
		{
			arr4.add(1 + arr1.get(i));
		}
		arr2 = stairspath(n-2);
		for (int i =0; i < arr2.size() ; i++)
		{
			arr4.add(2 + arr2.get(i));
		}
		arr3 = stairspath(n-3);
		for (int i =0; i < arr3.size() ; i++)
		{
			arr4.add(3 + arr3.get(i));
		}
		
		return arr4;
	}

}
