package OOPS;


public class ConstructorEx {

	static double pi = 3.14;
	public static void main(String[] args) {
		
		SubClass2 obj = new SubClass2();
		obj.method1();

	}
	
	ConstructorEx(double d) { //overloaded constructor or constructor with arguments
		pi = d;
	}
	 
	ConstructorEx() { //default constructor

	}
	 
	void Area(int x) {
		int r = x;
		double res = pi * r * r;
		System.out.println(res);
	}

}

class SubClass2 {
		
	 void method1(){
		
		ConstructorEx o = new ConstructorEx();
		o.Area(10);
		
		ConstructorEx o1 = new ConstructorEx(3.1415);//Here in this case we are setting precision of pi value based on radius value by using constructor and in this way we can save set the value as per requirement using constructor code.
		o1.Area(100);
		 
		ConstructorEx o2 = new ConstructorEx(3.141592);
		o2.Area(1000);
		
		ConstructorEx o3 = new ConstructorEx(3.14159265);
		o3.Area(10000);
		
	}
}
