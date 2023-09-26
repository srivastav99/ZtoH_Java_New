package Loops;

import java.util.Scanner;

public class PatternDiamond {

	public static void main(String[] args) {
		
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter odd number of lines:");
		n = sc.nextInt(); // n=70
		
		
		for(int i=1;i<=(n/2)+1;i++) {
			
			for(int j=i;j<(n/2)+1;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=n/2;i++) {
			
			for(int j=i;j>=1;j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j=n/2;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
