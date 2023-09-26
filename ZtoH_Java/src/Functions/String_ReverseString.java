package Functions;

import java.util.Scanner;

public class String_ReverseString {

	
	/*
	//A R
	public static String ReverseString(String str1) {
		
		String str2="";
		char[] ch=str1.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			str2=str2+ch[i];
		}
		return str2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		
		String str2=ReverseString(str1);
		
		System.out.println("Reverse of given string:"+str2);

	}
	*/
	
	
	/*
	//NA NR
		public static void ReverseString() {
			
			String str1 = "",str2="";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			char[] ch=str1.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--) {
				str2=str2+ch[i];
			}
			System.out.println("Reverse of given string:"+str2);
			
		}
		
		
		public static void main(String[] args) {

			ReverseString();
			
			

		}	
		*/
	
	
	
	
	/*
	//A NR
		public static void ReverseString(String str1) {
			
			String str2="";
			char[] ch=str1.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--) {
				str2=str2+ch[i];
			}
			System.out.println("Reverse of given string:"+str2);
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String str1 = "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			ReverseString(str1);
			
			

		}
		*/
	
		
	
	
	//NA R
		public static String ReverseString() {
			
			String str1 = "",str2="";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			char[] ch=str1.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--) {
				str2=str2+ch[i];
			}
			return str2;
		}
		
		
		public static void main(String[] args) {
	
			String str2=ReverseString();
			
			System.out.println("Reverse of given string:"+str2);

		}	
		

}
