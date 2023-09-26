package Loops;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=0,f2=1,f3,n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range:");
		n=sc.nextInt();
		
		
		System.out.print("fibonacci series for the given range: "+f1+" "+f2);
		
		
		for(int i=2;i<n;i++) {
			
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}
		

	}

}
