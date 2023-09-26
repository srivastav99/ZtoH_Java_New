package Basic;

import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number from 1 to 9:");
		int a = sc.nextInt();
		
		num = (((a*2)+6)/2)-3;
		System.out.println(num);
	}

}
