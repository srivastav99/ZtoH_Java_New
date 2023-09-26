package OOPS_Static;

public class StaticbtwClasses {
	static int b=20;
	//static int a=50;
	public static void main(String[] args) {
		
		System.out.println(Class2.a);
		

	}
	
	static void method1() {
		System.out.println("Static method1");
		
	}
	void nonstatmethod1() {
		//method1(); //cannot access directly
		Class2.method2();
		//nonstatmethod2(); //cannot access directly
		//Class2.nonstatmethod2(); //Cannot access non-static method of another class using class name. 
	}

}

class Class2{
	
	static int a=10;
	int c=20;
	
	static void method2() {
		
		//method1(); //cannot access directly
		StaticbtwClasses.method1();
	}
	
	void nonstatmethod2() {
		
		//method1(); //cannot access directly
		StaticbtwClasses.method1();
		//StaticbtwClasses.nonstatmethod1(); //Cannot access non-static method of another class using class name.
		
	}
}
