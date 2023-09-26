package Functions;

import java.util.Scanner;

public class Loop_PowerFunction {

	
	
	//A R
	public static int Power(int n,int pow) {
		int total=1;
		 for(int i=1;i<=pow;i++) {
			 total = total*n;
		 }
		 return total;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,pow;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number:");
		 n = sc.nextInt();
		 
		 System.out.println("Enter the power value:");
		 pow = sc.nextInt();
		 
		int res = Power(n, pow);
		 System.out.println(n+" power "+pow+" is "+res);

	}
	
	
	
	/*
	//NA NR
		public static void Power() {
			int n,pow;
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter a number:");
			 n = sc.nextInt();
			 
			 System.out.println("Enter the power value:");
			 pow = sc.nextInt();
			 int total=1;
			 for(int i=1;i<=pow;i++) {
				 total = total*n;
			 }
			 System.out.println(n+" power "+pow+" is "+total);
		}
		
		public static void main(String[] args) {
 
			Power();
			

		}
		
		*/
	
	/*
	//A NR
	public static void Power(int n,int pow) {
		
		 int total=1;
		 for(int i=1;i<=pow;i++) {
			 total = total*n;
		 }
		 System.out.println(n+" power "+pow+" is "+total);
	}
	
	public static void main(String[] args) {
		
		int n,pow;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number:");
		 n = sc.nextInt();
		 
		 System.out.println("Enter the power value:");
		 pow = sc.nextInt();
		 Power(n,pow);
		

	}
	*/
	
	/*
	//NA R
	public static int Power() {
		int n,pow;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number:");
		 n = sc.nextInt();
		 
		 System.out.println("Enter the power value:");
		 pow = sc.nextInt();
		 int total=1;
		 for(int i=1;i<=pow;i++) {
			 total = total*n;
		 }
		 return total;
	}
	
	public static void main(String[] args) {

		int res = Power();
		
		System.out.println("Result:"+res);
	}
	*/
	
	
	

}
