package Loops;

import java.util.Scanner;

public class PalindromeorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,digit=0,rev=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check for palindrome:");
		n=sc.nextInt();
		
		int copy = n;
		while(copy!=0) {
			
			digit = copy%10;
			rev = rev*10+digit;
			copy=copy/10;
		}
		
		if(n==rev) {
			System.out.println("The given number "+n+" is a palindrome.");
		}
		else {
			System.out.println("The given number "+n+" is not a palindrome.");
		}
	}

}
