package Loops;

import java.util.Scanner;

public class SmallestLargestSimple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, range, s=0,L=0, count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers you want to enter:");
		range = sc.nextInt();
		
		if(range>=1) {
			for(int i=1;i<=range;i++) {
				System.out.println("Enter number "+i+":");
				n = sc.nextInt();
				if(count==0) {
					s=n;
					L=n;
					count=1;
				}
				if(n<s) {
					s=n;
				}
		
				if(n>L) { // can use else if also here
					L=n;
				}
			}
		
		
		System.out.println("Smallest number entered:"+s);
		System.out.println("Largest number entered:"+L);
		}
		else if(range<0) {
			System.out.println("Invalid input.");
		}
		else {
			System.out.println("No numbers to compare.");
		}
	}

}
