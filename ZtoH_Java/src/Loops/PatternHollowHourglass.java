package Loops;

import java.util.Scanner;

public class PatternHollowHourglass {

	public static void main(String[] args) {
		/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter odd number of lines you want to print:");
		int n = sc.nextInt();    //n=7
		int sp=n;
		System.out.println("What to print:");
		String pt = sc.next();  

		
		sp=n-4;
		
		for(int i=1;i<=n/2+1;i++) {
			
			if(i==1) {
				for(int j=1;j<=(n/2)+1;j++) {
					System.out.print(pt+" ");
				}
				
			}
			else {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=i;j<=(n/2)+1;j++) {
				if( j==i || (j==(n/2)+1 )) {
					System.out.print(pt);
				}
				if(j==i) {
					for(int k=sp;k>=1;k--) {
					System.out.print(" ");
					}
					sp=sp-2;
				}
					
				
			}
			//System.out.println();
		}
			System.out.println();
		}
		
		sp=1;
		
		for(int i=2;i<=(n/2)+1;i++) { //iterates for one less than last line.
			
			if(i!=(n/2)+1) {
			for(int j=i;j<=(n/2);j++) {//for printing spaces outside triangle
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=i;j++) {
				if(j==1 || j==i) {
					System.out.print(pt);
					
					
				}
				if(j==1 && i!=1) { // for printing spaces in the middle
					
					for(int k=sp;k>=1;k--) {
						System.out.print(" ");
						
						
					}
					sp=sp+2;
					
				}

			}
			
			System.out.println();
			
			
		}
			else {
				for(int j=1;j<=(n/2)+1;j++) {
					System.out.print(pt+" ");
		}
			}
		
			
		}
		/*
		if(int i==n) { // for printing last line
			for(int j =1;j<=n;j++) {
				System.out.print(pt+" ");
			}
			
		}
		*/
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many odd number of lines you want to print:");
		int num = sc.nextInt();
		
		for(int i=1;i<=num/2+1;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print(" ");
			}
			for(int j=num/2+1;j>=i;j--) {
				
				if(j==i || j==num/2+1 || i==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");   //2 spaces , inside the pattern
				}
			}
			System.out.println();
		}

		
		
		for(int i=2;i<=num/2+1;i++) {
			
			for(int j=num/2+1;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				
				if(j==1 || j==i || i==num/2+1) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");   //2 spaces , inside the pattern
				}
			}
			System.out.println();
		}

	}

}
