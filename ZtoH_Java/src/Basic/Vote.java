package Basic;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age of the candidate:");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("The person is eligible to vote.");
		}
		else {
			System.out.println("The person is not eligible to vote.");
		}
	}

}
