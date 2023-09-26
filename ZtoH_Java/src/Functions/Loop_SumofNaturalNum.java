package Functions;

import java.util.Scanner;

public class Loop_SumofNaturalNum {

	/*
	//R A
	public static int Sum(int n){
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			sum=sum+i;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		n=sc.nextInt();
		
		int res=Sum(n);
		System.out.println("The sum of first 10 natural numbers is:"+res);
	}


*/

	/*
	//NR NA
		public static void Sum(){
			int n;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number:");
			n=sc.nextInt();
			
			int sum=0;
			for(int i=1;i<=n;i++) {
				
				sum=sum+i;
			}
			System.out.println("The sum of first 10 natural numbers is:"+sum);
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Sum();
		}

	
	
*/
	
	
	/*
	//A NR
	public static void Sum(int n){
		
		
		int sum=0;
		for(int i=1;i<=n;i++) {
			
			sum=sum+i;
		}
		System.out.println("The sum of first 10 natural numbers is:"+sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		n=sc.nextInt();
		Sum(n);
	}


	 */
	
	
	//NA R
		public static int Sum(){
			
			int n;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter number:");
			n=sc.nextInt();
			int sum=0;
			for(int i=1;i<=n;i++) {
				
				sum=sum+i;
			}
			
			return sum;
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int res= Sum();
			System.out.println("The sum of first 10 natural numbers is:"+res);
		}

	}
	
	