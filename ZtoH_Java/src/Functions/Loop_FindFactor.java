package Functions;

import java.util.Scanner;


public class Loop_FindFactor {

	//This program is not advised to do with return type
	
	
	/*
	//A R
		public static int[] Factors(int n) {
			
			int []arr=new int[n];
			
			if(n<0) {  //to convert -ve values to +ve values
				n=-n;
			}
			
			if(n>0) {
				for(int i=1;i<=n;i++) {
				
					if(n%i==0) {
						//System.out.print(i+" ");
						arr[i-1]=i;
					
					}
				}
			}
			else {
				//System.out.println("No factors");
				arr[0]=-1;
			}
			return arr;
			
		}
		
		
		
		public static void main(String[] args) {
			
			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number to find its factors:");
			
			//n=Math.abs(sc.nextInt());
			//or
			n=sc.nextInt();
			
			int []arr= Factors(n);
			
			if(arr[0]==-1) {
				System.out.println("No factors");
			}
			else {
				System.out.println("Factors of "+n+" :");
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=0) {
						System.out.print(arr[i]+" ");
					}
				}
			}

		}
		*/
	
	
	
	
	
	/*
	//NA NR
		public static void Factors() {
			
			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number to find its factors:");
			
			//n=Math.abs(sc.nextInt());
			//or
			n=sc.nextInt();
			
			if(n<0) {  //to convert -ve values to +ve values
				n=-n;
			}
			System.out.print("Factors of given number:");
			
			if(n>0) {
				for(int i=1;i<=n;i++) {
				
					if(n%i==0) {
						System.out.print(i+" ");
					
					}
				}
			}
			else {
				System.out.println("No factors");
			}
			
			
		}
		
		
		
		public static void main(String[] args) {

			Factors();

		}
		*/
	
	
	
	/*
	//A NR
	public static void Factors(int n) {
		
		if(n<0) {  //to convert -ve values to +ve values
			n=-n;
		}
		System.out.print("Factors of given number:");
		if(n>0) {
			for(int i=1;i<=n;i++) {
			
				if(n%i==0) {
					System.out.print(i+" ");
				
				}
			}
		}
		else {
			System.out.println("No factors");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find its factors:");
		
		//n=Math.abs(sc.nextInt());
		//or
		n=sc.nextInt();
		
		Factors(n);

	}
	*/
	
		
	
	
	
	//NA R
			public static int[] Factors() {
				
				int n;
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number to find its factors:");
				
				//n=Math.abs(sc.nextInt());
				//or
				n=sc.nextInt();
				
				int []arr=new int[n+1];
				
				if(n<0) {  //to convert -ve values to +ve values
					n=-n;
				}
				
				if(n>0) {
					for(int i=1;i<=n;i++) {
					
						if(n%i==0) {
							//System.out.print(i+" ");
							arr[i-1]=i;
						
						}
					}
				}
				else {
					//System.out.println("No factors");
					arr[0]=-1;
				}
				arr[arr.length-1]=n;
				return arr;
				
			}
			
			
			
			public static void main(String[] args) {
				
	
				int []arr= Factors();
				
				if(arr[0]==-1) {
					System.out.println("No factors");
				}
				else {
					System.out.println("Factors of "+(arr.length-1)+" :");
					for(int i=0;i<arr.length-1;i++) {
						if(arr[i]!=0) {
							System.out.print(arr[i]+" ");
						}
					}
				}

			}

}
