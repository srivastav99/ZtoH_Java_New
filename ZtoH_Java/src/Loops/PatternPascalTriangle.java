package Loops;

import java.util.Scanner;

public class PatternPascalTriangle {

	public static void main(String[] args) {
		
	/*	
		int n,digit=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		n = sc.nextInt();   
		
		for(int i=0;i<n;i++) {
			int total=1;
			for(int j=i+1;j<n;j++) {
				System.out.print(" ");
			}
			if(i==0) {
				System.out.print("1");
			}
			else {
				 for(int j=1;j<=i;j++) {
					 total = total*11;
				 }
				 
				 while(total!=0) {
						digit=total%10;
						System.out.print(digit+" ");
						total=total/10;
					}
			
			}
			System.out.println();
		}
			
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int j=n;j>i;j--) {
				
				System.out.print(" ");
			}
			int num=1;
			
			for(int j=0;j<=i;j++) {
				
				System.out.print(num+" ");
				num = num*(i-j)/(j+1);
			}
			System.out.println();
		}
		
		
		
	}

}
