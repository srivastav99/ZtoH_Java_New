package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws_CheckedAndUnchecked {

	public static void main(String[] args) {
		
		Ex o = new Ex();
		try {
			o.method1();
		}
		catch (IndexOutOfBoundsException e) {
			
			System.out.println("Cannot divide by 0");
		} 
		
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			

			o.method2();
		}
		catch (IndexOutOfBoundsException e) {
			
			System.out.println("Cannot divide by 0");
		} 
		
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		//still have to try
		try {
			o.method3();
		}
		catch (IndexOutOfBoundsException e) {
			
			System.out.println("Cannot divide by 0");
		} 
		
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}

class Ex{
	
	void method1(){//method having unchecked exception and thus does not require throws,throw
		
		int a=10, b=0,c=0;
		
		try {
			c=a/b;
		} 
		catch(IndexOutOfBoundsException e) {
			
			System.out.println("catch block");
		}
		
		
	}
	void method2() throws FileNotFoundException  {//method having checked exception and thus require throws

		
		File file = new File("not_existing_file.txt");
	    try {
	        FileInputStream stream = new FileInputStream(file);
	    } 
	    catch (IndexOutOfBoundsException e) {
	       System.out.println("catch block method 2");
	    }
	}
	
	void method3() throws FileNotFoundException {//method having checked and unchecked exception and thus require throws,throw it only sends unchecked exception back
		
		int a=10, b=0,c=0;
	
		File file = new File("not_existing_file.txt");
	    try {
	        FileInputStream stream = new FileInputStream(file);
	    } 
	    catch (IndexOutOfBoundsException e) {
	       System.out.println("catch block method 2");
	       //throw new FileNotFoundException();
	    }
		
		try {
			c=a/b;
		} 
		catch(IndexOutOfBoundsException e) {
			
			System.out.println("catch block");
		}
		
		System.out.println("fdrgrgrhg");
		
	}
	
	
	
	
}

