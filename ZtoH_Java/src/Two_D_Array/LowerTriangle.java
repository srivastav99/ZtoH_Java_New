package Two_D_Array;

import java.util.Scanner;

public class LowerTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		
		System.out.println("Enter col size:");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];
		
		
		
		
		if(row==col) {
			System.out.println("Enter "+(row*col)+ " elements for array 1:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					arr1[i][j]=sc.nextInt();
				}
			}
			
			for(int i=0;i<row;i++) {
				for(int j=col-1;j>i;j--) {
					arr1[i][j]=0;
				}
			}
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(arr1[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Number of rows is not equal to columns, so not possible to create a lower triangular matrix");
		}
	*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		
		System.out.println("Enter col size:");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		
		
		
		if(row==col) {
			System.out.println("Enter "+(row*col)+ " elements for array 1:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					arr1[i][j]=sc.nextInt();
				}
			}
			//Logic
			for(int i=0;i<row;i++) {
				for(int j=0;j<=i;j++) {
					arr2[i][j]=arr1[i][j];
				}
			}
			//Printing only lower triangle without 0s.
		
			//for(int i=0;i<row;i++) {
				//for(int j=0;j<=i;j++) {
					//System.out.print(arr2[i][j]+" ");
				//}
				//System.out.println();
			//
			// }
			
			System.out.println("Lower triangular matrix:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(arr2[i][j]+" ");
				}
				System.out.println();
			}
			
			
		}
		else {
			System.out.println("Number of rows is not equal to columns, so not possible to create a lower triangular matrix");
		}
		*/
		
		

		//Taking one array and printing lower triangle pattern
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		
		System.out.println("Enter col size:");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];
		
		if(row==col)
		{
			System.out.println("Enter "+(row*col)+ " elements for array 1:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					arr1[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Lower triangular matrix:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i>=j) {
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
			System.out.println("Number of rows is not equal to columns, so not possible to create a lower triangular matrix");
		}

		
	}

}
