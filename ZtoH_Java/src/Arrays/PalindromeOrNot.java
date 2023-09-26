package Arrays;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n,flag=0;
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
			if(arr[i]==arr[size-i-1]) {
				flag=1;
			}
			else {
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("The array is a palindrome.");
		}
		else {
			System.out.println("The array is not a palindrome.");
		}

	}

}
