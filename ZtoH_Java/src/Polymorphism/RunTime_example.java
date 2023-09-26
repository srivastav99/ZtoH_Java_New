package Polymorphism;


public class RunTime_example {

	public static void main(String[] args) {
		
		B o = new B();
		//o.a=10;
		//o.b=20;
		
		o.add(100,200);
		
		
	}
}

class A{
	int a,b;
	void add(int a,int b) {
		a=10;b=20;
		int res=a+b;
		System.out.println("Parent class method result:"+res);

	}
}
class B extends A{
	void add(int a,int b) {
	
		int res=a+b;
		System.out.println("Child class method result:"+res);
			
	}	
}


	
