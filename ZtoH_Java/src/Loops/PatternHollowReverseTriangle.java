package Loops;

import java.util.Scanner;

public class PatternHollowReverseTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		int n = sc.nextInt();    //n=5
		int sp=n;
		System.out.println("What to print:");
		String pt = sc.next();  

		
		sp=n*2-5;
		
		for(int i=1;i<=n;i++) {
			
			if(i==1) {
				for(int j=1;j<=n;j++) {
					System.out.print(pt+" ");
				}
				
			}
			else {
			
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(int j=i;j<=n;j++) {
				if( j==i || (j==n && i!=n )) {
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
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many number of lines you want to print:");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
			}
			for(int j=i;j<=num;j++) {
				
				if(j==i || j==num || i==1) {
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
