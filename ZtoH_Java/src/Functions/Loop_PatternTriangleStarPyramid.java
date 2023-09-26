package Functions;

import java.util.Scanner;

public class Loop_PatternTriangleStarPyramid {
	//This program is advisable to do with return 
	
	
	//A R
	public static char[] PatternTriangle(int n){

		int total=0,count=0;
		
		for(int i=n+1;i<=2*n;i++) {  //size required for storing all elements(spaces and *)
			total+=i;
			
		}
		total=total+(n-1); //size required for storing newline characters
		total=total+1;   //size for required storing 'total' variable.
		char res[]=new char[total] ;
		
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				res[count]=' ';
				count++;
			}
			for(int j=1;j<=i;j++) {
					//System.out.print("*"+" ");
				res[count]='*';
				count++;
				res[count]=' ';
				count++;
			}
			res[count]='\n';
			count++;
			//System.out.println();
		}
	
		res[res.length-1]=(char)(total+'0'); //converting int to char
		
		
		return res;
		
	}
	
	
	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		n = sc.nextInt();    //n=5
		
		char []res= PatternTriangle(n);
		
		int total=(res[res.length-1]-'0');   //converting char to int
		for(int i=0;i<total-1;i++) {
			
			if(res[i]=='\n') {
				System.out.println();
			}
			
			else {
				System.out.print(res[i]);
			}
		}
		
	}
	
	
	
	
	
	/*
	//NA R
		public static char[] PatternTriangle(){

			int n;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter how many lines you want to print:");
			n = sc.nextInt();    //n=5
			
			
			int total=0,count=0;
			for(int i=n+1;i<=2*n;i++) {
				total+=i;
				
			}
			total=total+(n-1);
			total=total+1;
			char res[]=new char[total] ;
			
			
			for(int i=1;i<=n;i++) {
				for(int j=n;j>i;j--) {
					res[count]=' ';
					count++;
				}
				for(int j=1;j<=i;j++) {
						//System.out.print("*"+" ");
					res[count]='*';
					count++;
					res[count]=' ';
					count++;
				}
				res[count]='\n';
				count++;
				
			}
		
			res[res.length-1]=(char)(total+'0');
			return res;
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			char []res= PatternTriangle();
			
			int total=(res[res.length-1]-'0');
			for(int i=0;i<total-1;i++) {
				if(res[i]=='\n') {
					System.out.println();
				}
				
				else {
					System.out.print(res[i]);
				}
			}
			
		}
	*/
	
	
	
	/*
	//NA NR
		public static void PatternTriangle(){
			
			int n;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter how many lines you want to print:");
			n = sc.nextInt();    //n=5
			
			for(int i=1;i<=n;i++) {
				for(int j=n;j>i;j--) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			PatternTriangle();
			
		}
		*/
	
	
	
	
	
	/*
	//A NR
	public static void PatternTriangle(int n){
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		n = sc.nextInt();    //n=5
		
		PatternTriangle(n);
		
	}
	*/
	

}
