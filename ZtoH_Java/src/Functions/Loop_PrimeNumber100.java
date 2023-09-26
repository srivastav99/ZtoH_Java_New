package Functions;

import java.util.Scanner;

public class Loop_PrimeNumber100 {

	//This program is not advised to be done with return.
	
	/*
	//A R
		public static int[] Prime(int n) {
			
			int []arr=new int[n];
			
			for (int i = 2; i <= n; i++) {
				
				int flag = 0;

				for (int j = 2; j <= i/2 ; j++) {
					
					if (i % j == 0) {
						flag = 1;

						break; // This is done just to reduce the no.of times loop runs, without break also code will work.
					}
				}
				
				
			
				if (flag == 0) {
					arr[i]=i;

				} 
				
			}
			return arr;
			
		}
		
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a number till which you need prime numbers:");
			int n=sc.nextInt(); 
			
			int []arr = Prime(n);
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					System.out.print(arr[i]+" ");
			}
		}
	}
*/
		
	
	
	
	/*
	//NA NR
	public static void Prime() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number till which you need prime numbers:");
		int n=sc.nextInt(); 
		
		for (int i = 2; i <= n; i++) {
			
			int flag = 0;

			for (int j = 2; j <= i/2 ; j++) {
				
				if (i % j == 0) {
					flag = 1;

					break; // This is done just to reduce the no.of times loop runs, without break also code will work.
				}
			}
			
			
		
			if (flag == 0) {
				System.out.print(i+" ");

			} 
			
		}
		
	}
	
	
	public static void main(String[] args) {

		Prime();

	}
	*/
	
	/*
	//A NR
	public static void Prime(int n) {
		
		
		
		for (int i = 2; i <= n; i++) {
			
			int flag = 0;

			for (int j = 2; j <= i/2 ; j++) {
				
				if (i % j == 0) {
					flag = 1;

					break; // This is done just to reduce the no.of times loop runs, without break also code will work.
				}
			}
			
			
		
			if (flag == 0) {
				System.out.print(i+" ");

			} 
			
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number till which you need prime numbers:");
		int n=sc.nextInt(); 
		
		Prime(n);

	}
	*/

	
	
	
	//NA R
			public static int[] Prime() {
				
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Enter a number till which you need prime numbers:");
				int n=sc.nextInt(); 
				
				int []arr=new int[n];
				
				for (int i = 2; i <= n; i++) {
					
					int flag = 0;

					for (int j = 2; j <= i/2 ; j++) {
						
						if (i % j == 0) {
							flag = 1;

							break; // This is done just to reduce the no.of times loop runs, without break also code will work.
						}
					}
					
					
				
					if (flag == 0) {
						arr[i]=i;

					} 
					
				}
				return arr;
				
			}
			
			
			public static void main(String[] args) {

				
				int []arr = Prime();
				
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=0) {
						System.out.print(arr[i]+" ");
				}
			}
		}
	
}
