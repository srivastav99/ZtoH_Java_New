package Loops;

import java.util.Scanner;

public class ArmsrongorNot2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count = 0, digit = 0,sum=0;

		Scanner sc = new Scanner(System.in);

		
		  System.out.println("Enter a positive number to check for Armstrong:"); 
		  num = sc.nextInt();
		  int  n=num;
		
		  if(n>0) {

			  while(n>0) {
		 
				  n=n/10; 
				  count++;
			  } 
			  n=num;
			  while (n > 0) {

				
				digit = n % 10; // Gives last digit of the number
				int mul=1;
				for(int i = 1; i <= count; i++) {
					 
					mul = mul*digit; // Builds up the number in reverse order
					
				}
				
				sum=sum+mul;
				
				n = n / 10; // Eliminates the last digit as it is no longer required.
			  }
			  if(num==sum) {
				  System.out.println("The given number is a Armstrong number."); 
			  } 
			  else {
				  System.out.println("The given number is not a Armstrong number.");
			  }
		  }
		  else {
			  System.out.println("Invalid input.");
		  }

	}

}
