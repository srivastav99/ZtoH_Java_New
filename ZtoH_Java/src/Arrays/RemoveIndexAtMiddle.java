package Arrays;

import java.util.Scanner;

public class RemoveIndexAtMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter size of array as odd number:");
		size=sc.nextInt();
		
		if(size%2!=0) {
			int[] arr1 = new int[size], arr2 = new int[size-1];
		
		
			System.out.println("Enter "+size+" elements:");
			for(int i=0;i<arr1.length;i++) {
			
				n=sc.nextInt();
				arr1[i]=n;
			}
		
			int j=0;
			for(int i=0;i<arr2.length;i++) {
				
				arr2[i]=arr1[j];
				if(i==arr1.length/2-1) {
					j=j+1;
				}
				j++;
			}
			System.out.println("Array after removing middle index:");
			
			for(int i=0;i<arr2.length;i++) {
				
				System.out.print(arr2[i]+" ");
			}
		}
		else {
			System.out.println("Since the given size is even there cannot be a single middle element and thus we cannot perform removing middle index operation to array having even number of elements.");
		}

	}

}
