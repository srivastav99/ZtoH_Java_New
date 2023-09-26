package Loops;

import java.util.Scanner;

public class PatternZeroOneTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count=1;
		System.out.println("Enter number of lines:");
		int n=sc.nextInt();
		
		
		for(int i=1;i<=n;i++) {    //n=4
			if(i%2==0) {
				count = 0;
			}
			else {
				count = 1;
			}
			for(int j=1;j<=i;j++) {
				
				System.out.print(count+" ");
				if(count == 1) {
					count=0;
				}
				else {
					count=1;
				}
			}
			System.out.println();
		}


	}

}
