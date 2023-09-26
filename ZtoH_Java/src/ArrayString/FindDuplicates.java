package ArrayString;

import java.util.Scanner;


public class FindDuplicates {

	public static void main(String[] args) {

		String str = " ";
		char temp=' ';
		int flag=0;
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str = sc.nextLine();
		
		char[] ch=str.toCharArray();
		
		System.out.println("Duplicate letters in the given array:");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		
		for(int i=0;i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				     flag=1;
				}
			}
			if(count>1) {   //Here spaces are also considered for duplicate. if you want to discard spaces the use if(count>1 & ch[i]!=' ')
				System.out.print(ch[i]+" ");
			}
		}
		if(flag==0) {
			System.out.println("There are no duplicate letters.");
		}

	}

}
