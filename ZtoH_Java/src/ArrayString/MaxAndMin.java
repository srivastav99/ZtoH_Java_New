package ArrayString;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = " ";
		int count =0;
		char temp=' ' ;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		str1 = sc.nextLine();
		char[] ch=str1.toCharArray();
		int min=ch.length, max=-1;
		//bubblesort - ascending order
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		//to get max and min count values
		for(int i=0;i<ch.length;i++) {
			 count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				    
				}
			}
			if(count>max) {
				max=count;
				
				
			}
			if(count<min) {
				min=count;
				
				
			}
			
		}
		
		/*
		for(int i=0;i<ch.length;i++) {
			 count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				    
				}
			}
			if(count==max) {
				System.out.println("Maximum repeating element:"+ch[i]);
			}
			if(count==min) {
				System.out.println("Minimum repeating element:"+ch[i]);
			}
		}
		*/
		
		//Maximum repeating element
		System.out.println("Maximum repeating element:");
		for(int i=0;i<ch.length;i++) {
			 count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				    
				}
			}
			if(count==max) {
				System.out.print(ch[i]+" ");
				//System.out.println(ch[i]+" is repeating "+count+" times.");
			}
		}
		System.out.println();
		//Minimum repeating element
		System.out.println("Minimum repeating element:");
		for(int i=0;i<ch.length;i++) {
			 count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				    
				}
			}
		
			if(count==min) {
				System.out.print(ch[i]+" ");
				//System.out.println(ch[i]+" is repeating "+count+" times.");
			}
		}
		
	}

}
