package OOPS;

public class Constructor_practice {

	public static void main(String[] args) {
		
		B o= new B();
		
		o.Area();
	}

}
class B{
	double pi=3.14;
	B(){
		 pi=3.1415;
	}
	void Area() {
		int r=10;
		double a=pi*r*r;
		System.out.println("Area of circle:"+a);
	}
}
