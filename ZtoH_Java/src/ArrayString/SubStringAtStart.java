package ArrayString;

import java.util.Scanner;

public class SubStringAtStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str = " ";
		int flag=0;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!=' ') {
				for(int j=i;j<ch.length;j++) {
					if(ch[j]!=' ') {
						System.out.print(ch[j]);
					}
					else {
						flag=1;
						break;
						
					}
					
				}
				if(flag==1) {
					break;
				}
			}
		}
		*/
		
		String str = " ";
		String substr = " ";
		int flag=0;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		char[] ch=str.toCharArray();
		
		System.out.println("Enter sub - string:");
		substr = sc.nextLine();
		char[] chsub=substr.toCharArray();
		
		
		for(int i=0;i<chsub.length;i++) {
			flag=0;
			if(ch[i]==chsub[i]) {
				flag=1;
			}
			else {
				break;
			}
		}
			
			
		
		if(flag==1) {
			System.out.println("The substring exists in the main string at starting position.");
		}
		else {
			System.out.println("The substring does not exist in the main string at starting position.");
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str=sc.nextLine(); 
		
		System.out.println("Enter a position till which you what to find substring from starting position:");
		int pos=sc.nextInt();
		
		char[] ch=str.toCharArray();
		
		System.out.println("Sub-string from starting postion to given position:");
		for(int i=0;i<pos;i++) {
			System.out.print(ch[i]);
		}
		*/
	}

}
