package JavaProjects;

import java.util.Scanner;
  public class PrimeNumber{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.print("Please enter the total numbers : ");
      int t = scn.nextInt();
      for (int i=1; i<=t ; i++)
      {
      System.out.print("Number " + i + " is :");
      int n = scn.nextInt();
        for (int j=2; j<n ; j++)
        {
         if ((n % j) ==0)
         {System.out.println("Non prime");
         break;
         }
         else if (j == (n-1))
         {System.out.println("Prime");}
        }
      }
   }
  }