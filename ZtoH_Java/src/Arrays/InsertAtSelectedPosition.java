package Arrays;

import java.util.Scanner;

public class InsertAtSelectedPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size,n,random,position;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		System.out.println("Enter position to insert the number:");
		position=sc.nextInt();
		
		System.out.println("Enter the number to be inserted in required postion:");
		random=sc.nextInt();
		
		int[] arr = new int[size+1];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		
		for(int i=size-1;i>=position-1;i--) {
			arr[i+1]=arr[i];
		}
		arr[position-1]=random;
		System.out.println("Array after inserting the number in given position "+position+" :");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
	}

}
