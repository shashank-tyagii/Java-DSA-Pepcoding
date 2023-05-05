package DynamicProgramming;
import java.util.Scanner;
public class StocksNtransaction {

	public StocksNtransaction() {
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
		
		int buy = array[0];
		int sell =array[0];
		int maxprofit =0;
		int profit = 0;
		
		for (int i = 1 ; i <n ; i++) {
			
			if (array[i] > array[i-1]) { sell = array[i];}
			
			if (array[i] < array[i-1]) { 
				
				profit = sell-buy;
				buy = array[i]; sell = array[i];          }
			
			maxprofit = maxprofit + profit;
		}
		
		System.out.println(maxprofit);
		
		
		
		
	}

}
