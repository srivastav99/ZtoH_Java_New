package Two_D_Array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size:");
		int row=sc.nextInt();
		
		System.out.println("Enter col size:");
		int col=sc.nextInt();
		
		int arr1[][]=new int[row][col];
		int arr1Transpose[][]=new int[col][row];
		

		System.out.println("Enter "+(row*col)+ " elements for array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		//Logic
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				
					arr1Transpose[i][j]=arr1[j][i];
				
			}
		}
		
		/*
		//Just printing arr1 for representation
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		*/
		
		
		System.out.println("Transpose of matrix having "+row+" rows and "+col+" columns:");
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr1Transpose[i][j]+" ");
			}
			System.out.println();
		}
	

	}

}
