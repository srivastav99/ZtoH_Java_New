package Loops;

import java.util.Scanner;

public class Pattern1Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no.of lines:");
		int n = sc.nextInt();
		
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
