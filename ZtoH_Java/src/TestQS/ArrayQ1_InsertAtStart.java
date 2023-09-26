package TestQS;

import java.util.Scanner;

public class ArrayQ1_InsertAtStart {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array:");
		int n = sc.nextInt();
		
		int []a=new int[n+1];
		
		System.out.println("Enter "+n+" elements:");
		for(int i=1;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number to insert at start:");
		int num = sc.nextInt();
		a[0]=num;
		
		System.out.println("Final array:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}

	}

}
