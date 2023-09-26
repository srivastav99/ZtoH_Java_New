package Functions;

import java.util.Scanner;


public class Loops_Factorial {
	
	/*
	//A R
	public static double fact(int n) {
		
		double fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc	= new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial:");
		int n = sc.nextInt();
		
		double res=fact(n);
		System.out.println("Factorial of "+n+" is "+res);

	}
	*/


	/*
	// NA NR
	public static void fact() {
		
		Scanner sc	= new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial:");
		int n = sc.nextInt();

		double fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact();

	}
	*/
	

	
	
	/*
	// A NR
	public static void fact(int n) {

		double fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		
		System.out.println("Factorial of "+n+" is "+fact);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc	= new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial:");
		int n = sc.nextInt();
		
		 fact(n);

	}
	*/


	
	// NA R
	public static double fact(int n) {

		double fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		
		return fact;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc	= new Scanner(System.in);
		
		System.out.println("Enter a number to find factorial:");
		int n = sc.nextInt();
		
		 double res= fact(n);
		 System.out.println("Factorial of "+n+" is "+res);

	}
	
	
	

}	

