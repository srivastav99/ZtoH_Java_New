package Basic;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double classesHeld, classesAttended;
		double percentage;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of classes held:");
		classesHeld = sc.nextDouble();
		//Here classesHeld = sc.nextInt(); is also working
		
		System.out.println("Enter number of classes attended:");
		classesAttended = sc.nextDouble();
		//Here classesAttended = sc.nextInt(); is also working
		
		percentage = (classesAttended/classesHeld)*100;
		
		if(percentage < 75) {
			System.out.println("The student is not to be allowed for exam.");
		}
		else {
			System.out.println("The student is to be allowed for exam.");
		}
		
		

	}

}
