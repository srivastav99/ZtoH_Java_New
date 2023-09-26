package Functions;

import java.util.Scanner;

public class String_Palindrome {

	
	/*
	//A R
	public static int Palindrome(String str) {
		
		int flag=0;
		char[] ch=str.toCharArray();

		for(int i=0;i<ch.length/2;i++) {
			flag=0;
			if(ch[i]==ch[ch.length-1-i]) {
				flag=1;
			}
		}
		return flag;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		
		int flag=Palindrome(str);
		
		if(flag==1) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome.");
		}
	
	}
	*/
	
	
	/*
	//NA NR
		public static void Palindrome() {
			String str = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			
			int flag=0;
			char[] ch=str.toCharArray();

			for(int i=0;i<ch.length/2;i++) {
				flag=0;
				if(ch[i]==ch[ch.length-1-i]) {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.println("The given string is a palindrome");
			}
			else {
				System.out.println("The given string is not a palindrome.");
			}
			
		}
		
		
		
		public static void main(String[] args) {
	
			Palindrome();

		}
		*/
	
	
	
	/*
	//A NR
		public static void Palindrome(String str) {
			
			int flag=0;
			char[] ch=str.toCharArray();

			for(int i=0;i<ch.length/2;i++) {
				flag=0;
				if(ch[i]==ch[ch.length-1-i]) {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.println("The given string is a palindrome");
			}
			else {
				System.out.println("The given string is not a palindrome.");
			}
			
			
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			String str = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			
			Palindrome(str);
			
			
		
		}
		*/
	
	
	
	//NA R
		public static int Palindrome() {
			
			String str = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			int flag=0;
			char[] ch=str.toCharArray();

			for(int i=0;i<ch.length/2;i++) {
				flag=0;
				if(ch[i]==ch[ch.length-1-i]) {
					flag=1;
				}
			}
			return flag;
			
		}
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			
			
			int flag=Palindrome();
			
			if(flag==1) {
				System.out.println("The given string is a palindrome");
			}
			else {
				System.out.println("The given string is not a palindrome.");
			}
		
		}

}
