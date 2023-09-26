package Basic;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double marks;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter marks:");
		marks = sc.nextDouble();
		
		if(marks < 25 && marks >=0) {
			
			System.out.println("Grade of the student is F.");
		}
		else if (marks >= 25 && marks < 45) {
			System.out.println("Grade of the student is E.");
			
		}
		else if (marks >= 45 && marks < 50) {
			System.out.println("Grade of the student is D.");
			
		}
		else if (marks >= 50 && marks < 60) {
			System.out.println("Grade of the student is C.");
			
		}
		else if (marks >= 60 && marks < 80) {
			System.out.println("Grade of the student is B.");
			
		}
		else if(marks >=80 && marks <= 100) {
			System.out.println("Grade of the student is A.");
		}
		else {
			System.out.println("Marks entered is invalid.");
			System.out.println("Entered value of marks:"+marks);
		}

	}

}
