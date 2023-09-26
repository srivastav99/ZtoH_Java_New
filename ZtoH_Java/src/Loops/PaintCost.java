package Loops;

import java.util.Scanner;

public class PaintCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int IW, EW;
		double n, nI=0, nE=0, costI=0, costE=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of interior walls:");
		IW = sc.nextInt();
		
		System.out.println("Enter number of exterior walls:");
		EW = sc.nextInt();
		
		for(int i=1;i<=IW;i++) {
			
			System.out.println("Enter surface area of interior wall "+i+" out of "+IW+" :");
			n=sc.nextDouble();
			
			if(n==0) { //actually not required, this is done just for clarity to depict what is shown in qs.
				continue;
			}
			else {
			nI=nI+n;
			}
		}
		costI=18*nI;
		
		for(int i=1;i<=EW;i++) {
			
			System.out.println("Enter surface area of exterior wall "+i+" out of "+EW+" :");
			n=sc.nextDouble();
			if(n==0) {   //actually not required, this is done just for clarity to depict what is shown in qs.
				continue;
			}
			else {
				nE=nE+n;
			}
			
		}
		costE=12*nE;
		
		System.out.println("Total estimated Cost: "+(costI+costE)+" INR");

	}
	

}
