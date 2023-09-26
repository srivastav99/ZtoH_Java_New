package ArrayString;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = " ",str2="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		char[] ch=str1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] || ch[j]=='&') {
					ch[j]='&';
					
					
				}
			}
			
		}
		for(int i=0;i<ch.length;i++){
			if(ch[i]!='&') {
				str2=str2+ch[i];
			}
			
		}
		System.out.println("String after removing duplicates:"+str2);

	}

}
