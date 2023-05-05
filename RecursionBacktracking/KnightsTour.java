package RecursionBacktracking;
import java.util.Scanner;
public class KnightsTour {

	public KnightsTour() {
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the square matrix size");
		int n = scn.nextInt();
		int [][] matrix = new int[n][n];
		System.out.println("Enter the row");
		int row = scn.nextInt();
		System.out.println("Enter the column");
		int col = scn.nextInt();
		printKnightsTour(matrix, row, col , 1);
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int upcomingMove) {
        // A knight can move in 8 ways.
    	
    	if (r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c] !=0) {return;}
    	else if(upcomingMove == chess.length * chess.length){
            chess[r][c] = upcomingMove;
            displayBoard(chess);
            chess[r][c] = 0;    
            return;
        }
    	
    	chess[r][c] = upcomingMove;
    	printKnightsTour(chess , r +2 , c+1 , upcomingMove+1);
    	printKnightsTour(chess , r +2 , c-1 , upcomingMove+1);
    	printKnightsTour(chess , r -2 , c+1 , upcomingMove+1);
    	printKnightsTour(chess , r -2 , c-1 , upcomingMove+1);
    	printKnightsTour(chess , r +1 , c+2 , upcomingMove+1);
    	printKnightsTour(chess , r -1 , c+2 , upcomingMove+1);
    	printKnightsTour(chess , r +1 , c-2 , upcomingMove+1);
    	printKnightsTour(chess , r -1 , c-2 , upcomingMove+1);
    	chess[r][c] = 0;
    	
    	
    	
    }

    public static void displayBoard(int[][] chess){
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}