package Arrays;

import java.util.Scanner;

public class InsertAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n,random;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter  element to insert at last:");
		random=sc.nextInt();
		
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr = new int[size+1];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		
		
		arr[arr.length-1]=random;
		System.out.println("Array after inserting an element at the last:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}


	}

}
