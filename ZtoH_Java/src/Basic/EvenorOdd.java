package Basic;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("The given number "+num+" is a even number.");
		}
		else {
			System.out.println("The given number "+num+" is a odd number.");
		}
	}

}
