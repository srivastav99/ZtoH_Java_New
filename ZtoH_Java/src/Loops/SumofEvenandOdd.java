package Loops;

import java.util.Scanner;

public class SumofEvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, range, sumOdd=0,sumEven=0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers you want to enter:");
		range = sc.nextInt();
		
		for(int i=1;i<=range;i++) {
			System.out.println("Enter number "+i+":");
			n = sc.nextInt();
			
			if(n%2==0) {
				sumEven = sumEven+n;
			}
			else {
				sumOdd +=n;
			}
		}
		System.out.println("Sum of even numbers:"+sumEven);
		System.out.println("Sum of odd numbers:"+sumOdd);

	}

}
