package Basic;

import java.util.Scanner;

public class PrimeNumberorNot {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,flag = 0;
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		n= s.nextInt();
		
		/*
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				flag=1;
				
				break;
			}
		}
		*/
		
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
				flag=1;
				
				break;
			}
		}
		
		if(n==1) {
			System.out.println("1 is neither prime nor composite.");
		}
		else if (flag==1) {
			System.out.println("Not a prime number.");
			
		}
		else {
			System.out.println("Prime number.");
		}
	}

}
