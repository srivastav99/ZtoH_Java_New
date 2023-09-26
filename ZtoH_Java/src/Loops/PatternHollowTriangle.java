package Loops;

import java.util.Scanner;


public class PatternHollowTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int sp=1, i=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		int n = sc.nextInt();    //n=5
		
		System.out.println("What to print:");
		String pt = sc.next();  
		
		for(i=1;i<n;i++) { //iterates for one less than last line.
			
			for(int j=i;j<n;j++) {//for printing spaces outside triangle
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
		if(i==n) { // for printing last line
			for(int j =1;j<=n;j++) {
				System.out.print(pt+" ");
			}
		}
		*/
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many number of lines you want to print:");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			for(int j=i;j<num;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				
				if(j==1 || j==i || i==num) {
					
					System.out.print("* ");
				}
				else {
					System.out.print("  ");  //2 spaces , inside the pattern
				}
			}
			System.out.println();
		}

	}

}
