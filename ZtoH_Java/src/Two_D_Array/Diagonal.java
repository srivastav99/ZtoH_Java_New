package Two_D_Array;

import java.util.Scanner;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		
		System.out.println("Enter col size:");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		
		System.out.println("Enter "+(row*col)+ " elements for array 1:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		

		//Logic
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					arr2[i][j]=arr1[i][j];
				}
			}
		}
		
		//for(int i=0;i<row;i++) {
			//for(int j=0;j<col;j++) {
				//System.out.print(arr2[i][j]+" ");
			//}
			//System.out.println();
		//}
		
		System.out.println("Diagonal of matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j) {
					System.out.print(arr2[i][j]);
				}
				System.out.print(" ");
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
		
		
		if(row==col)
		{
			System.out.println("Enter "+(row*col)+ " elements for array:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					arr1[i][j]=sc.nextInt();
				}
			}
			
	
			System.out.println("Diagonal of matrix:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i==j) {
						System.out.print(arr1[i][j]);
					}
					else {
					System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Number of rows is not equal to columns, so not possible to find a diagonal line of symmetry");
		}
		
	}

}
