package DynamicProgramming;
import java.util.Scanner;
public class StockCooldownInf {

	public StockCooldownInf() {
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

		int buy = -1 * array[0];                                // buy = -10;
		int sell = 0 ; int sellCooldown = 0;
		int bp =0 , sp= 0 , cp = 0;                             // Parameters for buying, selling and cool down
		
		for (int i=1; i<n ; i++) {
			int temp1 = sell;                                   // Save previous loop parameters in a temporary memory
			int temp2 = sellCooldown;                           // Save previous loop parameters in a temporary memory
			
			bp = sellCooldown - array[i];                       // i=1, bp = -15;
			if ( bp > buy) { buy = bp;}                         // buy = -10;
			
			sp = buy + array[i];     
			if ( sp > sell) { sell = sp;}
			
			sellCooldown = Math.max(temp2, temp1);	
		}
		System.out.println(sell);
	}

}
