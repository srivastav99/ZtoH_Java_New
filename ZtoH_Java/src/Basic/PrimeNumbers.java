package Basic;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n; 
		System.out.println("Enter the range-end value:");
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.print("Prime numbers from 0 to "+n+" are: ");
		for (int j = 2; j <= n; j++) {
			
			int flag = 0;

			for (int i = 2; i <= j/2 ; i++) {
				
				if (j % i == 0) {
					flag = 1;

					break;
				}
			}
			
			
			if (j == 1) {
				System.out.println("1 is neither prime nor composite.");
			} 
			else if (flag == 0) {
				System.out.print(j+" ");

			} 
			
		}
	}

	}


