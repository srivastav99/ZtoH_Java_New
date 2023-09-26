package Arrays;

import java.util.Scanner;

public class BubbleSort {

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
		
		for(int i=0;i<n;i++) {
			
			for(int j=i+1;j<n;j++) {  //Here if we give j=0 then instead of ascending order ,array in descending order will come.
			
				if(arr[j]<arr[i]) {
				/*
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					*/
					//or
					
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

}
