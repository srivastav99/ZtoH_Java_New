package Interface;


interface A{
	
	int a=10;
	
	void method1();
	void method2();
	void method3();
	
	//void method4();
	
	default void m1() { //
		System.out.println("default interface m1");
		m2();
		
	}
	static void m2() {
		System.out.println("static interface m2");
	}
	
	public default void m3() { //
		System.out.println("sdwefserf");
		m2();
		
	}
	
	public static void m4() {
		System.out.println("sdw");
	}
		
	
}

public class Interface_Practice implements A {

	public static void main(String[] args) {
		
		Interface_Practice o = new Interface_Practice();
		o.method1();
		//m2();//gives error, we cannot access static method of interface from class
		//A.a=20;//gives error, we cannot access static method of interface from class
		//o.m2();//gives error, we cannot access static method of interface from class
	
	}
	
	public void method1() {
		
		System.out.println("Method 1");
		 m1();
		//m2();//gives error, we cannot access static method of interface from class
	}
	
	public void method2() {
		System.out.println("Method 2");
		
	}
	
	public void method3() {
		System.out.println("Method 3");
	}
	
	public void method5() {
		System.out.println("Method 5");
	}

}

class SubClass implements A{

	
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	public void method6() {
		System.out.println("Method 6");
	}
	
	
}
