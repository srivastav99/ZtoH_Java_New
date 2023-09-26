package Polymorphism;

public class Calculator {

	void add(int a,int b) {
		int add=a+b;
		System.out.println(add);
		
	
	}
	void add(double a,double b) {
		double add=a+b;
		System.out.println(add);
		
	
	}
	
	
	void add(int a,int b,int c) {
		int add=a+b+c;
		System.out.println(add);
	}
	
	void add(double a,double b,double c) {
		double add=a+b+c;
		System.out.println(add);
	}
	
	void add(int a,int b,int c,int d) {
		int add=a+b+c+d;
		System.out.println(add);
	}
	void add(double a,double b,double c,double d) {
		double add=a+b+c+d;
		System.out.println(add);
	}
	void add(int a, double b) {
		double add = a+b;
		System.out.println(add);
	}
	
	
	
	void subtract(int a,int b) {
		int sub=a-b;
		System.out.println(sub);
	
	}
	void subtract(double a,double b) {
		double sub=a-b;
		System.out.println(sub);
	
	}
	
	void subtract(int a,int b,int c) {
		int sub=a-b-c;
		System.out.println(sub);
	}
	void subtract(double a,double b,double c) {
		double sub=a-b-c;
		System.out.println(sub);
	}
	
	void subtract(int a,int b,int c,int d) {
		int sub=a-b-c-d;
		System.out.println(sub);
	}
	void subtract(double a,double b,double c,double d) {
		double sub=a-b-c-d;
		System.out.println(sub);
	}

	
	
	void multiply(int a,int b) {
		int mul=a*b;
		System.out.println(mul);
	
	}
	void multiply(double a,double b) {
		double mul=a*b;
		System.out.println(mul);
	
	}
	
	void multiply(int a,int b,int c) {
		int mul=a*b*c;
		System.out.println(mul);
	}
	void multiply(double a,double b,double c) {
		double mul=a*b*c;
		System.out.println(mul);
	}
	
	void multiply(int a,int b,int c,int d) {
		int mul=a*b*c*d;
		System.out.println(mul);
	}
	void multiply(double a,double b,double c,double d) {
		double mul=a*b*c*d;
		System.out.println(mul);
	}
	
	
	
	void divide(int a,int b) {
		int div=a/b;
		System.out.println(div);
	
	}
	void divide(double a,double b) {
		double div=a/b;
		System.out.println(div);
	
	}
	
	void divide(int a,int b,int c) {
		int div=a/b/c;
		System.out.println(div);
	}
	void divide(double a,double b,double c) {
		double div=a/b/c;
		System.out.println(div);
	}
	
	void divide(int a,int b,int c,int d) {
		int div=a/b/c/d;
		System.out.println(div);
	}
	void divide(double a,double b,double c,double d) {
		double div=a/b/c/d;
		System.out.println(div);
	}
	
	
	
	void modulus(int a,int b) {
		int mod=a%b;
		System.out.println(mod);
	
	}
	void modulus(double a,double b) {
		double mod=a%b;
		System.out.println(mod);
	
	}
	
	void modulus(int a,int b,int c) {
		int mod=a%b%c;
		System.out.println(mod);
	}
	void modulus(double a,double b,double c) {
		double mod=a%b%c;
		System.out.println(mod);
	}
	
	void modelus(int a,int b,int c,int d) {
		int mod=a%b%c%d;
		System.out.println(mod);
	}
	void modelus(double a,double b,double c,double d) {
		double mod=a%b%c%d;
		System.out.println(mod);
	}
	
	
	
	public static void main(String[] args) {
		
		 
		Calculator cal=new Calculator();
		
		cal.add(2, 3);
		cal.add(2, 3, 4);
		cal.add(2, 3, 4, 5);
		cal.add(2, 3.5);
		cal.add(2, 3.5, 4);
		cal.add(2, 3, 4.5, 5);
		cal.add(3, 3.5);
		
		System.out.println();
		
		cal.subtract(10, 2);
		cal.subtract(10, 3, 2);
		cal.subtract(10, 2, 3, 4);
		cal.subtract(10, 2.5);
		cal.subtract(10, 3.5, 2);
		cal.subtract(10, 2, 3, 4.5);
		System.out.println();
		
		cal.multiply(2, 3);
		cal.multiply(2, 3, 4);
		cal.multiply(2, 3, 4, 5);
		cal.multiply(2.5, 3);
		cal.multiply(2, 3.5, 4);
		cal.multiply(2, 3, 4.5, 5);
		System.out.println();
		
		cal.divide(10, 2);
		cal.divide(10, 2, 2);
		cal.divide(10, 2, 2, 2);
		cal.divide(10, 2.5);
		cal.divide(10, 2, 2.5);
		cal.divide(10, 2, 2, 2.5);
		System.out.println();
		
		cal.modulus(10, 2);
		cal.modulus(10, 2, 2);
		cal.modelus(10, 2, 2, 2);
		cal.modulus(10, 2);
		cal.modulus(10, 2, 2);
		cal.modelus(10, 2, 2, 2);
		System.out.println();
		 
		
		
	}

}
