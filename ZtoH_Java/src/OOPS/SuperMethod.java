package OOPS;

class  Area {
	//Default constructor
	Area() {
		
		System.out.println("Parent class constructor.");
	}
	//Overloaded constructor
	Area(int a){
		System.out.println("Parent class constructor with arguments.");
	}
	void method() {
		System.out.println("Normal method.");
		
		//Area();//Gives error as we cannot call a constructor of same class or another class(in this case same class) without using super().
		method2();
	}
	void method2() {
		System.out.println("This is a normal method 2.");
	}
		
}
class SubClass3 extends Area{
	//Normal method
	void method1() {
		
		//super(); //gives error - Constructor call must be the first statement in a constructor and this is not a constructor just a method
		//Area();//gives error - Constructor call must be the first statement in a constructor
		//super();//gives error - Constructor call must be the first statement in a constructor
		System.out.println("Normal method");
	}
	
	//constructor(default)
	public SubClass3() {
		// System.out.println("Child class constructor before super call");//super must be first line so this line has to be commented out.
		super(23); // Calls constructor of immediate parent class with arguments(overloaded constructor of parent class).If we comment out this line then default constructor of parent is called by default.
		//Area(); // Gives error as we cannot directly call a  constructor(in this case default constructor) of another class or same class(in this case another class) without using super().
		//Area(23);// Gives error as we cannot directly call a constructor(in this case overloaded constructor) of another class or same class(in this case another class) without using super().
		method();
		System.out.println("Child class constructor after super call");
	}
}

public class SuperMethod {

	public static void main(String[] args) {
		
		SubClass3 obj = new SubClass3();
		obj.method1();

	}
	
}

