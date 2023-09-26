package Functions;

import java.util.Scanner;

public class String_RemoveChar {

	
	
	/*
	//A R
	public static String RemoveChar(String str1,char c) {
		
		String str2= "";
		char[] ch1=str1.toCharArray();
	
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=c) {
				
				str2=str2+ch1[i];
	
			}
		}
		return str2;
		
	}
	
	
	public static void main(String[] args) {

		String str1 = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		
		System.out.println("Enter a character to remove from the string:");
		char c = sc.nextLine().charAt(0);

		String str2=RemoveChar(str1,c);
		
		
		System.out.println("String after removing the given charater from the string:"+str2);
	}
	*/
	
	
	
	/*
	//NA NR
		public static void RemoveChar() {
			
			String str1 = "";
			String str2= "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			System.out.println("Enter a character to remove from the string:");
			char c = sc.nextLine().charAt(0);
			
			char[] ch1=str1.toCharArray();
		
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=c) {
					
					str2=str2+ch1[i];
		
				}
			}
			System.out.println("String after removing the given charater from the string:"+str2);
			
			
		}
		
		
		public static void main(String[] args) {

			RemoveChar();
	
		}
		*/
	
	
	
	/*
	//A NR
		public static void RemoveChar(String str1,char c) {
			
			String str2= "";
			char[] ch1=str1.toCharArray();
		
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=c) {
					
					str2=str2+ch1[i];
		
				}
			}
			System.out.println("String after removing the given charater from the string:"+str2);
			
			
		}
		
		
		public static void main(String[] args) {

			String str1 = "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			System.out.println("Enter a character to remove from the string:");
			char c = sc.nextLine().charAt(0);

			RemoveChar(str1,c);
			
			
			
		}
		*/
	
	
	
	
	//NA R
		public static String RemoveChar() {
			
			String str1 = "";
			String str2= "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			System.out.println("Enter a character to remove from the string:");
			char c = sc.nextLine().charAt(0);
			
			char[] ch1=str1.toCharArray();
		
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=c) {
					
					str2=str2+ch1[i];
		
				}
			}
			return str2;
			
		}
		
		
		public static void main(String[] args) {


			String str2=RemoveChar();
			
			System.out.println("String after removing the given charater from the string:"+str2);
		}

}
