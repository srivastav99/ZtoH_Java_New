package Arrays;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,n; //int temp=0;
		System.out.println("Enter size of array:");
		
		Scanner sc = new Scanner(System.in);
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<size;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		//Using bubble sort
		for(int i=0;i<size-1;i++) {
			
			for(int j=i+1;j<size;j++)	
				if(arr[j]<arr[i]) {
					/*
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					*/
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
	
			}
		System.out.println("Array in ascending order:");
		for(int i=0;i<size;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
