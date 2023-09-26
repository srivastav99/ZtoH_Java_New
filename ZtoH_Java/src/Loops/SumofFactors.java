package Loops;

import java.util.Scanner;

public class SumofFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find its factors:");
		
		//n=Math.abs(sc.nextInt());
		//or
		n=sc.nextInt();
		
		if(n<0) {  //to convert -ve values to +ve values
			n=-n;
		}
		
		
		if(n>0) {
			for(int i=1;i<=n;i++) {
			
				if(n%i==0) {
					sum=sum+i;
				
				}
			}
		}
		
		System.out.println("Sum of factors of "+n+" is:"+sum);
		
	}

}
