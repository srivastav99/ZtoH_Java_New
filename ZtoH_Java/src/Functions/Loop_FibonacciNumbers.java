package Functions;

import java.util.Scanner;

public class Loop_FibonacciNumbers {

	//This program is not advised to do with return
	
	
	
	
	/*
	//A R
		public static int[] Fibo(int n) {
			int f1=0,f2=1,f3;
			int []arr=new int[n-2];
			
			 
			for(int i=2;i<n;i++) {
				
				f3=f1+f2;
				//System.out.print(" "+f3);
				arr[i-2]=f3;
				f1=f2;
				f2=f3;
			}
			return arr;
			
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter range:");
			n=sc.nextInt();
			
			int []arr= Fibo(n);
			System.out.print("fibonacci series for the given range: "+0+" "+1+" ");
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			

		}	
		*/
	
	
	
	/*
	//NA NR
	public static void Fibo() {
		int f1=0,f2=1,f3;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter range:");
		n=sc.nextInt();
		System.out.print("fibonacci series for the given range: "+f1+" "+f2);
		
		for(int i=2;i<n;i++) {
			
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}
		
	}
	
	
	
	public static void main(String[] args) {

		Fibo();

	}
	*/
	
	
	
	
	/*
	//A NR
		public static void Fibo(int n) {
			int f1=0,f2=1,f3;
			
			System.out.print("fibonacci series for the given range: "+f1+" "+f2);
			
			for(int i=2;i<n;i++) {
				
				f3=f1+f2;
				System.out.print(" "+f3);
				f1=f2;
				f2=f3;
			}
			
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter range:");
			n=sc.nextInt();
			
			Fibo(n);
			
			

		}
		*/
	
	
		
	
	//NA R
			public static int[] Fibo() {
				int f1=0,f2=1,f3;
				
				int n;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter range:");
				n=sc.nextInt();
				int []arr=new int[n-2];
				
				 
				for(int i=2;i<n;i++) {
					
					f3=f1+f2;
					//System.out.print(" "+f3);
					arr[i-2]=f3;
					f1=f2;
					f2=f3;
				}
				return arr;
				
			}
			
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				
				int []arr= Fibo();
				System.out.print("fibonacci series for the given range: "+0+" "+1+" ");
				for(int i=0;i<arr.length;i++) {
					System.out.print(arr[i]+" ");
				}
				

			}	

}
