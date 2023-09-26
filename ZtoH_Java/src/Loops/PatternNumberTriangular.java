package Loops;

import java.util.Scanner;

public class PatternNumberTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		

	}

}
