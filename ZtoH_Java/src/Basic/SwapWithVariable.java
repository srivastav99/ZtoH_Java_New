package Basic;

import java.util.Scanner;

public class SwapWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without scanner - Without user input
		/*
		int a=6, b=8, c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		*/
		
		//With scanner - With user input
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number a:");
		a=sc.nextInt();
		
		System.out.println("Enter number b:");
		b=sc.nextInt();
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		
	}

}
