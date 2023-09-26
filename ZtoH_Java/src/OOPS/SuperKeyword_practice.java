package OOPS;


class Sub{
	int a=10;
	static int b=15;
	void method1() {
		int c=20;
		System.out.println("normal method");
	}
	static void method3() {
		int d=30;
		 System.out.println("static method");
	}
}
        
public class SuperKeyword_practice extends Sub {

	int a=1;
	int b=2;
	public static void main(String[] args) {
		
		SuperKeyword_practice o = new SuperKeyword_practice();
		o.method2();
		
	}
	
	void method2(){
		int a=60;
		int b=100;
		System.out.println(super.a);//calling a immediate parent variable.
		System.out.println(super.b);//calling a immediate parent static variable.No error as non-static method accessing static is possible.
		//super.a;//Gives error(Syntax error, insert "AssignmentOperator Expression" to complete Expression) 
	
		super.method1();//calling a immediate parent method.
		super.method3();//calling a immediate parent static method.No error as non-static method accessing static is possible.
		//super.c;//Gives error as c is local variable not class variable and local variables cannot be accessed through obj reference
		 
	}

}
