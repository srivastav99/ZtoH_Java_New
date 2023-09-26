package Functions;

import java.util.Scanner;

public class Loop_PosNegZero {

	//This program is not advised to do with return
	
	/*
	//A R
	public static int[] PNZ(int range) {
		
		int n,countP=0,countN=0, countZ=0 ;
		
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
		int []res= {countP,countN,countZ};
		return res;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers you want to enter:");
		range = sc.nextInt();
		
		int []res=PNZ(range);
		
		System.out.println("Count of positive numbers entered:"+res[0]);
		System.out.println("Count of negative numbers entered:"+res[1]);
		System.out.println("Count of zeros entered:"+res[2]);

	}
	*/
	
	
	
	/*
	//NA NR
		public static void PNZ() {
			
			int n,countP=0,countN=0, countZ=0,range;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter how many numbers you want to enter:");
			range = sc.nextInt();
			
			
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
		
		
		public static void main(String[] args) {

			PNZ();	

		}
		*/
	
	
	
	/*
	//A NR
	public static void PNZ(int range) {
		
		int n,countP=0,countN=0, countZ=0 ;
		
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers you want to enter:");
		range = sc.nextInt();
		
		PNZ(range);
		

	}
	*/
	
	
	
	//NA R
		public static int[] PNZ() {
			
			int n,countP=0,countN=0, countZ=0 ;
			int range;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter how many numbers you want to enter:");
			range = sc.nextInt();
			
			
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
			int []res= {countP,countN,countZ};
			return res;
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int []res=PNZ();
			
			System.out.println("Count of positive numbers entered:"+res[0]);
			System.out.println("Count of negative numbers entered:"+res[1]);
			System.out.println("Count of zeros entered:"+res[2]);

		}
	
	
	
	
	
	
	

}
