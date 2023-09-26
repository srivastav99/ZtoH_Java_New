package Basic;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, rev=0,digit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to be reversed:");
		n = sc.nextInt();
		
		//Using while loop
		while(n!=0) 
		{
			
			digit=n%10;  //Gives last digit of the number
			rev = rev*10+digit;  //Builds up the number in reverse order
			n=n/10;  //Eliminates the last digit as it is no longer required.
		}
		
		//Using for loop
		/*
		for(;n!=0;n=n/10)
		{
			
			digit=n%10;  //Gives last digit of the number
			rev = rev*10+digit;  //Builds up the number in reverse order
			
		}
		*/
		System.out.println("The reverse of the given number is:"+rev);
	}

}