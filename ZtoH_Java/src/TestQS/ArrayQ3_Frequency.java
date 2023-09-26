package TestQS;

import java.util.Scanner;

public class ArrayQ3_Frequency {

	public static void main(String[] args) {
		
		int n,count=0,flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
		}
		boolean value;
		
		
		for(int i=0;i<a.length;i++) {
			 
			value = true;
			for(int j=0;j<i;j++) {  //This loop is there to check for values which have already repeated(for already found duplicates). 
				
				if(a[j]==a[i]) {  //This loop checks for elements before i index in search for already found duplicates.
					
					value=false;
				}
			}
			if(value) {
				
				count=1;
				for(int j=i+1;j<a.length;j++) { // This loop is for checking for new duplicate values.
					
					if(a[i]==a[j]) {   ////This loop checks for elements after i index in search of new duplicates.
						
						count++;
						flag=1;
					}
				}
				
				if(count>1) {
					System.out.println("Duplicate element:"+a[i]+" repeating "+count+" times.");
					
				}
				
			}
		}
		if(flag==0) {
			System.out.println("No duplicate elements found.");
		}

	}

}
