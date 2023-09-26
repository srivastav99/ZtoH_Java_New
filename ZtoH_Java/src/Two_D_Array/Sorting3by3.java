package Two_D_Array;

import java.util.Scanner;

public class Sorting3by3 {

	public static void main(String[] args) {
	 /*	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		
		System.out.println("Enter col size:");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];
		int[] arr = new int[row*col];
		
		System.out.println("Enter "+(row*col)+ " elements for array 1:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		int k=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[k] = arr1[i][j];
				k++;
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++)	
				if(arr[j]<arr[i]) {
					
					//temp=arr[i];
					//arr[i]=arr[j];
					//arr[j]=temp;
					
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
	
			}
		
		k=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j] = arr[k] ;
				k++;
			}
		}

		System.out.println("Sorted matrix:");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		*/
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		
		System.out.println("Enter col size:");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];
		//int[] arr = new int[row*col];
		
		System.out.println("Enter "+(row*col)+ " elements for array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
				for(int x=0;x<row;x++) {
					for(int y=0;y<col;y++) {
						
						if(arr1[x][y]>arr1[i][j]) {
							arr1[i][j]=arr1[i][j]+arr1[x][y];
							arr1[x][y]=arr1[i][j]-arr1[x][y];
							arr1[i][j]=arr1[i][j]-arr1[x][y];
						}
					}
				}
				
			}
		}
		
		System.out.println("Sorted matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
