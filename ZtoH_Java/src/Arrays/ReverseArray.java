package Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n;
		System.out.println("Enter size of array:");
		
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		
		for(int i=0;i<=(size/2)-1;i++) {
			
			arr[i] = arr[i]+arr[size-i-1];
			arr[size-i-1] = arr[i]-arr[size-i-1];
			arr[i] = arr[i]-arr[size-i-1];
				
			}
		
		System.out.println("Array after reversing:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}

	}

}
