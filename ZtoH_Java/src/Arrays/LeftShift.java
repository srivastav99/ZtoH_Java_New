package Arrays;

import java.util.Scanner;

public class LeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr.length;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		/*
		for(int i=0;i<arr.length-1;i++) {
			
			arr[size-1] = arr[size-1]+arr[size-i-2];
			arr[size-i-2] = arr[size-1]-arr[size-i-2];
			arr[size-1] = arr[size-1]-arr[size-i-2];
			
			
		}
		*/
		
		
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i] = arr[i]+arr[i+1];
			arr[i+1] = arr[i] -arr[i+1];
			arr[i]  = arr[i] -arr[i+1];
			
		}
		
		
		System.out.println("Array after shift(left shift):");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}


	}

}
