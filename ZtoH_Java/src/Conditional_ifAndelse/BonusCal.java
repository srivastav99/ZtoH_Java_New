
package Conditional_ifAndelse;

import java.util.Scanner;

public class BonusCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double service, salary, bonus;
		double bonus,salary;;
		int service;;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your salary:");
		salary = sc.nextDouble();
		
		
		System.out.println("Enter year of service:");
		service = sc.nextInt();
		
		if(service > 5) {
			//bonus = salary*(5.0/100);//Here one of 5.0 and 100.0 is to be given other wise it will consider as int and the resultant will be 0.
			//or
			bonus = salary*5/100;
			System.out.println("Net bonus amount(5%) = "+bonus);
		}
		else {
			System.out.println("Bonus is applicable for employees who have completed more than 5 years of service.");
		}
	}

}
