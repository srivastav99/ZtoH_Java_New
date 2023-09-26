package Arrays;


import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// Removing duplicate element but not its index(just replacing duplicate element with 0)
		/*
		int size,n,flag=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter "+size+" elements with a element repeating(duplicate):");
		for(int i=0;i<arr.length;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=0;
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
		if(flag==1) {
			System.out.println("Array after removing one duplicate element:");
			for(int i=0;i<arr.length;i++) {
				
				System.out.print(arr[i]+" ");
			}
		}
		else {
			System.out.println("No duplicate element found.");
		}
		*/
		
		//Removing element along with index
		
		/*
		int size,n,flag=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		size=sc.nextInt();
		
		int[] arr1 = new int[size], arr2 = new int[size-1];
		
		
		System.out.println("Enter "+size+" elements with a element repeating(duplicate):");
		for(int i=0;i<arr1.length;i++) {
			
			n=sc.nextInt();
			arr1[i]=n;
		}
		
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					arr1[i]=0;
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
		if(flag==1) {
			int j=0;
			for(int i=0;i<arr2.length;i++) {
				if(arr1[i]==0) {
					j=j+1;
				}
				arr2[i]=arr1[j];
				j++;
			}
			System.out.println("Array after removing one duplicate element along with its index:");
			for(int i=0;i<arr2.length;i++) {
				
				System.out.print(arr2[i]+" ");
			}
		}
		else {
			System.out.println("No duplicate element found.");
		}
		
		*/
		/*
		int size,n,flag=0,count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of arrays:");
		size=sc.nextInt();
		
		int[] arr = new int[size];
		
		

		
		System.out.println("Enter "+size+" elements:");
		for(int i=0;i<arr.length;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[j]!=-999) {
					
					arr[j]=-999;
					flag=1;
					count++;
					
				}
				
			
			}
		}
		
		//System.out.println(count);
		int arr1[]= new int[arr.length-count];
		int j=0;
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i]!=-999)
		 {
			 arr1[j]=arr[i];
			 j++;
		 
		 }
	 }
		if(flag==1) {
			System.out.println("Array after removing duplicates:");
			for(int i=0;i<arr1.length;i++) {

				System.out.print(arr1[i]+" ");
			}
		}
		else {
			System.out.println("No duplicate elements to remove.");
		}
		*/
		
		/*
		int n,count=0,flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
		}
		boolean value;
		
		for(int i=0;i<a.length;i++) {
			 
			value = true;
			for(int j=0;j<i;j++) {
				
				if(a[j]==a[i]) {
					
					value=false;
				}
			}
			if(value) {
				
				count=1;
				for(int j=i+1;j<a.length;j++) {
					
					if(a[i]==a[j]) {
						
						count++;
						flag=1;
						a[i]=0;
					}
				}
			
			}
		}
		if(flag==0) {
			System.out.println("No duplicate elements found.");
		}
		else {
			for(int i=0;i<a.length;i++) {
				
				System.out.print(a[i]+" ");
			}
		}
		*/
		
		
		int n,count=0,flag=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array:");
		n=sc.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("Enter "+n+" elements:");
		for(int i=0;i<a.length;i++) {
			
			a[i]=sc.nextInt();
		}
		boolean value;
		
		
		for(int i=0;i<a.length;i++) {
			 
			
			for(int j=0;j<i;j++) {  //This loop is there to check for values which have already repeated(for already found duplicates). 
				
				if(a[j]==a[i]) {  //This loop checks for elements before i index in search for already found duplicates.
						
					count++;
					break;
				}
			}
			
		}
		//System.out.println(count);
		int []arr = new int[a.length-count];
		int k=1;
		for(int i=0;i<a.length;i++) {
			 
			value = true;
			
			for(int j=0;j<i;j++) {  //This loop is there to check for values which have already repeated(for already found duplicates). 
				
				if(a[j]==a[i]) {  //This loop checks for elements before i index in search for already found duplicates.
					
					value=false;
					
				}
			}	
			if (value) {
				arr[k - 1] = a[i];
				k++;
			}
		}

		System.out.println("Array after removing duplicates:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
			
	}

}
