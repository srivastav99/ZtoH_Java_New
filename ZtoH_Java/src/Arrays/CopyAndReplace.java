package Arrays;

import java.util.Scanner;

public class CopyAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of arrays:");
		size=sc.nextInt();
		
		int[] arr1 = new int[size], arr2 = new int[size];
		
		
		System.out.println("Enter "+size+" elements for array 1:");
		for(int i=0;i<arr1.length;i++) {
			
			n=sc.nextInt();
			arr1[i]=n;
		}
		System.out.println("Enter "+size+" elements for array 2:");
		for(int i=0;i<arr2.length;i++) {
			
			n=sc.nextInt();
			arr2[i]=n;
		}
		System.out.println("Data inside array 2 before replacement of data with array 1:");

		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
				
			arr2[i]=arr1[i];
		}
		
		System.out.println("Data inside array 2 after replacement of data with array 1:");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}	
		
	}

}
