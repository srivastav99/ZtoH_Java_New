package ArrayString;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str = " ";
		char temp=' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length/2;i++) {
			temp=ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=temp;	
			
		}
		System.out.println("Reverse of given string:");
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		*/
		
		
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

}
