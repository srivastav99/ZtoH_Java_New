package Arrays;

import java.util.Scanner;

public class IndexAtStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n,random;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to add at the first index:");
		random=sc.nextInt();
		System.out.println("Enter size of array:");
		
		
		size=sc.nextInt();
		
		int[] arr1 = new int[size], arr2 = new int[size+1];
		
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr1.length;i++) {
			
			n=sc.nextInt();
			arr1[i]=n;
		}
		
		for(int i=0;i<arr1.length;i++) {
			
			/*if(i==0) {
				arr2[0]=random;
			}*/
			arr2[i+1]=arr1[i];
			
		}
		System.out.println("Array after addition of a value in the first index:");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}

	}

}
