package Interface;

interface I1{
	
	void method1();
}

interface I2 {
	
	void method2();
}
interface I3 extends I1,I2{
	
	void method3();
}


class SubClass1 implements I1{
	public void method1(){
		System.out.println("SubClass1 method1");
	}
}

class SubClass2 implements I2{
	public void method2(){
		System.out.println("SubClass2 method2");
	}
}

class SubClass3 implements I3{
	public void method1(){
		System.out.println("SubClass3 method1");
	}
	public void method2(){
		System.out.println("SubClass3 method2");
	}
	public void method3(){
		System.out.println("SubClass3 method2");
	}
} 

public class MultipleInheritance  {

	public static void main(String[] args) {
		
		I1 o1= new SubClass1(); 
		
		I2 o2= new SubClass2();
		
		I3 o3= new SubClass3();
		
		o1.method1();
		
		o2.method2();
		
		o3.method1();
		o3.method2();
		o3.method3();  

	}

}
