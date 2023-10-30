package TestQS;

import java.util.Scanner;


public class GCD {

	public static void main(String[] args) {
		//for two numbers
		/*
		int a,b,i;
		
		System.out.println("Enter two numbers to find the GCD of two numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b= sc.nextInt();
		
		System.out.print("GCD of "+a+" and "+b+" is:");

		while (a!=b) {
			if(a>b) {
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		
		System.out.print(a);
		*/
		
		
		int []a= {12,52,64,88,16,44,76};
		int maxele = a[0];
		boolean flag = false;
		//Finding the largest number in the array
		for (int i = 1; i < a.length; i++) {
			if(a[i]>maxele) {
				maxele = a[i];
				
			}
		}
		
		for (int i = maxele; i >0 ; i--) {
			if(maxele%i==0) {
				
				for (int j = 0; j < a.length; j++) {
					
					if (a[j]%i==0) {
						flag = true;
					}
					else {
						flag=false;
						break;
					}
				}
				if(flag==true) {
					System.out.println("The GCD of all the elements in the array is:"+i);
					break;
				}
			}
			
		}

	}

}
