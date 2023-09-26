package Functions;

import java.util.Scanner;

public class String_RemoveDuplicate {

	
	
	/*
	//A R
	public static char[] RemoveDuplicate(String str1) {
		
		char[] ch=str1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] || ch[j]=='&') {
					ch[j]='&';
					
					
				}
			}
			
		}
		return ch;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = " ",str2="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		
		char[] ch=RemoveDuplicate(str1);
		
		for(int i=0;i<ch.length;i++){
			if(ch[i]!='&') {
				str2=str2+ch[i];
			}
			
		}
		System.out.println("String after removing duplicates:"+str2);

	}
	*/
	
	
	
	/*
	//NA NR
		public static void RemoveDuplicate() {
			
			String str1 = " ",str2="";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			char[] ch=str1.toCharArray();
			
			for(int i=0;i<ch.length;i++) {
				
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j] || ch[j]=='&') {
						ch[j]='&';
						
						
					}
				}
				
			}
			for(int i=0;i<ch.length;i++){
				if(ch[i]!='&') {
					str2=str2+ch[i];
				}
				
			}
			System.out.println("String after removing duplicates:"+str2);
			
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			RemoveDuplicate();
			
			

		}
		*/
	
	
	
	
	/*
	//A NR
		public static void RemoveDuplicate(String str1) {
			
			String str2="";
			char[] ch=str1.toCharArray();
			
			for(int i=0;i<ch.length;i++) {
				
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j] || ch[j]=='&') {
						ch[j]='&';
						
						
					}
				}
				
			}
			for(int i=0;i<ch.length;i++){
				if(ch[i]!='&') {
					str2=str2+ch[i];
				}
				
			}
			System.out.println("String after removing duplicates:"+str2);

			
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str1 = " ";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			
			RemoveDuplicate(str1);
			
			
		}
		*/
	
	
	
	
	
	//NA R
		public static char[] RemoveDuplicate() {
			
			String str1 = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str1 = sc.nextLine();
			char[] ch=str1.toCharArray();
			
			
			
			
			for(int i=0;i<ch.length;i++) {
				
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j] || ch[j]=='&') {
						ch[j]='&';
						
						
					}
				}
				
			}
			return ch;
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String str2="";
			char[] ch=RemoveDuplicate();
			
			for(int i=0;i<ch.length;i++){
				if(ch[i]!='&') {
					str2=str2+ch[i];
				}
				
			}
			System.out.println("String after removing duplicates:"+str2);

		}

}
