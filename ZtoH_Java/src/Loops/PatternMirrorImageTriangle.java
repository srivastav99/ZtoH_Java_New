package Loops;

import java.util.Scanner;

public class PatternMirrorImageTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,k=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many odd lines you want to print:");
		n = sc.nextInt();    //n=7
		
		
		for(int i=1;i<=(n/2)+1;i++) {
			for(int j=i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=i;j<=(n/2)+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			k=i;
		}
		
		for(int i=1;i<=n/2;i++) {
			k=k-i-1;
			for(int j=i;j<n/2;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++) {
				k++;
				System.out.print(k+" ");
				
			}
			System.out.println();
		}

	}

}
