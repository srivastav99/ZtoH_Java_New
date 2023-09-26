package Arrays;

import java.util.Scanner;

public class IndexAtMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n,random;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to add at the middle index:");
		random=sc.nextInt();
		System.out.println("Enter size of array as even number:");
		
		
		size=sc.nextInt();
		
		if(size%2==0) {
			int[] arr1 = new int[size], arr2 = new int[size+1];
		
		
			System.out.println("Enter "+size+" elements:");
			for(int i=0;i<arr1.length;i++) {
			
				n=sc.nextInt();
				arr1[i]=n;
			}
			int j=0;
			for(int i=0;i<arr1.length;i++) {
			
				arr2[j]=arr1[i];
				if(i==((arr1.length)/2-1)) {
					//arr2[(arr2.length)/2]=random;
					j=j+1;
				}
				j++;
				/*
				if(i<arr1.length/2) {
					arr2[i]=arr1[i];
				}
				if(i==arr1.length/2) {
					arr2[i]=random;
					arr2[i+1]=arr1[i];
				}
				if(i>arr1.length/2) {
					arr2[i+1]=arr1[i];
				}
				*/
			}
			
				
			System.out.println("Array after addition of a value in the middle index:");
			for(int i=0;i<arr2.length;i++) {
			
				System.out.print(arr2[i]+" ");
			}
		}
		else {
			System.out.println("Only for even numbered index, a middle index can be added, for odd number there already exists a middle element and thus we can only replace the middle value not add another index.");
		}

	}

}
