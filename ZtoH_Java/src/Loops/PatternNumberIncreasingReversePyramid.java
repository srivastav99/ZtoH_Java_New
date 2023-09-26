package Loops;

import java.util.Scanner;

public class PatternNumberIncreasingReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of lines:");
		int n=sc.nextInt();
		
		
		for(int i=n;i>=1;i--) {    //n=4
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
