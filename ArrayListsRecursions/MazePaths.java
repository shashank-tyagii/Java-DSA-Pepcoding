package ArrayListsRecursions;
import java.util.ArrayList;
import java.util.Scanner;
public class MazePaths {

	public MazePaths() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		System.out.println("Enter the number of columns");
		int m = scn.nextInt();
		ArrayList <String> array = getMazePaths(0,0,n-1,m-1);
		System.out.println(array);

	}
	
	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if(sr > dr || sc > dc){
            return new ArrayList<>();
        }

        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
		ArrayList <String> arr1 = new ArrayList<>();
		ArrayList <String> arr2 = new ArrayList<>();
		ArrayList <String> arro = new ArrayList<>();
		arr1 = getMazePaths(sr, sc+1 , dr , dc);
		arr2 = getMazePaths(sr+1, sc, dr, dc);
		for(int i=0; i< arr1.size(); i++)
		{
			arro.add("H" + arr1.get(i));
		}
		for(int i=0; i< arr2.size(); i++)
		{
			arro.add("V" + arr2.get(i));
		}
		
		return arro;
		
    }

}
