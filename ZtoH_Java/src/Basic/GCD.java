package Basic;

import java.util.Scanner;

public class GCD {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number:");
		a = sc.nextInt();
		
		System.out.println("Enter second number:");
		b = sc.nextInt();
		
		/*
		int i = a<b?a:b;
		while(true)
		{
			if(a%i==0 && b%i==0) {
				System.out.println("GCD:"+i);
				break;
			}
			i--;
		}
		
		*/
		
		/*
		while(true) {
			int i = a%b;
			if(a%b==0) {
				System.out.println("GCD:"+b);
				break;
			}
			a=b;
			b=i;
		}
		
		*/
		
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else {
				b=b-a;
			}
		}
		System.out.println("GCD:"+a);
		
	}

}
