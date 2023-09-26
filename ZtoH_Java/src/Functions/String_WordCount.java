package Functions;

import java.util.Scanner;

public class String_WordCount {

	/*
	//A R
	public static int WordCount(String str) {
		
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=1;i<ch.length;i++) {
			
			if(ch[i-1]!=' ' || i==ch.length-1 ) {
				if((ch[i]==' ' && i!=ch.length-1)|| (i==ch.length-1 && ch[i]!=' ')) {
					count++;
				}
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
		
		int count=WordCount(str);
		
		System.out.println("The number of words in the given string is: "+count);

	}
	*/
	
	
	/*
	//NA NR
		public static void WordCount() {
			
			String str = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			int count=0;
			char[] ch=str.toCharArray();
			
			
			for(int i=1;i<ch.length;i++) {
				
				if(ch[i-1]!=' ' || i==ch.length-1 ) {
					if((ch[i]==' ' && i!=ch.length-1)|| (i==ch.length-1 && ch[i]!=' ')) {
						count++;
					}
				}

			}
			System.out.println("The number of words in the given string is: "+count);
			
		}
		
		
		
		public static void main(String[] args) {

			WordCount();
	
		}
		*/
	
	
	/*
	//A NR
		public static void WordCount(String str) {
			
			int count=0;
			char[] ch=str.toCharArray();
			
			
			for(int i=1;i<ch.length;i++) {
				
				if(ch[i-1]!=' ' || i==ch.length-1 ) {
					if((ch[i]==' ' && i!=ch.length-1)|| (i==ch.length-1 && ch[i]!=' ')) {
						count++;
					}
				}

			}
			System.out.println("The number of words in the given string is: "+count);
			
		}
		
		
		
		public static void main(String[] args) {
			
			String str = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			
			WordCount(str);

		}
		*/
	
	
	
	
	//NA R
		public static int WordCount() {
			
			String str = " ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			int count=0;
			char[] ch=str.toCharArray();
			
			
			for(int i=1;i<ch.length;i++) {
				
				if(ch[i-1]!=' ' || i==ch.length-1 ) {
					if((ch[i]==' ' && i!=ch.length-1)|| (i==ch.length-1 && ch[i]!=' ')) {
						count++;
					}
				}

			}
			return count;
		}
		
		
		
		public static void main(String[] args) {
	
			int count=WordCount();
			
			System.out.println("The number of words in the given string is: "+count);

		}


}
