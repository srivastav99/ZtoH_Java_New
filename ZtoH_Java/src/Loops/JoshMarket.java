package Loops;

import java.util.Scanner;

public class JoshMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int N,flag=0,n4,lot1,lot2,lot1p,lot2p,valid;  //lot1=M1, lot1p=P1, lot2=M2, lot2p=P2
		double lot1peroneCost,lot2peroneCost;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many apples required:");
		N=sc.nextInt();
		
		System.out.println("Enter lot1 size and price of each lot seperated by space:");
		lot1=sc.nextInt();
		lot1p=sc.nextInt();
		
		
		System.out.println("Enter lot2 size and price of each lot seperated by space:");
		lot2=sc.nextInt();
		lot2p=sc.nextInt();
		
		lot1peroneCost = (double)lot1p/lot1;
		
		lot2peroneCost = (double)lot2p/lot2;
		valid=N;
		while(valid>=0){  //To check whether with the given number N , it is possible to form combination of lots or not. 
			if(lot1peroneCost<=lot2peroneCost) {
				if(valid%lot1==0) {
					flag=1;
					break; // if control comes inside this then combination is possible and so breaking the loop.
				}
				else {
					valid=valid-lot2;
				}	
			}
			else {
				if(valid%lot2==0) {
					flag=1;
					break;  // if control comes inside this then combination is possible and so breaking the loop.
				}
				else {
					valid=valid-lot1;
				}
			}
			
		}
		if(flag==1) {
			int n3=N;
			while(flag!=0) {
				if(lot1peroneCost<=lot2peroneCost) {
					if(n3%lot1==0) {
						flag=0;
					}
					else {
						n3=n3-lot2;
					}	
				}
				else {
					if(n3%lot2==0) {
						flag=0;
					}
					else {
						n3=n3-lot1;
					}
				}
			
			
			}
		
		
			n4=N-n3;
			if(lot1peroneCost<=lot2peroneCost) {
				System.out.println("Total price:"+ (((n3/lot1)*lot1p) + ((n4/lot2)*lot2p)) );
			
			}
			else {
		
				System.out.println("Total price:"+ (((n4/lot1)*lot1p) + ((n3/lot2)*lot2p)) );
			}
		}
		
		else {
			System.out.println("Not possible to divide among given variants.");
		}
		
		*/
		

		
		int N,flag=1,n3,n4,lot1,lot2,lot1p,lot2p;  //lot1=M1, lot1p=P1, lot2=M2, lot2p=P2
		double lot1peroneCost,lot2peroneCost;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many apples required:");
		N=sc.nextInt();
		
		System.out.println("Enter lot1 size and price of each lot seperated by space:");
		lot1=sc.nextInt();
		lot1p=sc.nextInt();
		
		
		System.out.println("Enter lot2 size and price of each lot seperated by space:");
		lot2=sc.nextInt();
		lot2p=sc.nextInt();
		
		lot1peroneCost = (double)lot1p/lot1;
		
		lot2peroneCost = (double)lot2p/lot2;

		n3=N;
		while(flag!=0) {
			if(n3<0) {	
				break;
			}
			if(lot1peroneCost<=lot2peroneCost) {
				if(n3%lot1==0) {
					flag=0;
				}
				else {
					n3=n3-lot2;
				}	
			}
			else {
				if(n3%lot2==0) {
					flag=0;
				}
				else {
					n3=n3-lot1;
				}
			}
			
			
		}
		
		if(flag==0) {
			n4=N-n3;
			if(lot1peroneCost<=lot2peroneCost) {
				System.out.println("Total price:"+ (((n3/lot1)*lot1p) + ((n4/lot2)*lot2p)) );
			
			}
			else {
		
				System.out.println("Total price:"+ (((n4/lot1)*lot1p) + ((n3/lot2)*lot2p)) );
			}
		}
		
		else {
			System.out.println("Not possible to divide among given variants.");
		}

	}

}
