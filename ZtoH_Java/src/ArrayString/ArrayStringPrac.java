package ArrayString;

import java.util.Scanner;

public class ArrayStringPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str = "I am a human.";
		char[] ch=str.toCharArray();
		
		String []s = {"I am human","sadaded"};
		
		
		for(int i=0;i<ch.length-1;i++) {
			
			System.out.print(ch[i]);
		}
		for(int i=0;i<s.length-1;i++) {
			
			System.out.print(s[i]);
		}
		
	*/
		//converting large to small
		
		/*
		char x='A',chLower;
		int ascii;
		ascii=x+32;
		chLower=(char)ascii;
		if(x>=65 && x<=122) { 
			if(x>=65 && x<=90) {
				
					
				System.out.println("Capital to small:"+chLower);
			}
			
		}
		*/
		
		//converting small to large
		/*
		char x='a',chUpper;
		int ascii;
		ascii=x-32;
		chUpper=(char)ascii;
		if(x>=65 && x<=122) { 
			if(x>=97 && x<=122) {
				
					
				System.out.println("Small to capital:"+chUpper);
			}
			
		}
		*/
		
		//Number of words in a string
		/*
		String str = "i am a human";
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				
			}
			else {
				if((ch[i]==' ' && ch[i-1]!=' ')|| i==ch.length-1) {
					count++;
				}
			}
		}
		System.out.println("The number of words in the given string is: "+count);
		*/
		
		
		/*
		String s="" ;
		char c=' ';
		
		System.out.print(s);
		System.out.println(s.length());
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		String helloString = new String(helloArray);
		
		helloString = helloString+"s"+"v";
		String str = ""+" ";
		System.out.println(str);
		//System.out.println(helloString);
		 */
		
		/*
		int a = 5;
		int c = 5;
		int d= 6;
		
		String s = "vastav";
		String s1 = "vastav";
		String str = new String("vastav");
		String str1 = new String("vastav");
		
		boolean b = (s==str); 
		System.out.println(b);
		b = s.equals(str);
		System.out.println(b);
		b = (s==s1);
		System.out.println(b);
		b = s.equals(s1);
		System.out.println(b);
		b = (str==str1);
		System.out.println(b);
		b = str.equals(str1);
		System.out.println(b);
		
		String s2;
		System.out.println("enter string s2:");
		Scanner sc = new Scanner(System.in);
		s2=sc.nextLine();
		
		String s3;
		System.out.println("enter string s3:");
		s3=sc.nextLine();
		
		String s4;
		s4="vastav";
		
		String s5="";
		System.out.println("enter string s5:");
		s5=sc.nextLine();
		
		String s6="";
		s6="vastav";
		
		b = (s2==s);
		System.out.println(b);
		b = s2.equals(str); 
		System.out.println(b);
		
		System.out.println();
		
		System.out.print("s:");
		System.out.println(System.identityHashCode(s));
		System.out.print("s1:");
		System.out.println(System.identityHashCode(s1));
		System.out.print("s2:");
		System.out.println(System.identityHashCode(s2));
		System.out.print("s3:");
		System.out.println(System.identityHashCode(s3));
		System.out.print("s4:");
		System.out.println(System.identityHashCode(s4));
		System.out.print("s5:");
		System.out.println(System.identityHashCode(s5));
		System.out.print("s6:");
		System.out.println(System.identityHashCode(s6));
		System.out.print("str:");
		System.out.println(System.identityHashCode(str));
		System.out.print("str1:");
		System.out.println(System.identityHashCode(str1));
		
		System.out.println();
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		
		b = (a==c);
		System.out.println(b);
		
		b = (a==d);
		System.out.println(b);
		
		//b =  a.equals(c); //Error - Cannot use equals on the primitive type
		//b = a.equals(c); //Error - Cannot use equals on the primitive type
		*/
		
		char c='a';
	
		char ch=(char)(c-32);
		System.out.println(ch);
		
		char c1='b';
		
		int n=c1;
		char ch1=(char)(n-32);
		System.out.println(ch1);
		/*
		Scanner scanner = new Scanner(System.in);
		char c5 = scanner.next().charAt(0);
		System.out.println(c5);
		*/
	}
	
		
	

}
