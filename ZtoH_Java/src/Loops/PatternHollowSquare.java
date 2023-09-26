package Loops;

import java.util.Scanner;

public class PatternHollowSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//With compensation for new line white space
		/*
		int s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the side:");
		s=sc.nextInt();
		int pt=s;
		for(int i=1;i<=s;i++) {
			
				if(pt==s || pt==1) {
					for(int j=1;j<=s;j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				else {
					for(int k=1;k<=(s*2)-1;k++) {
						if(k==1 || k==s*2-1) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
						
					}
					System.out.println();
				}
				
				pt--;
			
		}
		*/
		
		//Without compensation for newline white space
		/*
		int s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the side:");
		s=sc.nextInt();
		int pt=s;
		for(int i=1;i<=s;i++) {
			
				if(pt==s || pt==1) {
					for(int j=1;j<=s;j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				else {
					for(int k=1;k<=s;k++) {
						if(k==1 || k==s) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
						
					}
					System.out.println();
				}
				
				pt--;
			
		}
		*/
		
		int s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the side:");
		s=sc.nextInt();
		
		for(int i=1;i<=s;i++) {
			
			for(int j=1;j<=s;j++) {
				
				if(j==1 || j==s || i==1 || i==s) {
					
					System.out.print("*");  //To compensate for new line space use ("* ")
				}
				else {
					System.out.print(" ");	//To compensate for new line space use ("  ")
				}
			}
			System.out.println();
		}
	}

}
