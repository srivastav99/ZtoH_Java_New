package Functions;

import java.util.Scanner;

public class String_CharacterCount { 

	/*
	//A R
	public static int CharacterCount(String str) {
		
		int count=0;
		char[] ch=str.toCharArray();
		
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		
		int count=CharacterCount(str);
		
		System.out.println("The number of characters in the given string is: "+count);

	}
	*/
	
	
	
	/*
	//NA NR
		public static void CharacterCount() {
			
			String str = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			int count=0;
			char[] ch=str.toCharArray();
			
			
			
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=' ') {
					count++;
				}
			}
			System.out.println("The number of characters in the given string is: "+count);
		}
		
		
		public static void main(String[] args) {

			CharacterCount();

		}
		*/
	
	
	/*
	//A NR
		public static int CharacterCount(String str) {
			
			int count=0;
			char[] ch=str.toCharArray();
			
			
			
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=' ') {
					count++;
				}
			}
			return count;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			
			int count=CharacterCount(str);
			
			System.out.println("The number of characters in the given string is: "+count);

		}
		*/

	
	
	//NA R
		public static int CharacterCount() {
			
			String str = " ";
			int count=0;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			
			char[] ch=str.toCharArray();
			
			
			
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=' ') {
					count++;
				}
			}
			return count;
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int count=CharacterCount();
			
			System.out.println("The number of characters in the given string is: "+count);

		}
		
	
	
}
