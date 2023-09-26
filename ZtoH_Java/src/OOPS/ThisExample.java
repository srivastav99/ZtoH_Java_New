package OOPS;

public class ThisExample {

	public static void main(String[] args) {
		
		A o = new A();
		o.a=10;
		o.b=20;
		o.add(100,200);
		
	}

}

class A{
	int a,b;
	public void add(int a,int b) {
		
		int res=a+b; //accessing local variable
		System.out.println("Result when not using 'this':"+res); 
		int res1=this.a+this.b; //accessing global or class variables
		
		System.out.println("Result when using 'this':"+res1);
	}
	
}


