package RecursionBacktracking;
import java.util.Scanner;
public class Nqueens {

	public Nqueens() {
	}

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the square matrix size");
	int n = scn.nextInt();
	int [][] matrix = new int[n][n];
	PrintNqueens(matrix , "" , 0 , 0);

	}
	
	public static void PrintNqueens(int[][] chess , String ans , int row , int col) {
		
		if(row == chess.length){
            System.out.println(ans + ".");
            return;
     }
        for( col = 0; col < chess.length; col++)
        {
            if(chess[row][col] == 0 && queensAreSafe(chess, row, col) == true){
                chess[row][col] = 1;                                                   //Mark the position by 1
                PrintNqueens(chess, ans + row + "-" + col + ", ", row + 1, col );      //One in a row, so go to next row
                chess[row][col] = 0;                                                   //Delete the position
         }      
        }
		
	}
	
	public static boolean queensAreSafe(int[][]chess , int row, int col) {

        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){               // Reverse diagonal
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col; i >= 0; i--){                                  // Above that element, but in the same column
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){     //Diagonal 2
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row, j = col - 1; j >= 0; j--){
            if(chess[i][j] == 1){
                return false;
            }

}          return true;
	}
}
