package OPPS_AccessModifier;

import OOPS_AccessModifier1.*;
import OOPS_AccessModifier1.Mul1.nested_pub_Mul1;
import OPPS_AccessModifier.Mul.nested_default_Mul;
import OPPS_AccessModifier.Mul.nested_pub_Mul;

public class Calc_Main {

	
	//In this program add class is made to represent public class, subtract class to represent default class and mul class to represent public class with nested classes.
	//In the classes 2num method represents public method, 3num method represents default method and 4num method represents private method.
	
	//Access modifiers cannot be given to local variables(variables inside of methods),the only modifier that can be used on local variables(variables in method) is final. 
	public static void main(String[] args) {
		
		//Accessing same package memebers
		
		System.out.println("Accessing same package members:");
		System.out.println();
		
		System.out.println("Accessing same file members:");
		
		Calc_Main o = new Calc_Main(); //object made for accessing methods of same main class of same file of same package(public class) - no error
		
		o.f1();//accessing public method - no error
		o.f2();//accessing default method - no error
		o.f3();//accessing private method - no error
		System.out.println();
		
		subMain obj = new subMain(); //object made for accessing methods of another class of same file of same package(default class) - no error
		
		obj.func1();//accessing public method - no error
		obj.func2();//accessing default method - no error
		//obj.func3();//accessing private method - error
		System.out.println();
		
		System.out.println("Accessing another file, public class members:");
		Public_Add objA = new Public_Add(); //object made for accessing methods of another class of another file of same package(public class) - no error
		
		objA.add2num();//accessing public method - no error
		objA.add3num();//accessing default method - no error
		//objA.add4num();//accessing private method - error
		System.out.println();
		
		System.out.println("Accessing another file, default class members:");
		Default_Subtract objS = new Default_Subtract();  //object made for accessing methods of another class of another file of same package(default class) - no error
		
		objS.sub2num();//accessing public method - no error
		objS.sub3num();//accessing default method - no error
		//objS.sub4num();//accessing private method - error
		System.out.println();
		
		System.out.println("Accessing another file, public class members:");
		Mul objM = new Mul();  //object made for accessing methods of another class of another file of same package(public class) - no error
		
		objM.mul2num();//accessing public method - no error
		objM.mul3num();//accessing default method - no error
		//objM.mul4num();//accessing default method - error
		System.out.println();
		
		/*
		//Accessing method of nested class in anotherclass of another file of same package(public class) - error
		//Calling Public nested class methods
		objM.mul2nestedpub();// - error
		objM.mul3nestedpub();// - error
		objM.mul4nestedpub();// - error
		
		//Calling Default nested class methods
		objM.mul2nesteddef();// - error
		objM.mul3nesteddef();// - error
		objM.mul4nesteddef();// - error
		
		//Calling Private nested class methods
		objM.mul2nestedpvt();// - error
		objM.mul3nestedpvt();// - error
		objM.mul4nestedpvt();// - error
		*/
		
		System.out.println("Accessing another file, nested public class members:");
		nested_pub_Mul objM_nested_pub = new nested_pub_Mul();  //creating object for nested class of another class of another file of same package(public class), to make this successful we had to import the nested class even though it is in same package and also we have to make the nested class as static or use(nested class objname = primaryclassobject.new nestedclass ()) - no error
		
		objM_nested_pub.mul2nestedpub();//accessing public method of nested class of another class of another file of same package - no error
		objM_nested_pub.mul3nestedpub();//accessing default method of nested class of another class of another file of same package - no error
		//objM_nested_pub.mul4nestedpub();//accessing private method of nested class of another class of another file of same package - error
		
		System.out.println("Accessing another file, nested default class members:");
		Mul.nested_default_Mul objM_nested_def= objM.new nested_default_Mul(); //creating object for nested class of another class of another file of same package(default class), to make this successful we had to import the nested class even though it is in same package and also we have to make the nested class as static or use(nestedclass objname = primaryclassobject.new nestedclass ()) - no error
		
		objM_nested_def.mul2nesteddef();//accessing public method of nested class of another class of another file of same package - no error
		objM_nested_def.mul3nesteddef();//accessing default method of nested class of another class of another file of same package - no error
		//objM_nested_def.mul4nesteddef();//accessing private method of nested class of another class of another file of same package - error
		
		/*
		nested_pvt_Mul objM_nested_pvt= new nested_pvt_Mul();  //creating object for nested class of another class of another file of same package(private class) - error
		
		objM_nested_pvt.mul2nestedpvt();//accessing public method of nested class of another class of another file of same package - error as object creation gives error.
		objM_nested_pvt.mul3nestedpvt();//accessing default method of nested class of another class of another file of same package - error as object creation gives error.
		objM_nested_pvt.mul4nestedpvt();//accessing private method of nested class of another class of another file of same package - error as object creation gives error.
		*/
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Accessing another package members:");
		System.out.println();
		
		
		
		
		//Accessing another package members
			
		Calc_Main1 o1 = new Calc_Main1();//accessing methods of another main class of another file of another package(public class),for this to be successful we need to import that particular main class from another package - no error
		o1.f11();//accessing public method - no error
		//o1.f21();//accessing default method - error
		//o1.f31();//accessing private method - error
		System.out.println();
		
		/*
		subMain1 obj1 = new subMain1(); //accessing methods of another class of another file of another package(default class),for this to be successful we need to import that particular sub main class from another package - error
		obj1.func1();//accessing public method - error
		obj1.func2();//accessing default method - error
		obj1.func3();//accessing private method - error
		*/
		
		Public_Add1 objA1 = new Public_Add1(); //accessing methods of another class of another file of another package(public class),for this to be successful we need to import that particular add1 class from another package - no error
		objA1.add2num();//accessing public method - no error
		//objA1.add3num();//accessing default method - error
		//objA1.add4num();//accessing private method - error
		System.out.println();
		
		/*
		Default_Subtract1 objS1 = new Default_Subtract1();  //accessing methods of another class of another file of another package(default class),for this to be successful we need to import that particular subtract1 class from another package - error
		objS1.sub2num();//accessing public method - error
		objS1.sub3num();//accessing default method - error
		objS1.sub4num();//accessing private method - error
		*/
		
		Mul1 objM1 = new Mul1(); //accessing methods of another class of another file of another package(public class),for this to be successful we need to import that particular mul1 class from another package - no error
		objM1.mul2num();//accessing public method - no error
		//objM1.mul3num();//accessing default method - error
		//objM1.mul4num();//accessing default method - error
		System.out.println();
		
		/*
		//Accessing method of nested class in anotherclass of another file of another package(public class) - error
		//Calling Public nested class methods
		objM1.mul2nestedpub1();// - error
		objM1.mul3nestedpub1();// - error
		objM1.mul4nestedpub1();// - error

		// Calling Default nested class methods
		objM1.mul2nesteddef1();// - error
		objM1.mul3nesteddef1();// - error
		objM1.mul4nesteddef1();// - error

		// Calling Private nested class methods
		objM.mul2nestedpvt1();// - error
		objM.mul3nestedpvt1();// - error
		objM.mul4nestedpvt1();// - error
		 */
		nested_pub_Mul1 objM1_nested_pub = objM1.new nested_pub_Mul1(); // creating object for nested class of another class of another file of another package(public class),for this to be successful we need to import that particular nested class from another package - no error

		objM1_nested_pub.mul2nestedpub1();// accessing public method of nested class of another class of another file of another package - no error
		//objM1_nested_pub.mul3nestedpub1();// accessing default method of nested class of another class of another file of another package - error
		//objM1_nested_pub.mul4nestedpub1();// accessing private method of nested class of another class of another file of another package - error
		System.out.println();
		
		/*
		nested_default_Mul1 objM1_nested_def = new nested_default_Mul1(); // creating object for nested class of another class of another file of another package(default class) - error

		objM1_nested_def.mul2nesteddef1();// accessing public method of nested class of another class of another file of another package - error as object creation gives error.
		objM1_nested_def.mul3nesteddef1();// accessing default method of nested class of another class of another file of another package - error as object creation gives error.
		objM1_nested_def.mul4nesteddef1();// accessing private method of nested class of another class of another file of another package - error as object creation gives error.

		nested_pvt_Mul1 objM1_nested_pvt = new nested_pvt_Mul1(); // creating object for nested class of another class of another file of same package(private class) - error

		objM1_nested_pvt.mul2nestedpvt1();// accessing public method of nested class of another class of another file of another package - error as object creation gives error.
		objM1_nested_pvt.mul3nestedpvt1();// accessing default method of nested class of another class of another file of another package - error as object creation gives error.
		objM1_nested_pvt.mul4nestedpvt1();// accessing private method of nested class of another class of another file of another package - error as object creation gives error.
		*/
	
	}
	
	
	
	public void f1(){
		
		System.out.println("This is public method of Calc_Main class");
		
	}
	
	void f2(){
		
		System.out.println("This is default method of Calc_Main class");
		
	}
	
	private void f3(){
		
		System.out.println("This is private method of Calc_Main class");
		
	}
	
}

class subMain {
		
	public void func1(){
		
		System.out.println("This is public method of subMain class");
		
	}
	
	void func2(){
		
		System.out.println("This is default method of subMain class");
		
	}
	
	private void func3(){
		
		System.out.println("This is private method of subMain class");
		
	
	}
	
	
	
	
}

