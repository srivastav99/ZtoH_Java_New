package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling_Checked {

	public static void main(String[] args) {
		
			 
	        // Reading content from file by passing local directory path
	        // where file should exists
	        try {
				m1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	 
	        // This file does not exist in the location
	        // This constructor FileInputStream
	        // throws FileNotFoundException which
	        

	}
	
	static void m1()throws FileNotFoundException  { //here if we comment out throws FileNotFoundException then, it will give an error at line 31(throws FileNotFoundException), since it is a checked exception it is required to use throws to throw the exception to previous calling method unlike for unchecked exceptions which do not require throws.
		
		try {
			FileInputStream GFG = new FileInputStream("/Desktop/GFG.txt");
		} 
		catch (IndexOutOfBoundsException e) {
			
			System.out.println("m1 method catch block");
		}
		
		System.out.println("m1 method end");
	}

}
