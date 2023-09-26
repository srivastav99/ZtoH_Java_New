package Operators;

import java.util.Scanner;

public class SwapWithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without scanner - Without user input
		/*
		int a=6, b=8;
		
		System.out.println("Before swapping, the values of a and b respectively are: "+a+" and "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		*/
		
		//With scanner - With user input
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a:");
		a=sc.nextInt();
		
		System.out.println("Enter number b:");
		b=sc.nextInt();
		
		System.out.println("Before swapping, the values of a and b respectively are: "+a+" and "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);

	}

}
