package OOPS_Static;

public class Accessibility {
	
	static int b=10;
	int d=25;
	public static void main(String[] args) {
		
		int a=5;
		b=10; //static variables can be accessed inside static method.
		//d=15; //non-static variables cannot be accessed in static methods even though they are global variables.
		//static int c=20; //We cannot declare static variables inside a method
		//e=10;;//Here 'e' is declared inside a static but that does not make it a static variable and thus cannot be accessed inside this static method as 'e' is a non-static variable.

	}
	
	void access() {
		b=15; //static variables can be accessed inside non-static method.
		//static int c=13;//We cannot declare static variables inside a method
		d=20; //non-static variables accessing global variable.
		//a=10;//Here 'a' is declared inside a static but that does not make it a static variable and thus cannot be accessed inside this non-static method as 'e' is a non-static variable.
		//e=15;;//Here 'e' is declared inside a static but that does not make it a static variable and thus cannot be accessed inside this non-static method as 'e' is a non-static variable.
	}
	static void static_access1() {
		b=12; //static variables can be accessed inside static method.
		//static c=14;//We cannot declare static variables inside a method
		//d=20; //non-static variables cannot be accessed in static methods even though they are global variables.
		int e=25;
	}

}
