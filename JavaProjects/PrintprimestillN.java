package JavaProjects;
import java.util.Scanner;
public class PrintprimestillN {

	public PrintprimestillN() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);
		System.out.print("Enter the low number : ");
		int n1 = x.nextInt();
		System.out.print("Enter the high number : ");
		int n2 = x.nextInt();
		
		for (int i = n1 ; i <= n2; i++)
		{
			for (int j=2; j < i ; j++)
			{
				if ((i % j) == 0)
				{
					break ; 
				}
				else if ( j == (i-1)) { System.out.println(i);}
			}
		}
	}

}
