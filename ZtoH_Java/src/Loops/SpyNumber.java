package Loops;

import java.util.Scanner;


public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,digit,sum=0,product=1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number:");
		n=sc.nextInt();
		
		int num=n;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			product=product*digit;
			num=num/10;
			
		}
		
		if(sum==product) {
			System.out.println(n+" is a spy number.");
		}
		else {
			System.out.println(n+" is not a spy number.");
		}

	}

}
