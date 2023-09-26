package Basic;

import java.util.Scanner;

public class Arithmetic_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, option;
		double b, res;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Please select\n 1 to add\n 2 to subtract\n 3 to multiply \n 4 to divide.");
		option = sc.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("Enter first number:");
			a=sc.nextInt();
			
			System.out.println("Enter second number:");
			b=sc.nextDouble();
			res = a+b;
			System.out.println("Sum of "+a+" and "+b+" :"+res);
			break;
			
		case 2:
			
			System.out.println("Enter first number:");
			a=sc.nextInt();
			
			System.out.println("Enter second number:");
			b=sc.nextDouble();
			res = a-b;
			System.out.println("Difference of "+a+" and "+b+" :"+res);
			break;
			
		case 3:
			
			System.out.println("Enter first number:");
			a=sc.nextInt();
			
			System.out.println("Enter second number:");
			b=sc.nextDouble();
			res = a*b;
			System.out.println("Multiplication of "+a+" and "+b+" :"+res);
			break;
			
		case 4:
			
			System.out.println("Enter first number:");
			a=sc.nextInt();
			
			System.out.println("Enter second number:");
			b=sc.nextDouble();
			res = a/b;
			System.out.println("Division of "+a+" by "+b+" :"+res);
			break;
			
			
		default:
			System.out.println("Invalid data entered.");
			
		}
		
	}

}
