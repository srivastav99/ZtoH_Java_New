package Functions;

import java.util.Scanner;

public class Array_SmallestLargest {

	
	/*
	//A R
	public static int[] SmallestLargest(int arr[]) {
		int l,s;
		l=arr[0];
		s=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]>l) {
				l=arr[i+1];
			}
			if(arr[i+1]<s) {
				s=arr[i+1];
			}
			
		}
		
		int[] SmallLarge= {l,s};
		return SmallLarge;
		
		
	}
	
	
	public static void main(String[] args) {
		
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
		
		int[] SmallLarge = SmallestLargest(arr);
		
		
		System.out.println("Largest number:"+SmallLarge[0]);
		System.out.println("Smallest number:"+SmallLarge[1]);
		
	}
	*/
	
	
	
	/*
	//NA NR
		public static void SmallestLargest() {
			int l,s;
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
			l=arr[0];
			s=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				
				if(arr[i+1]>l) {
					l=arr[i+1];
				}
				if(arr[i+1]<s) {
					s=arr[i+1];
				}
				
			}
			
			System.out.println("Largest number:"+l);
			System.out.println("Smallest number:"+s);
			
			
			
			
			
		}
		
		
		public static void main(String[] args) {
			
			SmallestLargest();
			
			
		}
		*/
	
	
	
	/*
	//A NR
		public static void SmallestLargest(int arr[]) {
			int l,s;
			l=arr[0];
			s=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				
				if(arr[i+1]>l) {
					l=arr[i+1];
				}
				if(arr[i+1]<s) {
					s=arr[i+1];
				}
				
			}
			
			System.out.println("Largest number:"+l);
			System.out.println("Smallest number:"+s);
			
			
			
			
			
		}
		
		
		public static void main(String[] args) {
			
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
			
			SmallestLargest(arr);

			
			
		}
		*/
	

	//NA R
		public static int[] SmallestLargest() {
			int l,s;
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
			
			l=arr[0];
			s=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				
				if(arr[i+1]>l) {
					l=arr[i+1];
				}
				if(arr[i+1]<s) {
					s=arr[i+1];
				}
				
			}
			
			int[] SmallLarge= {l,s};
			return SmallLarge;
			
			
		}
		
		
		public static void main(String[] args) {
			
			
			int[] SmallLarge = SmallestLargest();
			
			
			System.out.println("Largest number:"+SmallLarge[0]);
			System.out.println("Smallest number:"+SmallLarge[1]);
			
		}
		
		


}
