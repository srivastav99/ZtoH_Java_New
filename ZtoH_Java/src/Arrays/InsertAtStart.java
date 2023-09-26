package Arrays;

import java.util.Scanner;

public class InsertAtStart {

	public static void main(String[] args) {
		// inserting an element with out shifting elements 
		/*
		int size,n,random;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter  element to insert at start:");
		random=sc.nextInt();
		
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr.length;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		
		arr[0]=random;
		System.out.println("Array after inserting an element at the start:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		*/
		//inserting an element with shifting elements 
		/*
		int size,n,random;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter  element to insert at start:");
		random=sc.nextInt();
		
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr = new int[size+1];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		for(int i=size-1;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=random;
		System.out.println("Array after inserting an element at the start:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		*/
		int size,n,random;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter  element to insert at start:");
		random=sc.nextInt();
		
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr = new int[size+1];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			
			n=sc.nextInt();
			arr[i+1]=n;
		}
		
		arr[0]=random;
		System.out.println("Array after inserting an element at the start:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
	}

}
