package ArrayString;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str1 = " ";
		int count =0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		char[] ch1=str1.toCharArray();
		
		
		for(int i=0;i<ch1.length;i++) {
			
			if(ch1[i]==' ') {
				count++;//to find the number of times the space is occurring
			}
		}
		int j=0;
		char[] ch2=new char[ch1.length-count];	//total size - spaces gives the array size we need	

		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=' ') {
				ch2[j]=ch1[i];
				j++;
			}
		}
		
		//String str2=String.valueOf(ch2); //converting array to string
		//System.out.println("String after removing the spaces from the string:"+str2);
		
		
		System.out.println("String after removing spaces from the string:");
		for(int i=0;i<ch2.length;i++) {
			
			System.out.print(ch2[i]);
			
		}
		*/
		String str1 = "";
		String str2= "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		
		char[] ch1=str1.toCharArray();
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=' ') {
				
				str2=str2+ch1[i];
	
			}
		}
		System.out.println("String after removing spaces from the string:"+str2);

	}

}
