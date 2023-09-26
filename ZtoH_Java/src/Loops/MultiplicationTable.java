package Loops;

import java.util.Scanner;

import javax.sound.midi.Soundbank;
import javax.sound.midi.SysexMessage;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive number whose multiplication table is required:");
		num = sc.nextInt();
		
		if(num>0) {
			
		System.out.println("The multiplication table of "+num+" is:");
		for(int i=1;i<=10;i++) {
			
			System.out.println(num+"*"+i+"="+num*i);
		}
		}
		else {
			System.out.println("The given number is not a positive number.");
		}

	
	}
}


