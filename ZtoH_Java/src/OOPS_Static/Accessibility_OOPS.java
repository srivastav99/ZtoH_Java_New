package OOPS_Static;

public class Accessibility_OOPS {
	static int a=10;
	int b=20;
	int res=1;
	
	static void c() {
		int a=50;
		int b=10;
		int r1 = a+b;
		System.out.println("r1:"+r1);
		int r5 = Accessibility_OOPS.a+b;
		System.out.println("r5:"+r5);
		
		a=50;
		int r2 = a+b;
		System.out.println("r2:"+r2);
		
		Accessibility_OOPS.a=1000;
		int r3 = a+b;
		System.out.println("r3:"+r3);
		
		
	}
	
	
	void z() {
		System.out.println(b);
		b=10;//here b value which is stored in object is overridden
		System.out.println("b:"+b);
		res=a+b; //here res is stored in object
		System.out.println("res:"+res);
		int res=a+b; //here res is stored in stack
		System.out.println("res:"+res);
		int b=40; //this b is created in stack memory
		System.out.println("b:"+b);
	
		
	}
	
	public static void main(String[] args) {
		
		Accessibility_OOPS o = new Accessibility_OOPS();
		o.c();
		o.z();
		Accessibility_OOPS.c();
		c();
		//Accessibility_OOPS.z(); //cannot access as z is a non-static method and thus cannot be called using class reference.
		System.out.println(o.b); //here the b value in object is printed which is 10
		System.out.println(o.res);
	}

}

class accessing{
	
	//Accessibility_OOPS.a=10;//gives error(Syntax error on token "a", VariableDeclaratorId expected after this token)
	public void normal_m() {
		//b=10;//gives error as b is a non-static global variable of class Accessibility_OOPS and is accessible only in that class
		//Accessibility_OOPS.b=10;//Gives error as we cannot access non-static global variables of one class in another class
		Accessibility_OOPS.a=10;//Since a is static we can access it in this class even though it is defined in another class.
		
		
	}
	
	
}
