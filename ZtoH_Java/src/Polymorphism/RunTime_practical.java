package Polymorphism;

public class RunTime_practical {
	
	public static void main(String[] args) {
		//Y yo=new Y();
	  P	a1=new Y();//Creating object of parent class and assigning child class reference to it.
	  a1.add();//500-no error(trying to access parent class method using parent object storing child reference)
	  a1.addnum();
	// a1.add1();//gives compile time error(trying to access child class method using parent object storing child reference)
	 Y yo=new Y(); //creating object for child class.  
	 yo.add();
	// yo.add1();
	 
	 
	// Y f=new P();//gives compile time error
	// Y f=(Y)new P(); //gives run-time error
	}

}
class P{
	public void add() {
		int a=20,b=30; 
		int r=a+b;
		System.out.println(r);
	}
	
	public void addnum() {
		int a=10,b=20;
		int r=a+b;
		System.out.println(r);
	}
}


class Y extends P{
	public void add1() {
		int a=200,b=300;
		int r=a+b;
		System.out.println(r);
	}
	
	public void addnum() {
		int a=1,b=2;
		int r=a+b;
		System.out.println(r);
	}

}
