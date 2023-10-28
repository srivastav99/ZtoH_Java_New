package TestQS;

import java.util.Scanner;
//Finding occurance of a character in a string without using loop
public class String1_OccuranceOfCharWithoutLoop {

	public static void main(String[] args) {
		
		String s = "Java is a programming language.";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the char to search in the string:");
		char c = sc.next().charAt(0);
		String strchar = ""+c;
		//System.out.println(strchar);
		
		int n = s.length() - s.replaceAll(strchar, "").length();
		
		System.out.println("Given char "+c+" is occuring "+n+" times in the string "+s);

	}

}
