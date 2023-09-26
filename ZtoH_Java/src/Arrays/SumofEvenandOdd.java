package Arrays;

import java.util.Scanner;

public class SumofEvenandOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[], sumOdd=0, sumEven=0,n;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		n= sc.nextInt();
		a= new int[n];
		
		System.out.println("Enter values:");
		
		for(int i=0;i<a.length;i++) {
			a[i]= sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
			
				sumEven=sumEven+a[i];
			}
			else {
				
				sumOdd=sumOdd+a[i];
			}
		}
		System.out.println("Sum of even numbers:"+sumEven);
		System.out.println("Sum of odd numbers:"+sumOdd);

	}

}
