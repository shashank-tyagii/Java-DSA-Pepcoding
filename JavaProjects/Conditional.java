package JavaProjects;
import java.util.Scanner;

public class Conditional {

	public Conditional() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		  @SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
	      int marks = scn.nextInt();
	      if ((marks>90) && (marks<=100))
	      { System.out.println("Excellent");}
	      else if ((marks>80) && (marks<=90))
	      { System.out.println("Good");}
	      else if ((marks>70) && (marks<=80))
	      { System.out.println("Fair");}
	      else if ((marks>60) && (marks<=70))
	      { System.out.println("Meets expectations");}
	      else
	      { System.out.println("Below par");}
	      }
	  
	}
