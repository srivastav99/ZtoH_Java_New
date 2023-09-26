package Functions;

import java.util.Scanner;

public class Loop_PalindromeorNot {
	//This code is not advised to do with No argument and with return type
	
	/*
	// A R
	public static int Palindrome(int n) {
		
		int digit=0,rev=0;
		int copy = n;
		while(copy!=0) {
			
			digit = copy%10;
			rev = rev*10+digit;
			copy=copy/10;
		}
		
		return rev;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check for palindrome:");
		n=sc.nextInt();
		
		int r=Palindrome(n);
		
		
		if(n==r) {
			System.out.println("The given number "+n+" is a palindrome.");
		}
		else {
			System.out.println("The given number "+n+" is not a palindrome.");
		}	
		
	}
	*/
	
	/*
	//NA NR
		public static void Palindrome() {
			
			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number to check for palindrome:");
			n=sc.nextInt();
			
			int digit=0,rev=0;
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
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Palindrome();
			
		}
		*/
	
	
	/*
	// A NR
		public static void Palindrome(int n) {
			
			int digit=0,rev=0;
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
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number to check for palindrome:");
			n=sc.nextInt();
			
			Palindrome(n);
			
			
			
		}
	*/
	
	
	
	
	//NA R
			public static int[] Palindrome() {
				
				int n;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter a number to check for palindrome:");
				n=sc.nextInt();
				
				int digit=0,rev=0;
				int copy = n;
				while(copy!=0) {
					
					digit = copy%10;
					rev = rev*10+digit;
					copy=copy/10;
				}
				
				int[]a= {n,rev};
				return a;
				
			}
			
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int []a= Palindrome();
				
				if(a[0]==a[1]) {
					System.out.println("The given number "+a[0]+" is a palindrome.");
				}
				else {
					System.out.println("The given number "+a[0]+" is not a palindrome.");
				}
				
			}
		
	
}
