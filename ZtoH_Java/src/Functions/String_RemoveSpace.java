package Functions;

import java.util.Scanner;

public class String_RemoveSpace {

	
	
	/*
	//A R
	public static String RemoveSpace(String str1) {
		
		String str2= "";
		char[] ch1=str1.toCharArray();
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=' ') {
				
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
		
		String str2=RemoveSpace(str1);
		
		System.out.println("String after removing spaces from the string:"+str2);

	}
	*/
	
	
	/*
	//NA NR
		public static void RemoveSpace() {
			
			String str1 = "";
			String str2= "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			char[] ch1=str1.toCharArray();
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=' ') {
					
					str2=str2+ch1[i];
		
				}
			}
			System.out.println("String after removing spaces from the string:"+str2);
			
			
		}
		
		
		
		public static void main(String[] args) {
	
			RemoveSpace();

		}
		*/
	
	
	
	/*
	//A NR
		public static void RemoveSpace(String str1) {
			
			String str2= "";
			char[] ch1=str1.toCharArray();
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=' ') {
					
					str2=str2+ch1[i];
		
				}
			}
			System.out.println("String after removing spaces from the string:"+str2);
			
		}
		
		
		
		public static void main(String[] args) {
			
			String str1 = "";
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			RemoveSpace(str1);
			
			

		}
		*/
	
	
	
	
	//NA R
		public static String RemoveSpace() {
			
			String str1 = "";
			String str2= "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			char[] ch1=str1.toCharArray();
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=' ') {
					
					str2=str2+ch1[i];
		
				}
			}
			return str2;
			
		}
		
		
		
		public static void main(String[] args) {
			
	
			String str2=RemoveSpace();
			
			System.out.println("String after removing spaces from the string:"+str2);

		}
		


}
