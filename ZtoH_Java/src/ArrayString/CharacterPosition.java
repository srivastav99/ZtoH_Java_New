package ArrayString;

import java.util.Scanner;

public class CharacterPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";
		int flag=0;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		char[] ch=str.toCharArray();
		
		System.out.println("Enter a character:");
		char c = sc.nextLine().charAt(0);
		
		System.out.println("The given character "+c+" is found at position:");
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==c) {
				flag=1;
				//System.out.println("The given character "+c+" is found at position:"+(i+1));
				System.out.print(i+1+" ");
			}
		}
		if(flag==0) {
			System.out.println("The given character is not found in the given sting");
		}

	}

}
