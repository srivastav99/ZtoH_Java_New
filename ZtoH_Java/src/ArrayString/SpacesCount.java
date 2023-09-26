package ArrayString;

import java.util.Scanner;

public class SpacesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " ";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				count++;
			}
		}
		System.out.println("The number of spaces in the given string is: "+count);

	}

}
