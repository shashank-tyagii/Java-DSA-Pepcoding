package RecursionBacktracking;
import java.util.Scanner;
public class FloodFill {

	public FloodFill() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = scn.nextInt();
        System.out.println("Enter the number of columns");
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "" , new boolean[n][m]);
    }
  
    public static void floodfill(int[][] maze, int sr, int sc, String ans, boolean[][] visited) {
      
    	int n = maze.length; int m = maze[0].length;
    	
    	if (sr < 0 || sc<0 || sr >=n || sc >=m || maze[sr][sc] == 1 || visited[sr][sc] == true) {return;}
    	
    	if (sr == n-1 && sc == m-1) {System.out.println(ans); return;}
    	
    	visited[sr][sc] = true;                         //Tick visited the element 
    	floodfill(maze, sr-1, sc, ans+ "t" , visited);
    	floodfill(maze, sr+1, sc, ans+ "d" , visited);
    	floodfill(maze, sr, sc+1, ans+ "r" , visited);
    	floodfill(maze, sr, sc-1, ans+ "b" , visited);
    	visited[sr][sc] = false;                         //Wipe out the visited element after printing. This is backtracking.
    	
    	
    }
}