package Functions;

import java.util.Scanner;

public class String_CharacterFirstPosition {

	
	/*
	//A R
	public static int[] CharacterPosition(String str,char c) {
		
		char[] ch=str.toCharArray();
		int flag=0,pos=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==c) {
				flag=1;
				pos=i+1;
				break;
		
			}
		}
		int res[] = {flag,pos};
		return res;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		
		System.out.println("Enter a character:");
		char c = sc.nextLine().charAt(0);
		
		int res[]=CharacterPosition(str,c);
		
		if(res[0]==1) {
			System.out.println("The given character "+c+" is first found at position:"+res[1]);
			
		}
		else {
			 
				System.out.println("The given character is not found in the given sting");
			
		}
		

	}
	*/
	
	
	/*
	//NA NR
		public static void CharacterPosition() {
			
			String str = " ";
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			
			System.out.println("Enter a character:");
			char c = sc.nextLine().charAt(0);
			
			char[] ch=str.toCharArray();
			int flag=0,pos=0;
			
		
			
			
			
			
			for(int i=0;i<ch.length;i++) {
				
				if(ch[i]==c) {
					flag=1;
					pos=i+1;
					break;
					
				}
			}
			
			if(flag==1) {
				System.out.println("The given character "+c+" is first found at position:"+pos);
				
			}
			else {
				 
					System.out.println("The given character is not found in the given sting");
				
			}
			
			
		}
		
		
		public static void main(String[] args) {
	
			CharacterPosition();
	

		}
	*/
	
	
	
	/*
	//A NR
		public static void CharacterPosition(String str,char c) {
			
			char[] ch=str.toCharArray();
			int flag=0,pos=0;
			
			Scanner sc = new Scanner(System.in);
	
			
			for(int i=0;i<ch.length;i++) {
				
				if(ch[i]==c) {
					flag=1;
					pos=i+1;
					break;
					
				}
			}
			if(flag==1) {
				System.out.println("The given character "+c+" is first found at position:"+pos);
				
			}
			else {
				 
					System.out.println("The given character is not found in the given sting");
				
			}
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = " ";
			
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			
			System.out.println("Enter a character:");
			char c = sc.nextLine().charAt(0);
			
			CharacterPosition(str,c);
			

			

		}
		*/
	
	
	//NA R
		public static char[] CharacterPosition() {
			
			String str = " ";
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a string:");
			str = sc.nextLine();
			
			System.out.println("Enter a character:");
			char c = sc.nextLine().charAt(0);
			
			char[] ch=str.toCharArray();
			char flag=0,pos=0;
			int p;
			
			for(int i=0;i<ch.length;i++) {
				
				if(ch[i]==c) {
					flag='1';
					p=i+1;
					pos=(char)(p+'0'); //To convert int to char
					break;
			
				}
			}
			char res[] = {flag,pos,c};
			System.out.println(pos);
			return res;
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			char res[]=CharacterPosition();
			
			if(res[0]=='1') {
				System.out.println("The given character "+res[2]+" is first found at position:"+res[1]);
				
			}
			else {
				 
					System.out.println("The given character is not found in the given sting");
				
			}
			

		}	
	

}
