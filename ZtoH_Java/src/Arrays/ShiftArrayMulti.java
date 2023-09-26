package Arrays;

import java.util.Scanner;

public class ShiftArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint size,n;
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
		
		for(int j=0;j<arr.length-1;j++) {
			for(int i=0;i<arr.length-1;i++) {
				arr[0] = arr[0]+arr[i+1];
				arr[i+1] = arr[0]-arr[i+1];
				arr[0] = arr[0]-arr[i+1];
			}
			System.out.println("Array after "+j+" shift(right shift):");
			for(int i=0;i<arr.length;i++) {
			
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}

	}

}
