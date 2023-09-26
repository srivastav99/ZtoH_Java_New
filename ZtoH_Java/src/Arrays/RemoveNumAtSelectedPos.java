package Arrays;

import java.util.Scanner;

public class RemoveNumAtSelectedPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n,pos;
		System.out.println("Enter size of array:");
		
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		
		System.out.println("Enter position where you want to remove a number:");
		pos=sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		arr[pos-1]=0;
		System.out.println("Array after removing a number at selected position:");
		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");
			
		}

	}

}
