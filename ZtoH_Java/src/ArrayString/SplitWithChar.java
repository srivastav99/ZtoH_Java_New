package ArrayString;

import java.util.Scanner;

public class SplitWithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By using string array
		/*
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		char[] c=str.toCharArray();
		
		System.out.println("Enter a char to split the given string:");
		char ch = sc.nextLine().charAt(0);
		
		for(int i=0;i<c.length;i++) {
			if(c[i]==ch && i!=0 && c[i-1]!=ch  && i!=c.length-1) {
				count++;
			}
		}
		int flag=0;
		String[] s = new String[count+1];
		int k=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]!=ch) {
				
				if(flag==0) {
	
					s[k]=""+c[i]; //Here "" is concatenated otherwise it will concatenate to  existing default Null value.
					flag=1;
				}
				else {
					s[k]=s[k]+c[i];
					
				}
	
			}
			else {
				if(flag==1) {
					k++;
					flag=0;
			}
			}
			
		}
		System.out.println("String after splitting:");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		//String str2[] =str.split("p");
		//for(int i=0;i<str2.length;i++) {
			//System.out.println(str2[i]);
		}
		
		*/ 
		
		
		
				String s =" apple is a fruit";
				char d[] = s.toCharArray();
				char ch=' ';
				
				if(d[d.length-1] != ch) 
				{
					s=s+ch;
				}
				
				char c[] = s.toCharArray();
				
				int count =0;
				for(int i=0;i<c.length;i++)
				{
					if(c[i]==ch)
					{
						count++;
						
					}
				}
				/*
				if(c.length-1!=ch) {
					count++;
					s=s+"";
					
				}
				*/
				String str="";
				String s1[] = new String[count];
				int k=0;
				for(int i=0;i<c.length;i++)
				{	
					
					if(c[i] != ch)
					{
						str+=c[i];
					}
					else
					{
						
						s1[k]=str;
					    k++;
					    str="";
					}
					
					
				}
				for(int i=0;i<s1.length;i++)
				{
					System.out.println(s1[i]);
				}
				 
				
				String str2[] =s.split(" ");
				for(int i=0;i<str2.length;i++) {
					System.out.println(str2[i]);
				}
				
		
		
		/*
		// By using just string
		int count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		String str1 ="";
		
		char[] c=str.toCharArray();
		
		System.out.println("Enter a char to split the given string:");
		char ch = sc.nextLine().charAt(0);
		

		for(int i=0;i<c.length;i++) {
			if(c[i]!=ch) {

					str1=str1+c[i]; 

			}
			else {
				str1=str1+" ";
				
			}
			
		}
		System.out.println("String after splitting:");
		System.out.println(str1);
		*/
				
				
				
				
	}

}
