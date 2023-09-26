package Loops;

import java.util.Scanner;

public class PatternRightPascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		int num = sc.nextInt();
		
		for(int i=1;i<=(num/2)+1;i++) {
			
			for(int j=1;j<=i;j++) {
				
				if((i+j)%2==0) {
					
					System.out.print(" *");
				}
				else {
					
					System.out.print("  ");
				}
			}
			
			
			System.out.println();
		}
		
		for(int i=2;i<=(num/2)+1;i++) {
			
			for(int j=(num/2)+1;j>=i;j--) {
				
				if((i+j)%2==0)
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
	}

}
