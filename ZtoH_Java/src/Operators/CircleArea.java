package Operators;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without scanner - Without user input
		/*
		double r=5,a;
		a=(22.0/7)*r*r;
		System.out.println("Area of circle of radius "+r+" is: "+a);
		*/
		
		//With scanner - With user input
		
		double r,a;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of circle:");
		r=sc.nextDouble();
		
		a=(22.0/7)*r*r;
		System.out.println("Area of circle of radius "+r+" is: "+a);
	}

}
