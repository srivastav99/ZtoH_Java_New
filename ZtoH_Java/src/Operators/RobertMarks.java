package Operators;

import java.util.Scanner;

public class RobertMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without scanner - Without user input
		/*
		int s1=78, s2=45, s3=62;
		double percentage, total;
		total = s1+s2+s3;
		percentage = (total/(100*3))*100;
		System.out.println("Total marks of 3 subjects: "+total);
		System.out.println("Total percentage of 3 subjects: "+percentage);
		*/
		
		//With scanner - With user input
		
		int s1, s2, s3;
		double percentage, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter subject1 marks:");
		s1 = sc.nextInt();
		
		System.out.println("Enter subject2 marks:");
		s2 = sc.nextInt();
		
		System.out.println("Enter subject3 marks:");
		s3 = sc.nextInt();

		total = s1+s2+s3;
		percentage = (total/(100*3))*100;
		System.out.println("Total marks of 3 subjects: "+total);
		System.out.println("Total percentage of 3 subjects: "+percentage);
		
	}

}
