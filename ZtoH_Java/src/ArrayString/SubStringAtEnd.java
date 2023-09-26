package ArrayString;

import java.util.Scanner;

public class SubStringAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		int j=1;
		for(int i=chsub.length-1;i>=0;i--) {
			flag=0;
			if(ch[ch.length-j]==chsub[i]) {
				flag=1;
				j++;
			}
			else {
				break;
			}
		}
			
			
		
		if(flag==1) {
			System.out.println("The substring exists in the main string at ending position.");
		}
		else {
			System.out.println("The substring does not exist in the main string at ending position.");
		}
		 
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str=sc.nextLine(); 
		
		System.out.println("Enter a position from which you what to find substring till ending position:");
		int pos=sc.nextInt();
		
		char[] ch=str.toCharArray();
		
		System.out.println("Sub-string from starting postion to given position:");
		for(int i=pos-1;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		*/
	}

}
