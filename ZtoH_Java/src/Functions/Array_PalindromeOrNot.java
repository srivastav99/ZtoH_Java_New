package Functions;

import java.util.Scanner;

public class Array_PalindromeOrNot {

	/*
	//A R
	public static int Palindrome(int arr[]) {
		
		int flag=0;
		
		for(int i=0;i<=(arr.length/2)-1;i++) {
			if(arr[i]==arr[arr.length-i-1]) {
				flag=1;
			}
			else {
				flag=0;
				break;
			}
		}
		return flag;
		
	}
	
	
	
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
		
		int flag =Palindrome(arr);
		
		
		if(flag==1) {
			System.out.println("The array is a palindrome.");
		}
		else {
			System.out.println("The array is not a palindrome.");
		}

	}
	*/
	
	/*
	//NA NR
	public static void Palindrome() {
		
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
		
		
		for(int i=0;i<=(arr.length/2)-1;i++) {
			if(arr[i]==arr[arr.length-i-1]) {
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
	
	
	
	public static void main(String[] args) {

		Palindrome();

	}
	*/
	
	
	/*
	//A NR
		public static void Palindrome(int arr[]) {
			
			int flag=0;
			
			for(int i=0;i<=(arr.length/2)-1;i++) {
				if(arr[i]==arr[arr.length-i-1]) {
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
			
			Palindrome(arr);
			
			
			

		}
		*/
	
	
	
	
	//NA R
	public static int Palindrome() {
		
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
		
		
		for(int i=0;i<=(arr.length/2)-1;i++) {
			if(arr[i]==arr[arr.length-i-1]) {
				flag=1;
			}
			else {
				flag=0;
				break;
			}
		}
		
		return flag;
		
	}
	
	
	
	public static void main(String[] args) {

		int flag= Palindrome();
		
		if(flag==1) {
			System.out.println("The array is a palindrome.");
		}
		else {
			System.out.println("The array is not a palindrome.");
		}

	}
	

}
