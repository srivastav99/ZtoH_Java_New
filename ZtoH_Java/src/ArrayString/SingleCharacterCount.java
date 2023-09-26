package ArrayString;

import java.util.Scanner;

public class SingleCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		int count=0;
		char[] ch=str.toCharArray();
	
			boolean value;
		
			for(int i=0;i<ch.length;i++) {
				 
				value = true;
				for(int j=0;j<i;j++) {  //This loop is there to check for values which have already repeated(for already found duplicates). 
					
					if(ch[j]==ch[i]) {
						
						value=false;
					}
				}
				if(value) {
					
					count=1;
					for(int j=i+1;j<ch.length;j++) { // This loop is for checking for new duplicate values.
						
						if(ch[i]==ch[j]) {
							
							count++;
							
						}
					}
					
					if(count>1 || count==1) {
						System.out.println(ch[i]+" repeating "+count+" times.");
						
					}
					
				}
			}
			*/
		
		String str = " ";
		char x=' ';
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		
		char[] ch=str.toCharArray();
		
		System.out.println("Enter a character to search for its occurance in the given string:");
		x=sc.nextLine().charAt(0);
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==x) {
				count++;
			}
		}
		System.out.println("The given letter "+x+" appears "+count+" times in the given string.");
		
		}

	}


