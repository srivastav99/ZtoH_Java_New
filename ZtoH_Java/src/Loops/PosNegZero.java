package Loops;

import java.util.Scanner;

public class PosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, range, countP=0,countN=0, countZ=0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers you want to enter:");
		range = sc.nextInt();
		
		for(int i=1;i<=range;i++) {
			System.out.println("Enter number "+i+":");
			n = sc.nextInt();
			
			if(n>0) {
				countP++;
			}
			else if(n<0){
				countN++;
				
			}
			else {
				countZ++;
			}
		}
		System.out.println("Count of positive numbers entered:"+countP);
		System.out.println("Count of negative numbers entered:"+countN);
		System.out.println("Count of zeros entered:"+countZ);
		
		

	}

}
