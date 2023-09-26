package Two_D_Array;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size for first matrix:");
		int row1=sc.nextInt();
		
		System.out.println("Enter col size for first matrix:");
		int col1=sc.nextInt();
		
		System.out.println("Enter row size for second matrix:");
		int row2=sc.nextInt();
		
		System.out.println("Enter col size for second matrix:");
		int col2=sc.nextInt();
		
		
		int arr1[][]=new int[row1][col1];
		int arr2[][]=new int[row2][col2];
		int mul[][]=new int[row1][col2];
		
		if(col1==row2) {
			
				System.out.println("Enter "+(row1*col1)+ " elements for array 1:");
				for(int i=0;i<row1;i++) {
					for(int j=0;j<col1;j++) {
						arr1[i][j]=sc.nextInt();
					}
				}
				
				System.out.println("Enter "+(row2*col2)+ " elements for array 2:");
				for(int i=0;i<row2;i++) {
					for(int j=0;j<col2;j++) {
						arr2[i][j]=sc.nextInt();
					}
				}
				
				
				//Multiplication
				
				for(int i=0;i<row1;i++) {
					for(int j=0;j<col2;j++) {
						for(int k=0;k<row2;k++) { //or col1
							mul[i][j]+=arr1[i][k]*arr2[k][j];
						}
					}
				}
				
				System.out.println("Matrix multiplication:");
				for(int i=0;i<row1;i++) {
					for(int j=0;j<col2;j++) {
						System.out.print(mul[i][j]+" ");
					}
					System.out.println();
				}
		
			
		}
		else {
			System.out.println("Number of columns in first matrix is not equal to number of rows in second matrix, thus matrix multiplication is not possible.");
		}

	}

}
