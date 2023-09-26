package Functions;

import java.util.Scanner;

public class Loop_ArmsrongorNot2 {
	
	// This program is not advised to do with NA R
	/*
	//A R
	public static int ArmStrong(int num){
		
		int count = 0, digit = 0,sum=0;
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
				for (int i = 1; i <= count; i++) {
					 
					mul = mul*digit; // Builds up the number in reverse order
					
				}
				
				sum=sum+mul;
				
				n = n / 10; // Eliminates the last digit as it is no longer required.
				
			  }
			  return sum;
			  
		}
		else {
			  return sum=num-1; // Giving num-1 since we
		  }
		
	}
	

	public static void main(String[] args) {
		
		int num; 

		Scanner sc = new Scanner(System.in);

		  System.out.println("Enter a positive number to check for Armstrong:"); 
		  num = sc.nextInt();
		  
		
		 int res = ArmStrong(num);
		  
		  if(num==res) {
			  System.out.println("The given number is a Armstrong number."); 
		  } 
		  else if(res==num-1) {
			  System.out.println("Invalid input.");
		  }
		  else {
			  System.out.println("The given number is not a Armstrong number.");
		  }
	  }
	  */

	/*
	//NA NR
	public static void ArmStrong(){
		
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
				for (int i = 1; i <= count; i++) {
					 
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
	

	public static void main(String[] args) {
		
		ArmStrong();
	  }
	  */
	
	
	
	/*
	//A NR
	public static void ArmStrong(int num){
		
		int count = 0, digit = 0,sum=0;

		
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
				for (int i = 1; i <= count; i++) {
					 
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
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		  System.out.println("Enter a positive number to check for Armstrong:"); 
		  int num = sc.nextInt();
		 ArmStrong(num);
	  }
	  */
	
	
	
	
	//NA R
		public static int[] ArmStrong(){
			
			int num; 
			int count = 0, digit = 0,sum=0;
			

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
					for (int i = 1; i <= count; i++) {
						 
						mul = mul*digit; // Builds up the number in reverse order
						
					}
					
					sum=sum+mul;
					
					n = n / 10; // Eliminates the last digit as it is no longer required.
					
				  }
				  int []res= {sum,num};
				  return res;
				  
			}
			else {
				int []res= {num,num-1};
				  return res; // Giving num-1 since we
			  }
			
			
		}
		

		public static void main(String[] args) {
	
			 int []res = ArmStrong();
			  
			  if(res[0]==res[1]) {
				  System.out.println("The given number is a Armstrong number."); 
			  } 
			  else if(res[0]-1==res[1]) {
				  System.out.println("Invalid input.");
			  }
			  else {
				  System.out.println("The given number is not a Armstrong number.");
			  }
		  }
	
	

	

}
