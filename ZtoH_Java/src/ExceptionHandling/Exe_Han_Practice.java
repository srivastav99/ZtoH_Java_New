
package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Exe_Han_Practice {

	public static void main(String[] args) {
		
		int a=10,b=0;
		
		System.out.println("main start");
		//un-checked exception(Arithmetic exception)
		try {	
			int c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception : cannot be divided by 0");
			
		}
		
		System.out.println("random print statement");
		//checked exception(FileNotFound exception)
		try {
			FileInputStream GFG = new FileInputStream("/Desktop/GFG.txt");
		}
		catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		//Exe_Han_Practice o = new Exe_Han_Practice();
		//exception handling in another method without throws
		try {
			Exe_Han_Practice.m1(); //accessing static method through class name
		}
		catch (Exception e) {
			System.out.println("issue resolved in main method");
		}
		
		//exception handling in another method with throws(here the catch method in m2 is appropriate to handle the respective exception and thus console remains at m2 method and executes the remaining lines of code in m2 method and then comes back to main.
		try {
			Exe_Han_Practice.m2(); //accessing static method through class name
		}
		catch (Exception e) {
			System.out.println("issue resolved in main method");
		}
		
		//exception handling in another method with throws(here the catch method in m3 is not appropriate to handle the respective exception and thus console moves back to main method to resolve the un-resolved exception and then does not go back to m2 to execute remaining lines of code in m2,instead it just continues with main method().
		try {
			Exe_Han_Practice.m3(); //accessing static method through class name
		}
		catch (Exception e) {
			System.out.println("issue resolved in main method --- "+e.getMessage());
			
		}
		System.out.println("main end");
		
		
	}
	
	static void m1(){
		
		int a1=10,b1=0;
		
		System.out.println("m1 method start");
		//un-checked exception(Arithmetic exception)
		try {	
			int c1=a1/b1;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception : cannot be divided by 0 --- m1 method");
			
		}
		
		System.out.println("random print statement of m1 method");
		//checked exception(FileNotFound exception)
		try {
			FileInputStream GFG = new FileInputStream("/Desktop/GFG.txt");
		} 
		catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage()+" --- m1 method");
		}
		
		System.out.println("m1 method end");
	
	}
	
	
	static void m2() throws FileNotFoundException,ArithmeticException{
		
		int a2=10,b2=0;
		
		System.out.println("m2 method start");
		//un-checked exception(Arithmetic exception)
		try {	
			int c2=a2/b2;
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmatic exception : cannot be divided by 0 --- m2 method");
			
		}
		
		System.out.println("random print statement of m2 method");
		//checked exception(FileNotFound exception)
		try {
			FileInputStream GFG = new FileInputStream("/Desktop/GFG.txt");
		} 
		catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage()+" --- m2 method");
		}
		System.out.println("m2 method end");
		
	}
	
	static void m3() throws FileNotFoundException,ArithmeticException{
		
		int a2=10,b2=0;
		
		System.out.println("m3 method start");
		//un-checked exception(Arithmetic exception)
		try {	
			int c2=a2/b2;
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Arithmatic exception : cannot be divided by 0 --- m3 method");
			
		}
		
		System.out.println("random print statement of m3 method");
		//checked exception(FileNotFound exception)
		try {
			FileInputStream GFG = new FileInputStream("/Desktop/GFG.txt");
		} 
		catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage()+" --- m3 method");
		}
		System.out.println("m3 method end");
		
	}
}


