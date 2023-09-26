package Basic;

import java.util.Scanner;

public class TwoNumberEqualsforThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		a=sc.nextInt();
		
		System.out.println("Enter second number:");
		b=sc.nextInt();
		
		System.out.println("Enter third number:");
		c=sc.nextInt();
		
		/*if(a==b && a==c) {
			System.out.println("All three numbers are equal.");
		}
		else if(a==b) {
			System.out.println("First number "+a+" and second number "+b+" are equal.");
		}
		else if(a==c) {
			System.out.println("First number "+a+" and third number "+c+" are equal.");
		}
		
		else if(b==c) {
			System.out.println("Second number "+b+" and third number "+c+" are equal.");
		}
		else {
			System.out.println("None of them are equal.");
		}*/
		if(a==b || b==c || a==c) {
			System.out.println("Two numbers out of the given three are equal.");
			if(a==b && a==c ) {
				System.out.println("All the numbers are also equal");
				}
			}
			
		else {
			System.out.println("None of th given numbers are equal.");
			}

	}

}
