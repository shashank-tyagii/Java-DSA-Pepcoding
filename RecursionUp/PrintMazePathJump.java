package RecursionUp;
import java.util.Scanner;
public class PrintMazePathJump {

	public PrintMazePathJump() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Enter the number of rows");
		int n = scn.nextInt();
		System.out.println("Enter the number of columns");
		int m = scn.nextInt();
        printMazePaths(0, 0, n-1, m-1, "");
	}
    public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
    	if(sr > dr || sc > dc)  { return;}
        if(sr == dr && sc == dc){ System.out.println(path);  return;}
        
        
      	for (int i=1; i <= (dc-sc) ; i++)
    	{
		printMazePaths(sr, sc+i, dr, dc, path + "H" + i); }
    	for (int j=1; j<= (dr-sr) ; j++)
    	{
		printMazePaths(sr+j, sc, dr, dc, path + "V" + j); }
    	for (int k=1; k <= (dc-sc) && k<= (dr-sr) ; k++)
    	{
		printMazePaths(sr+1, sc+k, dr, dc, path + "D" + k);
    	}
    	    }

}
