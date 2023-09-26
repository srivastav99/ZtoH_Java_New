package ArrayString;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		
		String str = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=1;i<ch.length;i++) {
			/*
			//does not work if last element is single letter like a b c d it gives only 3 words.
			if(ch[i-1]==' ') {
				
			}
				
			else {
				if(ch[i]==' ' || i==ch.length-1 ) {
					count++;
				}
			}
			*/
			
			
			if(ch[i-1]!=' ' || i==ch.length-1 ) {
				if((ch[i]==' ' && i!=ch.length-1)|| (i==ch.length-1 && ch[i]!=' ')) {
					count++;
				}
			}
			
			
		}
		System.out.println("The number of words in the given string is: "+count);

	}

}
