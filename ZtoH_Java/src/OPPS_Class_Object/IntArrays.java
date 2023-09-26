package OPPS_Class_Object;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;


class SubIntA{
	
	public void equalornot() {
		
		int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,3,4,5};
		int flag=0;
		
		if(arr1.length == arr2.length) {
			
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==arr2[i]) {
					flag=1;
				}
				else {
					flag=0;
					break;
				}
			}
		}
	
				
		
		if(flag==1) {
			System.out.println("Both the arrays are equal.");
		}
		else {
			System.out.println("Both the arrays are not equal.");
		}

	}
	
	
	
	
	public void findOccurance(){
		int count=0,flag=0;
		
		
		int a[] = {1,1,2,2,3};
		
		boolean value;
		
		
		for(int i=0;i<a.length;i++) {
			 
			value = true;
			for(int j=0;j<i;j++) {  //This loop is there to check for values which have already repeated(for already found duplicates). 
				
				if(a[j]==a[i]) {
					
					value=false;
				}
			}
			if(value) {
				
				count=1;
				for(int j=i+1;j<a.length;j++) { // This loop is for checking for new duplicate values.
					
					if(a[i]==a[j]) {
						
						count++;
						flag=1;
					}
				}
				
				if(count>1 || count==1) {
					System.out.println("Duplicate element:"+a[i]+" repeating "+count+" times.");
					
				}
				
			}
		}
		if(flag==0) {
			System.out.println("No duplicate elements found.");
		}
	}

	
	
	public void Average() {
		
		int[] arr= {1,2,3,4,5};
		double avg=0;
		
		for(int i=0;i<arr.length;i++) {
			avg = avg+arr[i];
		}
		avg=avg/arr.length;
		
		System.out.println("Average of same array:"+avg);

	}
	
	
	
	
	public void Bubblesort() {
		
		int n;

		int []arr= {2,4,7,1,3};
	
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {  //Here if we give j=0 then instead of ascending order ,array in descending order will come.
			
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
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");			
			
		}
		System.out.println();
	}

	
	
	public void copyReplace() {
		

		int[] arr1 = {1,2,3,4,5}, arr2 = {10,20,30,40,50};
		

		System.out.println("Data inside array 2 before replacement of data with array 1:");

		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr2.length;i++) {
				
			arr2[i]=arr1[i];
		}
		
		System.out.println("Data inside array 2 after replacement of data with array 1:");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}	
		System.out.println();
	}
	
	
	
	
	public void findDupliate() {
		
		int count=0,flag=0;
		
		int a[] = {1,1,2,2,3};
		
		boolean value;
		
		for(int i=0;i<a.length;i++) {
			 
			value = true;
			for(int j=0;j<i;j++) {  //This loop is there to check for values which have already repeated(for already found duplicates). 
				
				if(a[j]==a[i]) {
					
					value=false;
				}
			}
			if(value) {
				
				count=1;
				for(int j=i+1;j<a.length;j++) { // This loop is for checking for new duplicate values.
					
					if(a[i]==a[j]) {
						
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


	
	
	public void indexAtLast() {
		
		int random;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to add at the last index:");
		random=sc.nextInt();
		
		int[] arr1 = {1,2,3,4}, arr2 = new int[arr1.length+1];
		
		for(int i=0;i<arr1.length;i++) {
			
			arr2[i]=arr1[i];
			
		}
		arr2[arr2.length-1]=random;
		
		System.out.println("Array after addition of a value in the last index:");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	public void indexAtMiddle() {
		
		int random;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to add at the middle index:");
		random=sc.nextInt();
		
		int[] arr1 = {1,2,3,4};
		if(arr1.length%2==0) {
			int[] arr2 = new int[arr1.length+1];
		
			int j=0;
			for(int i=0;i<arr1.length;i++) {
			
				arr2[j]=arr1[i];
				if(i==((arr1.length)/2-1)) {
					
					j=j+1;
					arr2[j]=random;
				}
				j++;
			
			}
			
				
			System.out.println("Array after addition of a value in the middle index:");
			for(int i=0;i<arr2.length;i++) {
			
				System.out.print(arr2[i]+" ");
			}
		}
		else {
			System.out.println("Only for even numbered index, a middle index can be added, for odd number there already exists a middle element and thus we can only replace the middle value not add another index.");
		}

	}
	
	
	
	public void indexAtStart() {
		// TODO Auto-generated method stub
		int random;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to add at the first index:");
		random=sc.nextInt();
	
		int[] arr1 = {1,2,3,4}, arr2 = new int[arr1.length+1];
		
		for(int i=0;i<arr1.length;i++) {
			
			if(i==0) {
				arr2[0]=random;
			}
			arr2[i+1]=arr1[i];
			
		}
		System.out.println("Array after addition of a value in the first index:");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	public void IndexAtSelectedPos() {
		
		
		int random,position;
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter position to insert the number:");
		position=sc.nextInt();
		
		System.out.println("Enter the number to be inserted in required postion:");
		random=sc.nextInt();
		
		int[] arr1 = {1,2,3,4};
		int[] arr2= new int[arr1.length+1];
		
		for(int i=0;i<arr1.length;i++) {
			
			arr2[i]=arr1[i];
		}
		
		
		for(int i=arr1.length-1;i>=position-1;i--) {
			arr2[i+1]=arr1[i];
		}
		arr2[position-1]=random;
		System.out.println("Array after inserting the number in given position "+position+" :");
		for(int i=0;i<arr2.length;i++) {
			
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}

	
	
	
	public void leftShift() {
		
		int[] arr = {1,2,3,4};
		
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i] = arr[i]+arr[i+1];
			arr[i+1] = arr[i] -arr[i+1];
			arr[i]  = arr[i] -arr[i+1];
			
		}
		
		
		System.out.println("Array after shift(left shift):");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

	
	
	
	public void multiplyArray() {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5}, arrMul = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arrMul[i]=arr[i]*arr[i];
		}
		
		System.out.println("Multiplication of same array:");
		
		for(int i=0;i<arrMul.length;i++) {
			System.out.print(arrMul[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public void palindrome() {
		// TODO Auto-generated method stub
		int flag=0;
	
		int[] arr = {1,2,3,2,1};
		
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

	
	
	
	public void nonDuplicate() {
		
		int count=0,flag=0;
		
	
		int a[] = {1,1,2,2,3};
		

		boolean value;
		
		System.out.println("Non-duplicate elements in array:");
		for(int i=0;i<a.length;i++) {
			 
			value = true;
			for(int j=0;j<i;j++) {  //This loop is there to check for values which have already repeated(for already found duplicates). 
				
				if(a[j]==a[i]) {
					
					value=false;
				}
			}
			if(value) {
				
				count=1;
				for(int j=i+1;j<a.length;j++) { // This loop is for checking for new duplicate values.
					
					if(a[i]==a[j]) {
						
						count++;
						flag=1;
					}
				}
				
				if(count==1) {
					System.out.print(a[i]+ " ");
					
				}
				
			}
		}
		if(flag==0) {
			System.out.println("No duplicate elements found.");
		}
		System.out.println();

	}
	
	
	
	
	public void removeDuplicate() {
	
		
		int flag=0,count=0;
		
		int[] arr = {1,1,2,2,3};
		
	
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
		System.out.println();
		System.out.println();
		
	}
	
	
	
	
	public void removeLast() {
			
		int[] arr = {1,2,3,4};
		
		arr[arr.length-1]=0;
		System.out.println("Array after removing a number at ending position:");
		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	
	
	public void removeAtSelpos() {
		
		int pos;
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter position where you want to remove a number:");
		pos=sc.nextInt();
		
		int[] arr = {1,2,3,4};
		
		arr[pos-1]=0;
		System.out.println("Array after removing a number at selected position:");
		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}

	
	
	public void removeStart() {
	
		int[] arr = {1,2,3,4};
		
		arr[0]=0;
		System.out.println("Array after removing a number at starting position:");
		for(int i=0;i<arr.length;i++) {

			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
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
		
		for(int i=0;i<=(size/2)-1;i++) {
			
			arr[i] = arr[i]+arr[size-i-1];
			arr[size-i-1] = arr[i]-arr[size-i-1];
			arr[i] = arr[i]-arr[size-i-1];
				
			}
		
		System.out.println("Array after reversing:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}


	
	public void reverse() {
		

		int[] arr = {1,2,3,4};
		
		for(int i=0;i<=(arr.length/2)-1;i++) {
			
			arr[i] = arr[i]+arr[arr.length-i-1];
			arr[arr.length-i-1] = arr[i]-arr[arr.length-i-1];
			arr[i] = arr[i]-arr[arr.length-i-1];
				
			}
		
		System.out.println("Array after reversing:");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	
	
	public void shiftArray() {
		
	
		int[] arr = {1,2,3,4};
		
		for(int i=0;i<arr.length-1;i++) {
			arr[arr.length-1] = arr[i]+arr[arr.length-1];
			arr[i] = arr[arr.length-1]-arr[i];
			arr[arr.length-1] = arr[arr.length-1]-arr[i];
		}
		System.out.println("Array after shift(right shift):");
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public void samllestLargest() {
		
		int l,s;
		
		int[] arr = {2,7,9,3};
		
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
	
	
	
	public void sameArraySum() {
		
		int[] arr = {1,2,3,4,5}, arrSum = new int[arr.length];
	
	
		System.out.println("Sum of same array:");
		
		
		for(int i=0;i<arr.length;i++) {
			
			arrSum[i]=arr[i]+arr[i];
		}
		
		for(int i=0;i<arrSum.length;i++) {
			
			System.out.print(arrSum[i]+" ");
		}
		System.out.println();
		
	}
	
	
	
	public void twoArraySum() {
		
		int[] arr1 = {1,2,3,4,5}, arr2 = {10,20,30,40,50}, arrSum = new int[arr1.length];
		
		if(arr1.length==arr2.length) {
			
			for(int i=0;i<arrSum.length;i++) {
				arrSum[i] = arr1[i]+arr2[i];
			}
			System.out.println("Sum of two array:");
			
			for(int i=0;i<arrSum.length;i++) {
				System.out.print(arrSum[i]+" ");
			}
			
		}
		else {
			System.out.println("Since the size of array 1 and array 2 is not equal,addition of array is not possible.");
		}
		System.out.println();
	}
	
	
	
	
}


class IntArrays {

	public static void main(String[] args) {
		
		SubIntA obj = new SubIntA();
		
		System.out.println("Array equal or not program:");
		
		obj.equalornot();
		
		System.out.println();
		
		System.out.println("Find element occurance program:");
		
		obj.findOccurance();
		
		System.out.println();
		
		System.out.println("Average of same array program:");
		
		obj.Average();
		
		System.out.println();
		
		System.out.println("Bubblesort program:");
		
		obj.Bubblesort();
		
		System.out.println();
		
		System.out.println("Copy and replace program:");
		
		obj.copyReplace();
		
		System.out.println();
		
		System.out.println("Find duplicate program:");
		
		obj.findDupliate();
		
		System.out.println();
		
		System.out.println("Add element at last index program:");
		
		obj.indexAtLast();
		
		System.out.println();
		
		System.out.println("Add element at middle index program:");
		
		obj.indexAtMiddle();
		
		System.out.println();
		
		System.out.println("Add element at starting index program:");
		
		obj.indexAtStart();
		
		System.out.println();
		
		System.out.println("Add element at selected index program:");
		
		obj.IndexAtSelectedPos();
		
		System.out.println();
		
		System.out.println("Left shift program:");
		
		obj.leftShift();
		
		System.out.println();
		
		System.out.println("Multiplication of same array: program");
		
		obj.multiplyArray();
		
		System.out.println();
		
		System.out.println("Array palindrome program:");
		
		obj.palindrome();
		
		System.out.println();
		
		System.out.println("Print non-duplicate elements program:");
		
		obj.nonDuplicate();
		
		System.out.println();
		
		System.out.println("Remove duplicate program:");
		
		obj.removeDuplicate();
		
		System.out.println("Remove last element program:");
		
		obj.removeLast();
		
		System.out.println();
		
		System.out.println("Remove element at selected position program:");
		
		obj.removeAtSelpos();
		
		System.out.println();
		
		System.out.println("Remove element at start program:");
		
		obj.removeStart();
		
		System.out.println();
		
		System.out.println("Reverse array program:");
		
		obj.reverse();
		
		System.out.println();
		
		System.out.println("Shift array program");
		
		obj.shiftArray();
		
		System.out.println();
		
		System.out.println("Smallest largest program:");
		
		obj.samllestLargest();
		
		System.out.println();
		
		System.out.println("Sum of same array program:");
		
		obj.sameArraySum();
		
		System.out.println("Sum of two arrays program:");
		
		obj.twoArraySum();
	}

}
