package Functions;

import java.util.Scanner;

public class Array_SumofEvenandOdd {

	
	/*
	//A R
	public static int[] SumofEvenandOdd(int a[]) {
		
		int sumOdd=0, sumEven=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			
				sumEven=sumEven+a[i];
			}
			else {
				
				sumOdd=sumOdd+a[i];
			}
		}
		int []OddEven= {sumOdd,sumEven};
		return OddEven;
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int a[],n;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		n= sc.nextInt();
		a= new int[n];
		
		System.out.println("Enter values:");
		
		for(int i=0;i<a.length;i++) {
			a[i]= sc.nextInt();
			
		}
		
		int []OddEven = SumofEvenandOdd(a);
		
		
		System.out.println("Sum of odd numbers:"+OddEven[0]);
		System.out.println("Sum of even numbers:"+OddEven[1]);
		

	}
	*/
	
	
	
	
	/*
	//NA NR
		public static void SumofEvenandOdd() {
			
			int a[],n;

			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter size of array:");
			n= sc.nextInt();
			a= new int[n];
			
			System.out.println("Enter values:");
			
			for(int i=0;i<a.length;i++) {
				a[i]= sc.nextInt();
				
			}
			int sumOdd=0, sumEven=0;
			
			for(int i=0;i<a.length;i++) {
				if(a[i]%2==0) {
				
					sumEven=sumEven+a[i];
				}
				else {
					
					sumOdd=sumOdd+a[i];
				}
			}
			
			
			System.out.println("Sum of odd numbers:"+sumOdd);
			System.out.println("Sum of even numbers:"+sumEven);
			
			
		}
		
		
		
		
		public static void main(String[] args) {

			SumofEvenandOdd();

		}
		*/
	
	
	/*
	//A NR
	public static void SumofEvenandOdd(int a[]) {
		
		int sumOdd=0, sumEven=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			
				sumEven=sumEven+a[i];
			}
			else {
				
				sumOdd=sumOdd+a[i];
			}
		}
		
		System.out.println("Sum of odd numbers:"+sumOdd);
		System.out.println("Sum of even numbers:"+sumEven);
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		int a[],n;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		n= sc.nextInt();
		a= new int[n];
		
		System.out.println("Enter values:");
		
		for(int i=0;i<a.length;i++) {
			a[i]= sc.nextInt();
			
		}
		
		SumofEvenandOdd(a);
		
	}
	*/
	
	
	//NA R
	public static int[] SumofEvenandOdd() {
		
		int a[],n;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		n= sc.nextInt();
		a= new int[n];
		
		System.out.println("Enter values:");
		
		for(int i=0;i<a.length;i++) {
			a[i]= sc.nextInt();
			
		}
		int sumOdd=0, sumEven=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			
				sumEven=sumEven+a[i];
			}
			else {
				
				sumOdd=sumOdd+a[i];
			}
		}
		int []OddEven= {sumOdd,sumEven};
		return OddEven;

		
	}
	
	
	
	
	public static void main(String[] args) {

		
		int []OddEven = SumofEvenandOdd();
		
		
		System.out.println("Sum of odd numbers:"+OddEven[0]);
		System.out.println("Sum of even numbers:"+OddEven[1]);

	}
	

}

