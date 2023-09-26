package Arrays;

import java.util.Scanner;

public class ShiftArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int size,n;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr1 = new int[size], arr2 = new int[size];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr1.length;i++) {
			
			n=sc.nextInt();
			arr1[i]=n;
		}
		
		for(int i=0;i<arr2.length;i++) {
			
			
			arr2[i]=arr1[i];
		}
		
		System.out.println("Array after shifting:");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}
		 */
		
		/*
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
		
		for(int i=0;i<arr.length-1;i++) {
			arr[0] = arr[0]+arr[i+1];
			arr[i+1] = arr[0]-arr[i+1];
			arr[0] = arr[0]-arr[i+1];
		}
		System.out.println("Array after shift(right shift):");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}
	*/
		
		
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
		
		for(int i=0;i<arr.length-1;i++) {
			arr[arr.length-1] = arr[i]+arr[arr.length-1];
			arr[i] = arr[arr.length-1]-arr[i];
			arr[arr.length-1] = arr[arr.length-1]-arr[i];
		}
		System.out.println("Array after shift(right shift):");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

	

}
