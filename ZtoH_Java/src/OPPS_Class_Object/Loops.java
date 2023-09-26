package OPPS_Class_Object;

import java.util.Scanner;

class SubL{
	
	int num,n,range,pow,x;
	public  void armstrong() {
		
		int  count = 0, digit = 0,sum=0;

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
				  System.out.println("The given number "+num+" is a Armstrong number."); 
			  } 
			  else {
				  System.out.println("The given number "+num+" is not a Armstrong number.");
			  }
		  }
		  else {
			  System.out.println("Invalid input.");
		  }

	}
	
	
	public  void factorial() {
		
		double fact=1;
		
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" is "+fact);

	}
	
	
	
	public void fibonacci() {
		// TODO Auto-generated method stub
		int f1=0,f2=1,f3;
		
		System.out.print("fibonacci series for the given range: "+f1+" "+f2);
		
		
		for(int i=2;i<n;i++) {
			
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}
		
		System.out.println();
	}
	
	
	
	public void factors() {

		if(n<0) {  
			n=-n;
		}
		System.out.print("Factors of given number:");
		
		if(n>0) {
			for(int i=1;i<=n;i++) {
			
				if(n%i==0) {
					System.out.print(i);
					if(i!=n) {
						System.out.print(",");
					}
				
				}
			}
		}
		else {
			System.out.println("No factors");
		}
		
		System.out.println();
	}
	
	
	
	
	public void prime() {
		
		for (int i = 2; i <= n; i++) {
			
			int flag = 0;

			for (int j = 2; j <= i/2 ; j++) {
				
				if (i % j == 0) {
					flag = 1;

					break; // This is done just to reduce the no.of times loop runs, without break also code will work.
				}
			}

			if (flag == 0) {
				System.out.print(i+" ");

			} 
			
		}
		System.out.println();
		
	}

	
	
	public void multiplicationTable() {

		if(num>0) {
			
		System.out.println("The multiplication table of "+num+" is:");
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+"*"+i+"="+num*i);
		}
		}
		else {
			System.out.println("The given number is not a positive number.");
		}

	
	}
	
	
	
	public void palindrome() {
		
		int digit=0,rev=0;
		
		
		int copy = n;
		while(copy!=0) {
			
			digit = copy%10;
			rev = rev*10+digit;
			copy=copy/10;
		}
		
		if(n==rev) {
			System.out.println("The given number "+n+" is a palindrome.");
		}
		else {
			System.out.println("The given number "+n+" is not a palindrome.");
		}
	}

	
	
	public void perfectnumber() {
		
		int sum=0;
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+" is a perfect number.");
		}
		else {
			System.out.println(n+" is not a perfect number.");
		}

	}

	
	
	
	public void posNegZero() {
		
		int countP=0,countN=0, countZ=0 ;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=1;i<=range;i++) {
			System.out.println("Enter number "+i+":");
			n = sc.nextInt();
			
			if(n>0) {
				countP++;
			}
			else if(n<0){
				countN++;
				
			}
			else {
				countZ++;
			}
		}
		System.out.println("Count of positive numbers entered:"+countP);
		System.out.println("Count of negative numbers entered:"+countN);
		System.out.println("Count of zeros entered:"+countZ);
		
		

	}
	
	
	
	public void powerFunction() {
		
		int total=1;

		 for(int i=1;i<=pow;i++) {
			 total = total*n;
		 }
		 System.out.println(n+" power "+pow+" is "+total);

	}


	
	public void randomNumber() {
	
			Scanner sc =new Scanner(System.in);
		while(true) {
			
			if(num>x) {
				
				System.out.println("Too high,try again.");
			}
			else if(num<x){
				System.out.println("Too low,try again.");
			}
			else {
				System.out.println("Congrats, you guessed right.");
				break;
			}
			System.out.println("Guess the number:");
			num = sc.nextInt(); 
			
		}
		

	}
	
	
	
	public void smallestLargest() {
		
		int n, s=0,L=0, count=0;
		
		Scanner sc = new Scanner(System.in);
		
		
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

	
	
	public void spyNumber() {
		
		
		int digit,sum=0,product=1;
		
		int num=n;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			product=product*digit;
			num=num/10;
			
		}
		
		if(sum==product) {
			System.out.println(n+" is a spy number.");
		}
		else {
			System.out.println(n+" is not a spy number.");
		}

	}
	
	
	
	public void sumEvenOdd() {
		
		int n, sumOdd=0,sumEven=0 ;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=1;i<=range;i++) {
			System.out.println("Enter number "+i+":");
			n = sc.nextInt();
			
			if(n%2==0) {
				sumEven = sumEven+n;
			}
			else {
				sumOdd +=n;
			}
		}
		System.out.println("Sum of even numbers:"+sumEven);
		System.out.println("Sum of odd numbers:"+sumOdd);

	}


	
	
	public void sumoffactors() {
		
		int sum=0;
		
		
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

	
	
	public void sumNaturalNumbers() {
		
		int sum=0;
		
		for(int i=1;i<=10;i++) {
			
			sum=sum+i;
		}
		System.out.println("The sum of first 10 natural numbers is:"+sum);
	}
}




class Loops {

	public static void main(String[] args) {
		
		SubL obj = new SubL();
		
		System.out.println("Armstrong program:");
		
		obj.num=153;
		obj.armstrong();
		
		System.out.println();
		
		System.out.println("Factorial program:");
		
		obj.n=3;
		obj.factorial();
		
		System.out.println();
		
		System.out.println("Fibonacci numbers program:");
		
		obj.n=5;
		obj.fibonacci();
		
		System.out.println();
		
		System.out.println("Factors program:");
		
		obj.n=4;
		obj.factors();
		
		System.out.println();
		
		System.out.println("Prime numbers program:");
		
		obj.n=100;
		obj.prime();
		
		System.out.println();
		
		System.out.println("Multiplication Table program:");
		
		obj.num=5;
		obj.multiplicationTable();
		
		System.out.println();
		
		System.out.println("Palindrome program:");
		
		obj.n=23;
		obj.palindrome();
		
		System.out.println();
		
		System.out.println("Perfect number program:");
		
		obj.n=6;
		obj.perfectnumber();
		
		System.out.println();
		
		System.out.println("Positive,negative,zero program:");

		obj.range=5;
		obj.posNegZero();
		
		System.out.println();
		
		System.out.println("Power Function program:");
		
		obj.n=3;
		obj.pow=3;
		obj.powerFunction();
		
		System.out.println();
		
		System.out.println("Random Numbers program:");
		
		obj.x=23;
		obj.num=23;
		obj.randomNumber();
		
		System.out.println();
		
		System.out.println("Smallest,Largest program:");
		
		obj.range=5;
		obj.smallestLargest();
		
		System.out.println();
		
		System.out.println("Spy numbers program:");
		
		obj.n=22;
		obj.spyNumber();
		
		System.out.println();
		
		System.out.println("Sum of even and odd program:");
		
		obj.range=5;
		obj.sumEvenOdd();
		
		System.out.println();
		
		System.out.println("Sum of factors program:");
		
		obj.n=6;
		obj.sumoffactors();
		
		System.out.println();
		
		System.out.println("Sum of natural numbers:");
		
		obj.sumNaturalNumbers();
		

	}

}
