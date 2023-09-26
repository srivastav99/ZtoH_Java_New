package Basic;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without scanner - Without user input
		/*
		double r=5,pi=3.14,a;
		a=pi*r*r;
		System.out.println("Area of circle of radius "+r+" is: "+a);
		*/
		
		//With scanner - With user input
		
		double r,a,pi=22.0/7;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of circle:");
		r=sc.nextDouble();
		
		
		a=pi*r*r;
		System.out.println("Area of circle of radius "+r+" is: "+a);
	}

}
