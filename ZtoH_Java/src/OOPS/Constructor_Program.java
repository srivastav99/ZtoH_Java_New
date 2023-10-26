package OOPS;


public class Constructor_Program {
	
	double pi=3.14;
	public static void main(String[] args) {
		
		SubClass1 obj = new SubClass1();
		obj.method1();
		
	}
	 
	  
	Constructor_Program(double d) {
		pi=d;
	}
	
	
	 Constructor_Program() {
		System.out.println("default constructor");
		pi=3.14159;
		
	}
	
	 // we cannot create a static constructor(only public, protected, private is allowed) or a duplicate constructor
	 /*
	 static Constructor_Program() {
		System.out.println("default constructor");
		pi=3.14159;
			
	}
	*/
	 
	 void Area() {
		int r=10;
		double res=pi*r*r;
		System.out.println(res);
	}

}


class SubClass1 {
	
	void method1(){
		//Below lines automatically calls default constructor of Constructor_Program class.
		
		Constructor_Program o = new Constructor_Program(); // If we comment out the Constructor_Program() method in main class this line will give error. For creating a object we need a default constructor in class whose object is to be created, normally by default it will be created when we define class but in this case since we have overloaded the required constructor, default constructor also has to be created manually.
		 
		o.Area();//calls only the method and not the constructor.
		
		
		Constructor_Program o1 = new Constructor_Program(3.1415); //this line creates object o1 and then goes to overloaded constructor and assigns pi value 3.1415
		o1.Area();
		
		Constructor_Program o2 = new Constructor_Program(3.141592); //this line creates object o2 and then goes to overloaded constructor and assigns pi value 3.141592
		o2.Area();
		
		Constructor_Program o3 = new Constructor_Program(3.14159265); //this line creates object o3 and then goes to overloaded constructor and assigns pi value 3.14159265
		o3.Area();
		
	}
}