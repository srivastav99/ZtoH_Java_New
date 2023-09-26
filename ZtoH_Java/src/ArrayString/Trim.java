package ArrayString;

import java.util.Scanner;

public class Trim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = " ";
		String str2="";
		//System.out.println(str2);
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		char[] ch=str1.toCharArray();
		
		//To find how many spaces are there at the end
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]==' ') {
				count++;
			}
			else {
				break;
			}
		}
		
		//This loop iterates from 0 index to index where spaces start at the end.
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==' ') { //To neglect spaces at the start
				
			}
			else { //Here we are appending string from index with first char(spaces at first not considered) to index with last char(spaces at end not considered).
				for(int j=i;j<ch.length-count;j++) {
					
					str2=str2+ch[j];
				}
				break;
			}
			
		}
		
		System.out.println("String after trimming:"+str2);
		
		System.out.println(str1.trim());
		
		/*
		String str1 = " ";
		
		
		int count1=0,count2=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		char[] ch=str1.toCharArray();
		
		
		//To find how many spaces are there at the end
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]==' ') {
				count1++;
			}
			else {
				break;
			}
		}
		//To find how many spaces are there at the start
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				count2++;
			}
			else {
				break;
			}
		}
		
		char[] ch1=new char[ch.length-count1-count2];
		int k=0;
		
		//This loop iterates from 0 index to index where spaces start at the end.
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==' ') { //To neglect spaces at the start
				
			}
			else { //Here we are appending string from index with first char(spaces at first not considered) to index with last char(spaces at end not considered).
				for(int j=i;j<ch.length-count1;j++) {
					
					ch1[k]=ch[j];
					k++;
				}
				break;
			}
			
		}
		
		for(int i=0;i<ch1.length;i++) {
			System.out.print(ch1[i]);
		}
		*/
	
	}

}
