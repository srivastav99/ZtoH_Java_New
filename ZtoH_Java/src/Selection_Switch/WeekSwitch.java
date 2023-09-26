package Selection_Switch;

import java.util.Scanner;

public class WeekSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a day:");
		str = sc.nextLine();
		
		switch (str.toLowerCase()) {
		case "monday":
			
			
		case "tuesday":
			
			
		case "wednesday":
			
			
		case "thursday":
			
			
		case "friday":
			System.out.println("Uff, it's a weekday");
			break;
			
		case "saturday":
			
		case "sunday":
			System.out.println("Yayy, It's a weekend");
			break;

		default:
			System.out.println("Invalid input.");
			System.out.println("Entered input:"+str);
			
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select:\n1 for Monday\n2 for Tuesday\n3 for Wednesday\n4 for Thursday\n5 for Friday\n6 for Saturday\n7 for Sunday");
		
		int num;
		
		
		System.out.println("Enter a day:");
		num = sc.nextInt();
		
		switch (num) {
		case 1:
			
			
		case 2:
			
			
		case 3:
			
			
		case 4:
			
			
		case 5:
			System.out.println("Uff, it's a weekday");
			break;
			
		case 6:
			
		case 7:
			System.out.println("Yayy, It's a weekend");
			break;

		default:
			System.out.println("Invalid input.");
			System.out.println("Entered input:"+num);
		
			
		}

	}

}
