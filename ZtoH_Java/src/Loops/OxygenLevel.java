package Loops;

import java.util.Scanner;


public class OxygenLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int t1=0,t2=0,t3=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Round 1:");
		for(int i=1;i<=3;i++) {
			
			
			System.out.println("Enter oxygen value of trainee "+i+" :");
			int n=sc.nextInt();
			if(n>=1 && n<=100) {
				if(i==1) {
					t1=t1+n;
				}
				else if(i==2) {
					t2=t2+n;
				}
				else {
					t3=t3+n;
				}
			}
				
		}
		
		System.out.println("Round 2:");
		for(int i=1;i<=3;i++) {
			
			
			System.out.println("Enter oxygen value of trainee "+i+" :");
			int n=sc.nextInt();
			if(n>=1 && n<=100) {
				if(i==1) {
					t1=t1+n;
				}
				else if(i==2) {
					t2=t2+n;
				}
				else {
					t3=t3+n;
				}
			}
		}
		
		System.out.println("Round 3:");
		for(int i=1;i<=3;i++) {
			
			
			System.out.println("Enter oxygen value of trainee "+i+" :");
			int n=sc.nextInt();
			if(n>=1 && n<=100) {
				if(i==1) {
					t1=t1+n;
				}
				else if(i==2) {
					t2=t2+n;
				}
				else {
					t3=t3+n;
				}
			}
		}
		
		//Finding average values
		t1=t1/3; 
		t2=t2/3;
		t3=t3/3;
		
		if(((t1+t2+t3)/3)<70) {
			System.out.println(" All trainees are unfit.");
		}
		else {
		
			if(t1>t2 && t1>t3) {
				System.out.println("Trainee Number:1");
			}
			else if(t2>t3 && t2>t1){
				System.out.println("Trainee Number:2");
			}
			else if(t3>t2 && t3>t1) {
				System.out.println("Trainee Number:3");
			}
		
			else {
				if(t1==t2 && t2==t3) {
					System.out.println("Trainee Number:1\nTrainee Number:2\nTrainee Number:3");
				}
				else if(t1==t2) {
					System.out.println("Trainee Number:1\nTrainee Number:2");
				}
				else if(t2==t3) {
					System.out.println("Trainee Number:2\nTrainee Number:3");
				}
				else if(t1==t3) {
					System.out.println("Trainee Number:1\nTrainee Number:3");
				}
				
			}
		}
		
		*/
		
		int t1=0,t2=0,t3=0;
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=1;i<=3;i++) {
			
			
			System.out.println("Enter oxygen value of round "+i+" of trainee 1,2,3 respectively:");
			int n=sc.nextInt();
			if(n>=1 && n<=100) {
				t1=t1+n;
			}
			n=sc.nextInt();
			if(n>=1 && n<=100) {
				t2=t2+n;
			}
			n=sc.nextInt();
			if(n>=1 && n<=100) {
				t3=t3+n;
			}
				
		}
		
		//Finding average values
		t1=t1/3; 
		t2=t2/3;
		t3=t3/3;
				
		if(t1<70 && t2<70 && t3<70)
		{ 
			System.out.println("All trainees are unfit.");
		}
		else {
		
			if(t1>t2 && t1>t3) {
				System.out.println("Trainee Number:1");
			}
			else if(t2>t3 && t2>t1){
				System.out.println("Trainee Number:2");
			}
			else if(t3>t2 && t3>t1) {
				System.out.println("Trainee Number:3");
			}
		
			else {
				if(t1==t2 && t2==t3) {
					System.out.println("Trainee Number:1\nTrainee Number:2\nTrainee Number:3");
				}
				else if(t1==t2) {
					System.out.println("Trainee Number:1\nTrainee Number:2");
				}
				else if(t2==t3) {
					System.out.println("Trainee Number:2\nTrainee Number:3");
				}
				else if(t1==t3) {
					System.out.println("Trainee Number:1\nTrainee Number:3");
				}
			}
		}
	}

}
