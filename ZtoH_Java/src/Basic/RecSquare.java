package Basic;

import java.util.Scanner;

public class RecSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of length:");
		int l = sc.nextInt();
		
		System.out.println("Enter the value of breadth:");
		int b = sc.nextInt();
		
		if(l==b) {
			System.out.println("It is a square.");
		}
		else {
			System.out.println("It is not a square.");
		}

	}

}
