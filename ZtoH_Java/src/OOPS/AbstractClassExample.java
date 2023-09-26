package OOPS;


public class AbstractClassExample {

	public static void main(String[] args) {
		
		C3 o1 = new C3();
		o1.m();
		o1.m1();
		o1.m2();
		o1.m3();
		o1.m4();
		o1.m5();
		
		//C2 o2 = new C2;//gives error as we cannot make object for abstract class
		
		C2 o3 = new C3();//Using upcasting we can create an object if C3(child class) which can access C2(parent class) methods.;
		o3.m();
		o3.m1();
		o3.m2();//Actual upcasting, it should give error as m2 is child class method, but here we have already defined it in class C1 as abstract so it possible to access it.
		o3.m3();//Actual upcasting it should give error as m3 is  child class method, but here we have already defined it in class C2 as abstract so it possible to access it.
		//o3.m4();//Cannot access as when upcasting, object can be used only we access parent class methods and m4 in child class method
		o3.m5();
		
		C1 o4 = new C3();//Using upcasting we can create an object if C3(child class) which can access C1(parent class) methods.;
		//o4.m();//gives error as in upcasting you can access only parent class methods and m is present in C2,not C1
		o4.m1();
		o4.m2();//Actual upcasting it should give error as m2 is child class method, but here we have already defined it in class C1 as abstract so it possible to access it.
		//o4.m3();//gives error as in upcasting you can access only parent class methods and m3 is present in C2 as abstract
		//o3.m4();//Cannot access as when upcasting, object can be used only we access parent class methods and m4 in child class method
		//o4.m5();//gives error as in upcasting you can access only parent class methods and m is present in C2,not C1

	}

}

abstract class C1{
	
	void m1() { 
		
		System.out.println("Concrete method of abstract class");
	}
	
	abstract void m2();
	abstract void m6();
	
		
}

abstract class C2 extends C1{
	
	void m() {
		System.out.println("Just a concrete method m() in abstract class .");
	}
	void m5() {
		System.out.println("Just a concrete method m5() in abstract class .");
	}
	void m6() {
		System.out.println("implementation of abstract method m6 of C1 class inside abstract class.");
	}
	abstract void m3();
	
	
}

class C3 extends C2{
	
	void m2() {
		System.out.println("implementation of abstract method m2 of C1 class");
	}
	
	void m3() {
		System.out.println("implementation of abstract method m3 of C2 class");
	}
	void m4() {
		System.out.println("Concrete method of normal class");
	}
	
} 

