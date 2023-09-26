package Two_D_Array;

import java.util.Scanner;

public class Inverse3by3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mul1=1,mul2=1,det=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row size for matrix:");
		int row=sc.nextInt();
		
		System.out.println("Enter col size for matrix:");
		int col=sc.nextInt();
		
		double arr[][]=new double[row][col];
		double a[][]=new double[row][col];
		
		double aT[][]=new double[row][col];
		
		double aInv[][]=new double[row][col];
		
		double op[][]= {{1,-1,1},{-1,1,-1},{1,-1,1}};
		
		
		System.out.println("Enter "+(row*col)+ " elements for array:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//2by2 matrix for co-factors
		double arr1[][]=new double[row-1][col-1];
		
		int k=0,s=0;
		int z=0;
		
		//finding co-factors 2by2
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				s++;
				k=0;
				for(int x=0;x<row;x++) {
					for(int y=0;y<col;y++) {
						
						k++;
						
						if(s<=3) {
							if((k==5 || k==6 || k==8 || k==9) && s==1) {
								arr1[x-1][y-1]=arr[x][y];
							}
							else if((k==4 || k==6 || k==7 || k==9) && s==2) {
								
								if(y==0) {
									arr1[x-1][y]=arr[x][y];
									
								}
								else {
									arr1[x-1][y-1]=arr[x][y];
									
								}
								
							}
							
							else if((k==4 || k==5 || k==7 || k==8) && s==3) {
								if(z==0) {
									arr1[x-1][z]=arr[x][y];
									z++;
								}
								else {
									arr1[x-1][z]=arr[x][y];
									z=0;
								}
							}
							
						}
						
						if(s>3 && s<=6) {
							if((k==2 || k==3 || k==8 || k==9) && s==4) {
								if(x==0) {
									arr1[x][y-1]=arr[x][y];
								}
								else if(x==2) {
									arr1[x-1][y-1]=arr[x][y];
								}
							}
								
							else if((k==1 || k==3 || k==7 || k==9)  && s==5) {
								if(x==y && x==0) {
									arr1[x][y]=arr[x][y];
								}
								else if(x==y && x==2){
									arr1[x-1][y-1]=arr[x][y];
								}
								else if(x!=y && y==2){
									arr1[x][y-1]=arr[x][y];
								}
								else if(x!=y && x==2){
									arr1[x-1][y]=arr[x][y];
								}
							}
							else if((k==1 || k==2 || k==7 || k==8)  && s==6) {
								if(x==0) {
									arr1[x][y]=arr[x][y];
								}
								else if(x!=0) {
									arr1[x-1][y]=arr[x][y];
								}
								
							}
						}
						
						
						if(s>6 && s<=9) {
							if((k==2 || k==3 || k==5 || k==6)  && s==7) {	
									arr1[x][y-1]=arr[x][y];
	
							}
							else if((k==1 || k==3 || k==4 || k==6)  && s==8) {
								if(y==0) {
									arr1[x][y]=arr[x][y];
								}
								else if(y!=0) {
									arr1[x][y-1]=arr[x][y];
								}
							}
							else if((k==1 || k==2 || k==4 || k==5)  && s==9) {
								
								arr1[x][y]=arr[x][y];
							}
							
						}
						
					}
				}
				
				//printing co-factors
				System.out.println("Co-factor of element(minor matrix) "+s+" :");
				for(int m=0;m<row-1;m++) {
					for(int n=0;n<col-1;n++) {
						System.out.print(arr1[m][n]+" ");
					}
					System.out.println();
				}
				System.out.println();
				System.out.println();
				
				
				//finding ad-bc to find elements of adjoint matrix
				for(int m=0;m<row-1;m++) {
					for(int n=0;n<col-1;n++) {
						if(m==n) {
							mul1=mul1*arr1[m][n];
						}
						else {
							mul2=mul2*arr1[m][n];
						}
							
					}
				}
				//placing elements in adj matrix and applying + and -
				if(s==1 || s==3 || s==5 || s==7 || s==9)
				{
					a[i][j]=mul1-mul2;
					
				}
				else {
					a[i][j]=-(mul1-mul2);
					
				}
				
				//finding det
				if(s==1 || s==2 || s==3)
				{
					if(s==1 || s==3) {
						det+=arr[i][j]*(mul1-mul2);
						
					}
					else {
						det+=-arr[i][j]*(mul1-mul2);
						
					}
				
				}
				mul1=1;
				mul2=1;
			}
		}
		System.out.println("Determinanat of given matrix:"+det);
		System.out.println();
		
		System.out.println("co-factor matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//transpose
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				
					aT[i][j]=a[j][i];
				
			}
		}
		
		System.out.println("Adjoint matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(aT[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		if(det!=0) {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					aInv[i][j]=(1/det)*(aT[i][j]);
				}
				
			}
			
			System.out.println("Inverse of given matrix:");
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					System.out.print(aInv[i][j]+" ");
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Since det is 0 matrix inversion is not possible.");
		}
	
	}

}
