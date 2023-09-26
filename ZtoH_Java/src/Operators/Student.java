package Operators;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Without scanner function - Without taking user inputs
		/*
		
		String name="Vastav", interest ="Software";
		int rollno = 301;
		
		System.out.println("Hey, my name is "+name+" and my roll number is "+rollno+". My field of interest are "+interest+".");
		*/
		
		//with scanner function - taking user inputs
		
		String name, interest, rollno;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter name:");
		name = s.nextLine();
		
		System.out.println("Enter rollno:");
		rollno = s.nextLine();
		
		System.out.println("Enter field of interest:");// This program will not take in interest input if you take rollno as int and use s.nextLine() for taking interest input. It will work if you use s.next()to take interest input.The problem is with the input.nextInt() method; it only reads the int value. So when you continue reading with input.nextLine() you receive the "\n" Enter key. So to skip this you have to add the input.nextLine().
		interest = s.nextLine();
		
		System.out.println("Hey, my name is "+name+" and my roll number is "+rollno+". My field of interest are "+interest+".");
		
	}

}
