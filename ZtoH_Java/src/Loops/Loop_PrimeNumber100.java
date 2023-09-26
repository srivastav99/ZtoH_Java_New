package Loops;

import java.util.Scanner;

public class Loop_PrimeNumber100 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number till which you want prime numbers: ");
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
	
	

}
