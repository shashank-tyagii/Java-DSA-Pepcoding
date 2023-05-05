package ArrayListsRecursions;
import java.util.ArrayList;
import java.util.Scanner;
public class MazePathwithJump {

	public MazePathwithJump() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		System.out.println("Enter the number of columns");
		int m = scn.nextInt();
		ArrayList <String> array = getMazePaths(1,1,n,m);
		System.out.println(array);
	}
	
	public static ArrayList getMazePaths(int sr, int sc, int dr , int dc)
	{
		if(sr > dr || sc > dc){
            return new ArrayList<>();
        }

        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
		
		ArrayList <String> arro = new ArrayList<>();
		for (int i=1; i<= (dc-sc) ; i++) {                                       //Any horizontal path
			ArrayList <String> array1= getMazePaths(sr, sc+i, dr, dc);
			for (int j =0; j< array1.size(); j++)
			{
				arro.add("h" + i + array1.get(j));
			}
		}
		
			for (int i=1; i<= (dr-sr) ; i++) {                                    //Any vertical path
				ArrayList <String> array2= getMazePaths(sr + i, sc, dr, dc);
				for (int j =0; j< array2.size(); j++)
				{
					arro.add("v" + i + array2.get(j));
				}
		}
			for (int i=1; i<= (dr-sr) && i<=(dc-sc) ; i++) {                     //Any diagonal path
				ArrayList <String> array3= getMazePaths(sr + i, sc +i, dr, dc);
				for (int j =0; j< array3.size(); j++)
				{
					arro.add("d" + i + array3.get(j));
				}
		}
		return arro;
	}

}
