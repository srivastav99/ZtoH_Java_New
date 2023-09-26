package Arrays;

import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
		
		int size,n,l,s;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr.length;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		l=arr[0];
		s=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]>l) {
				l=arr[i+1];
			}
			if(arr[i+1]<s) {
				s=arr[i+1];
			}
			
		}
		System.out.println("Largest number:"+l);
		System.out.println("Smallest number:"+s);
		
	}

	
}
