package Functions;

import java.util.Scanner;

public class Array_ShiftArray {

	/*
	//A R
	public static int[] Shift(int arr[]) {
		
		for(int i=0;i<arr.length-1;i++) {
			arr[0] = arr[0]+arr[i+1];
			arr[i+1] = arr[0]-arr[i+1];
			arr[0] = arr[0]-arr[i+1];
		}
		
		return arr;
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
		
		int []res=Shift(arr);
		
		
		System.out.println("Array after shift(right shift):");
		for(int i=0;i<res.length;i++) {
			
			System.out.print(res[i]+" ");
		}
	}
	*/
	
	
	/*
	//NA NR
		public static void Shift() {
			
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
			
			
			for(int i=0;i<arr.length-1;i++) {
				arr[0] = arr[0]+arr[i+1];
				arr[i+1] = arr[0]-arr[i+1];
				arr[0] = arr[0]-arr[i+1];
			}
			
			System.out.println("Array after shift(right shift):");
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(arr[i]+" ");
			}
		}
		
		
		
		public static void main(String[] args) {

			Shift();

		}
		*/
		
	
	
	/*
	//A NR
		public static void Shift(int arr[]) {
			
			for(int i=0;i<arr.length-1;i++) {
				arr[0] = arr[0]+arr[i+1];
				arr[i+1] = arr[0]-arr[i+1];
				arr[0] = arr[0]-arr[i+1];
			}
			
			System.out.println("Array after shift(right shift):");
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(arr[i]+" ");
			}
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
			
			Shift(arr);
			
			
			
		}
		*/
	
	
	//NA R
			public static int[] Shift() {
				
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
				
				for(int i=0;i<arr.length-1;i++) {
					arr[0] = arr[0]+arr[i+1];
					arr[i+1] = arr[0]-arr[i+1];
					arr[0] = arr[0]-arr[i+1];
				}
				return arr;
				
			}
			
			
			
			public static void main(String[] args) {

				int[] arr= Shift();
				
				System.out.println("Array after shift(right shift):");
				for(int i=0;i<arr.length;i++) {
					
					System.out.print(arr[i]+" ");
				}
	
			}
	
	
	

}
