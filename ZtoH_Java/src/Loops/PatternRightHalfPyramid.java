package Loops;

import java.util.Scanner;

public class PatternRightHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		n = sc.nextInt();    //n=5
		
		System.out.println("What to print:");
		String pt = sc.next();  
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(pt);
			}
			System.out.println();
		}

	}

}
