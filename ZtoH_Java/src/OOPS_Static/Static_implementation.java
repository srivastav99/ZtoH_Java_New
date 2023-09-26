package OOPS_Static;

public class Static_implementation {
	static int a=10;
	int b=20;
	public static void main(String[] args) {
		
		Static_implementation o = new Static_implementation();
		//static_method1(); //no need object as static can access static method
		o.static_method1();
		//static_method2(); //no need object as static can access static method
		o.static_method2(); 
		
		o.nonstatic_method1();
		o.nonstatic_method2();
		
	}
	
	static void static_method1() {
		System.out.println(a);//static method accessing static variable
		static_method2();//static method accessing static method
	}
	static void static_method2() {
		//System.out.println(b);//gives error as static method cannot access non-static variable
		//nonstatic_method1();////gives error as static method cannot access non-static method
	}
	void nonstatic_method1() {
		
		System.out.println(a);//non-static method accessing static variable.
	 	static_method1();//non-static method accessing static method.
		int c=10;
	}
	void nonstatic_method2() {
		System.out.println(b);//here non-static method is able to access non-static variable because it is defined globally.
		//System.out.println(c);//gives error as non-static method cannot access non-static variable as they are local to method in which they are defined
		nonstatic_method1();//here non-static method is able to call non-static method as both methods belong to same class,it is basically function call with no argument and no return type.
	}
	

}
