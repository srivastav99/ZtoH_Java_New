package Operators;

import java.util.Scanner;

public class SumandProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Without scanner function - Without taking user inputs
		/*
		int a = 4, b = 5, sum, product;
		sum = a + b;

		product = a * b;

		System.out.println("Sum of " + a + " and " + b + " is " + sum);
		System.out.println("Product of " + a + " and " + b + " is " + product);
		*/
		// With scanner function - taking user inputs
		
		 int a, b, sum, product;
		  
		 Scanner sc = new Scanner(System.in);
		  
		 System.out.println("Enter an integer value of a:");
		 a = sc.nextInt();
		  
		 System.out.println("Enter an integer value of b:"); 
		 b = sc.nextInt();
		  
		 sum = a + b; 
		 product = a * b;
		  
		 System.out.println("Sum of " + a + " and " + b + " is " + sum);
		 System.out.println("Product of " + a + " and " + b + " is " + product);
		 

	}

}
