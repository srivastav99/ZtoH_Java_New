package Selection_Switch;

import java.util.Scanner;

public class EvenorOddSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num = sc.nextInt();
		
		n=num%2;
		
		//switch statement does not accept double, only int and string .
		switch (n) {
		case  0:
			System.out.println("The given number is a even number.");
			break;
			

		default:
			System.out.println("The given number is a odd number.");
			
		}

	}

}
