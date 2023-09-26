package Functions;

import java.util.Scanner;

public class Array_BubbleSort {

	
	
	//R A
	public static int[] BubbleSort(int arr[]){
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {  //Here if we give j=0 then instead of ascending order ,array in descending order will come.
			
				if(arr[j]<arr[i]) {
				
					
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			
			}
		}
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		//int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		n=sc.nextInt();
		
		int []arr=new int[n];
		
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();			
			
		}
		
		
		
		int []res=BubbleSort(arr);
		
		
		for(int i=0;i<n;i++) {
			
			System.out.print(res[i]+" ");			
			
		}
	}
	
	
	
	/*
	//NR NA
		public static void BubbleSort(){
			
			
		int n;
		//int temp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		n=sc.nextInt();
		
		int []arr=new int[n];
		
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();			
			
		}
		
		
		for(int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++) {  //Here if we give j=0 then instead of ascending order ,array in descending order will come.
				
					if(arr[j]<arr[i]) {
				
						
						arr[i]=arr[i]+arr[j];
						arr[j]=arr[i]-arr[j];
						arr[i]=arr[i]-arr[j];
					}
				
				}
			}
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");			
			
		}
			
	}
		
		
		public static void main(String[] args) {

			BubbleSort();

		}
		*/
		
		
		/*
		//NA R
		public static int[] BubbleSort(){
			
			
			int n;
			//int temp;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter array size:");
			n=sc.nextInt();
			
			int []arr=new int[n];
			
			System.out.println("Enter "+n+" elements:");
			for(int i=0;i<n;i++) {
				
				arr[i]=sc.nextInt();			
				
			}
			
			
			for(int i=0;i<arr.length;i++) {
				
				for(int j=i+1;j<arr.length;j++) {  //Here if we give j=0 then instead of ascending order ,array in descending order will come.
				
					if(arr[j]<arr[i]) {
					
						
						arr[i]=arr[i]+arr[j];
						arr[j]=arr[i]-arr[j];
						arr[i]=arr[i]-arr[j];
					}
				
				}
			}
			return arr;
			
		}
		
		
		public static void main(String[] args) {
			
	
			int arr[] = BubbleSort();
			
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(arr[i]+" ");			
				
			}
			
		}
		*/
	
	/*
	//NR A
			public static void BubbleSort(int arr[]){

			for(int i=0;i<arr.length;i++) {
					
					for(int j=i+1;j<arr.length;j++) {  //Here if we give j=0 then instead of ascending order ,array in descending order will come.
					
						if(arr[j]<arr[i]) {
					
							
							arr[i]=arr[i]+arr[j];
							arr[j]=arr[i]-arr[j];
							arr[i]=arr[i]-arr[j];
						}
					
					}
				}
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(arr[i]+" ");			
				
			}
				
		}
			
			
			public static void main(String[] args) {

				int n;
				//int temp;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter array size:");
				n=sc.nextInt();
				
				int []arr=new int[n];
				
				System.out.println("Enter "+n+" elements:");
				for(int i=0;i<n;i++) {
					
					arr[i]=sc.nextInt();			
					
				}
				
				
				BubbleSort(arr);

			}
			*/
	
	

}
