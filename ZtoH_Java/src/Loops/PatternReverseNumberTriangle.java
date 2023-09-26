package Loops;

import java.util.Scanner;

public class PatternReverseNumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		n = sc.nextInt();    //n=4
		
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
