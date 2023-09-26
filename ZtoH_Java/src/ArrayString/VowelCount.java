package ArrayString;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		
		char[] ch=str.toCharArray();
		System.out.println("Vowels in the string:");
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.print(ch[i]+" ");
				count++;
			}
		}
		System.out.println();
		
		System.out.println("Number of vowels in the given string:"+count);

	}

}
