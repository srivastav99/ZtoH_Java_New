package Conditional_ifAndelse;

import java.util.Scanner;

public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int classesHeld ;
		double percentage, classesAttended;
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of classes held:");
		classesHeld = sc.nextInt();
		//Here classesHeld = sc.nextInt(); is also working
		
		System.out.println("Enter number of classes attended:");
		classesAttended = sc.nextDouble();
		//Here classesAttended = sc.nextInt(); is also working
		
		percentage = (classesAttended/classesHeld)*100; //or take both int and write (classAttended*100/classHeld)
		
		if(percentage < 75) {
			System.out.println("The student is not to be allowed for exam.");
		}
		else {
			System.out.println("The student is to be allowed for exam.");
		}
		
		

	}

}
