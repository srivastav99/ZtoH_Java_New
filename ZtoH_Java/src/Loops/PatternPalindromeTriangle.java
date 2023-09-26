package Loops;

import java.util.Scanner;

public class PatternPalindromeTriangle {

	public static void main(String[] args) {
	
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		n = sc.nextInt(); 
		
		for(int i=1;i<=n;i++) {   //n=4
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
