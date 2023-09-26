package Selection_Switch;

import java.util.Scanner;

public class MonthSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Select\n1 for January\n2 for February\n3 for March\n4 for April\n5 for May\n6 for June\n7 for July\n8 for August\n9 for September\n10 for October\n11 for November\n12 for December");
		num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April;");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		
		
		
		default : System.out.println("Invalid month entered");
		}

	}

}
