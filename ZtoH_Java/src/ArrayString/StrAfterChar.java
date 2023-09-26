package ArrayString;

import java.util.Scanner;

public class StrAfterChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " ";

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		char[] ch=str.toCharArray();
		
		System.out.println("Enter a character:");
		char c = sc.nextLine().charAt(0);
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==c) {
				System.out.println("String after given character:");
				for(int j=i+1;j<ch.length;j++) {
					System.out.print(ch[j]+" ");
					i++; //to also increment i for loop so that it ends once we are out of if  and does not iterate after.
				}
				//or instead of i++ inside the loop keep break; outside the loop but inside if condition.
			}
		}

	}

}
