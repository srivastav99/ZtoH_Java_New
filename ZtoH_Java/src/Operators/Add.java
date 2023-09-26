package Operators;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without scanner - Without user input
		/*
		int a=8;
		double b=2345, res1;
		res1 = (a+b)/3;
		res1 = (res1%5)*5;
		System.out.println("Final result: "+ res1);
		*/
		//or
		//System.out.println((((8.0+2345)/3)%5)*5);
		
		//With scanner - With user input
		
		int a;
		double  b,res1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a:");
		a=sc.nextInt();
		
		System.out.println("Enter number b:");
		b=sc.nextDouble();
		
		res1 = (a+b)/3;
		//System.out.println(res1);
		res1 = (res1%5)*5;
		
		System.out.println("Final result: "+ res1);
		
	}

}
