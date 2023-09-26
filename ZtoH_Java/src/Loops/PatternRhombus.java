package Loops;

import java.util.Scanner;


public class PatternRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		n = sc.nextInt(); // n=5
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
