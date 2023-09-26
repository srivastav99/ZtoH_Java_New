package ArrayString;

import java.util.Scanner;

public class StrBeforeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		char[] ch=str.toCharArray();
		
		System.out.println("Enter a character:");
		char c = sc.nextLine().charAt(0);
		System.out.println("String before given character:");
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!=c) {

					System.out.print(ch[i]+" ");	
				
			}
			else {
				break;
			}
		}


	}

}
