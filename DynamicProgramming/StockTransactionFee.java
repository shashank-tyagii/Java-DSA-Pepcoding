package DynamicProgramming;
import java.util.Scanner;
public class StockTransactionFee {
	public StockTransactionFee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of days");
		int n = scn.nextInt();
		System.out.println("Enter the array elements");
		int[] array = new int[n];
		for(int i =0 ; i <n ; i ++) {
			array[i] = scn.nextInt(); 
		}
		System.out.println("Enter the transaction fee");
		int fee = scn.nextInt();

		int buy = -1 * array[0];           // buy = -10;
		int sell = 0 , bp =0 , sp= 0;
		
		for (int i=1; i<n ; i++) {
			
			bp = sell - array[i];           // i=1, bp = -15;
			if ( bp > buy) { buy = bp;}     // buy = -10;
			
			sp = buy + array[i]-fee;     
			if ( sp > sell) { sell = sp;}
			
		}
		
		System.out.println(sell);
		
	}

}
