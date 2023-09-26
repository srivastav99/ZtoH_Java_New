package Functions;

import java.util.Scanner;

public class Array_ReverseArray {

	/*
	//A R
	public static int[] Reverse(int arr[]) {
		
		for(int i=0;i<=(arr.length/2)-1;i++) {
			
			arr[i] = arr[i]+arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[i]-arr[arr.length-i-1];
			arr[i] = arr[i]-arr[arr.length-i-1];
				
			}
		return arr;
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
		
		int res[] = Reverse(arr);
		
		System.out.println("Array after reversing:");
		for(int i=0;i<res.length;i++) {
			
			System.out.print(res[i]+" ");
		}

	}
	*/
	
	
	/*
	//NA NR
		public static void Reverse() {
			
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
			
			for(int i=0;i<=(arr.length/2)-1;i++) {
				
				arr[i] = arr[i]+arr[arr.length-i-1];
				arr[arr.length-i-1] = arr[i]-arr[arr.length-i-1];
				arr[i] = arr[i]-arr[arr.length-i-1];
					
				}
			System.out.println("Array after reversing:");
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(arr[i]+" ");
			}

		}
		
		
		public static void main(String[] args) {
	
			Reverse();

		}	
	*/
	
	/*
	//A NR
			public static void Reverse(int arr[]) {
				
				
				for(int i=0;i<=(arr.length/2)-1;i++) {
					
					arr[i] = arr[i]+arr[arr.length-i-1];
					arr[arr.length-i-1] = arr[i]-arr[arr.length-i-1];
					arr[i] = arr[i]-arr[arr.length-i-1];
						
					}
				System.out.println("Array after reversing:");
				for(int i=0;i<arr.length;i++) {
					
					System.out.print(arr[i]+" ");
				}

			}
			
			
			public static void main(String[] args) {
		
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
				
				 Reverse(arr);

			}
			*/
	
	
	//NA R
	public static int[] Reverse() {
		
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
		
		for(int i=0;i<=(arr.length/2)-1;i++) {
			
			arr[i] = arr[i]+arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[i]-arr[arr.length-i-1];
			arr[i] = arr[i]-arr[arr.length-i-1];
				
			}
		
		return arr;
	}
	
	
	public static void main(String[] args) {

		int arr[] = Reverse();
		 
		 System.out.println("Array after reversing:");
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(arr[i]+" ");
			}
	}
	

}
