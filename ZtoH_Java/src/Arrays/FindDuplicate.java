package Arrays;


import java.util.Scanner;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int size,n,dup=0,flag=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of arrays:");
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
					dup=arr[i];
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
		}
		if(flag==1) {
			System.out.println("One duplicate element is:"+dup);
		}
		else {
			System.out.println("No duplicate element found.");
		}
		*/
		
		/*
		int size,n,flag=0,Nodup=0,count0=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of arrays:");
		size=sc.nextInt();
		
		int[] arr = new int[size];
		int[]arr1 = new int[size];
		

		
		System.out.println("Enter "+size+" elements with a element repeating(duplicate):");
		for(int i=0;i<arr.length;i++) {
			
			n=sc.nextInt();
			arr[i]=n;
		}
		int k=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					if(arr[i]==0) {
						count0++;
					}
					flag=0;
					for(int c=0;c<arr1.length;c++) {
						if(arr1[c]==arr[j]) {
							flag=2;
						}
					}
						if(flag==0)
						 {
							
							arr1[k]=arr[j];
								k++;
								Nodup=Nodup+1;;
								
							
							}
					
				}
			
			}
		}
		
		
		if(Nodup==0) {
			System.out.println("No duplicate elements");
		}
		else {
			System.out.println("Duplicate elements found:");
			for(int i=0;i<Nodup;i++) {
				
					
				
				System.out.print(arr1[i]+" ");
				
			}
			if(count0>0) {
				System.out.print(0);
			}
		}
	
		*/
		
		/*
		int[]ar= {4,3,4,4,2,1,0,0};
		int[]br=new int[ar.length];
		for(int i=0;i<br.length;i++) {
			br[i]=ar[i];
		}
		for(int i=0;i<br.length;i++) {
			for(int j=i+1;j<br.length;j++) {
				if(br[i]>br[j]) {
					int temp=br[i];
					br[i]=br[j];
					br[j]=temp;
				}
			}
		}
		
		
		for(int i=0;i<br.length;i++) {
			int  count=1;
			for(int j=i+1;j<br.length;j++) {
				if(br[i]==br[j]) {
					count++;
				     i++;
				}
			}
			if(count>1) {
				System.out.println(br[i]+" Reprated "+count+" Times ");
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
			 
			value = true;
			for(int j=0;j<i;j++) {  //This loop is there to check for values which have already repeated(for already found duplicates). 
				
				if(a[j]==a[i]) {  //This loop checks for elements before i index in search for already found duplicates.
					
					value=false;
				}
			}
			if(value) {
				
				count=1;
				for(int j=i+1;j<a.length;j++) { // This loop is for checking for new duplicate values.
					
					if(a[i]==a[j]) {   ////This loop checks for elements after i index in search of new duplicates.
						
						count++;
						flag=1;
					}
				}
				
				if(count>1) {
					System.out.println("Duplicate element:"+a[i]+" repeating "+count+" times.");
					
				}
				
			}
		}
		if(flag==0) {
			System.out.println("No duplicate elements found.");
		}
		
	}

}
