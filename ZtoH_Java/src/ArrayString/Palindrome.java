package ArrayString;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		String str = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
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

}
