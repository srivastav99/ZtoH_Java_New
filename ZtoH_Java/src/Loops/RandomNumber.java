package Loops;

import java.util.Random;
import java.util.Scanner;


public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//With inbuilt-function
		/*
		Random r = new Random();
		
		int x = r.nextInt(50);
		System.out.println(x);
		*/
		//With-out inbuilt function
		
	
		Scanner sc = new Scanner(System.in);
		
		int x=23;
		//or ask user for random number.
		/*
		System.out.println("Enter random number:");
		int x = sc.nextInt(); 
		*/
		System.out.println("Guess the number:");
		int num = sc.nextInt(); 
		
		while(true) {
			
			if(num>x) {
				
				System.out.println("Too high,try again.");
			}
			else if(num<x){
				System.out.println("Too low,try again.");
			}
			else {
				System.out.println("Congrats, you guessed right.");
				break;
			}
			System.out.println("Guess the number:");
			num = sc.nextInt(); 
			
		}
		

	}

}
