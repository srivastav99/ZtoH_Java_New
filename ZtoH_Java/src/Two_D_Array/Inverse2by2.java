package Two_D_Array;

import java.util.Scanner;

public class Inverse2by2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mul1=1,mul2=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size for matrix:");
		int row1=sc.nextInt();
		
		System.out.println("Enter col size for matrix:");
		int col1=sc.nextInt();
		
		double arr1[][]=new double[row1][col1];
		double arr1inv[][]=new double[row1][col1];
		
		System.out.println("Enter "+(row1*col1)+ " elements for array:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		
		
				// mul1=a*d, mul2=b*c
				for(int i=0;i<row1;i++) {
					for(int j=0;j<col1;j++) {
						if(i==j) {
							mul1=mul1*arr1[i][j];
						}
						else {
							mul2=mul2*arr1[i][j];
						}
							
					}
				}
				
				
				   //(ad-bc!=0)
				if(mul1-mul2!=0) {
					for(int i=0;i<row1;i++) {
						for(int j=0;j<col1;j++) {
							
							if(i==j) {
								arr1inv[i][j]=(1/(mul1-mul2))*arr1[i][j]; //((1/(ad-bc))*matrix
							}
							else {
								arr1inv[i][j]=-((1/(mul1-mul2))*arr1[i][j]);
							}
						}
						
					}
					
					
					//Swapping a,d
					arr1inv[0][0] = arr1inv[0][0]+arr1inv[row1-1][col1-1];
					arr1inv[row1-1][col1-1] = arr1inv[0][0]-arr1inv[row1-1][col1-1];
					arr1inv[0][0] = arr1inv[0][0]-arr1inv[row1-1][col1-1];
				
					System.out.println("Matrix inversion:");
					for(int i=0;i<row1;i++) {
						for(int j=0;j<col1;j++) {
							System.out.print(arr1inv[i][j]+" ");
						}
						System.out.println();
					}
				}
			
				else {
					System.out.println("Matrix inversion not possible.");
				}
			

	}

}
