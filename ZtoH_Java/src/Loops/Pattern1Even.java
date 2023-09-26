package Loops;

import java.util.Scanner;

public class Pattern1Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
	
					System.out.print(count+" ");

					count=count+2;
			}
			System.out.println();
		}

	}

}
