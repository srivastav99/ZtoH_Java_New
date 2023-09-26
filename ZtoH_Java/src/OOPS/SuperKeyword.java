package OOPS;

public class SuperKeyword {
	
	int a=10;
	public static void main(String[] args) {
		
		SubClass o = new SubClass();
		o.method1();

	}

}
class SubClass extends SuperKeyword{
	
	int a=25;
	
	void method1() {
		int a=50;
		System.out.println("Accessing a variable without super keyword:"+a);
		System.out.println("Accessing a variable with super keyword:"+super.a);
		System.out.println("Accessing a variable with this keyword:"+this.a);
	}
}
