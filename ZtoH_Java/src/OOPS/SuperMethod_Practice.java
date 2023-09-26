package OOPS;

import java.awt.print.Printable;

class  Area1 {
	//Default constructor	
	
	Area1() {
		
		System.out.println("Parent class constructor.");
	}
	
	//Overloaded constructor
	Area1(int a){
		
		System.out.println("Parent class constructor with arguments.");
	}
}


public class SuperMethod_Practice extends Area1{

	public static void main(String[] args) {
		
		SuperMethod_Practice o = new SuperMethod_Practice();
		
		
	}
	
	SuperMethod_Practice(){
		super(10);
	}
	
	
}
