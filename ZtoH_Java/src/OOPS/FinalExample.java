package OOPS;

//Note:final is the only modifier that can be used inside method.
public class FinalExample { //final is used to lock values of variables which are not supposed to be changed. 

	public static void main(String[] args) {
		
		final int a=1;
		//a=5; // gives error as it is given final keyword and thus the value cannot be changes
		final int b;
		b=10;
		
		
		Child1 o = new Child1();
		o.m1();
		o.m2();
		
		 
		System.out.println(b);
	}	
}  

class Parent{
	
	void m1() {
		System.out.println("Parent method 1");
	}
	final void m2() {
		System.out.println("Parent method 2");
	}
}

class Child1 extends Parent{
	
	void m1() {
		System.out.println("Child method 1");
	}
	/*
	void m2() { // gives error as in parent class the method has been already given final and thus cannot be overridden
		System.out.println("Child method 2");
	}
	*/
}

final class Non_Herit_P{
	
	void print(){
		System.out.println("Method of Non-heritable class.");
	}
}
/*
class Child12 extends Non_Herit_P{ // gives error as the parent class in given final and thus making it non-heritable.
	
	void print(){
		System.out.println("Method of Non-heritable child class.");
	}
}
*/



