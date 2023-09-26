package OPPS_AccessModifier;

public class Public_Add {

	public void add2num(){
		int a=2,b=3;
		int sum=a+b;
		System.out.println("Public class, Public method(add2num) of another class another file of same package result:"+sum);
		
	}
	
	void add3num(){
		int a=2,b=3,c=4;
		int sum=a+b+c;
		System.out.println("Public class, Default method(add3num) of another class another file of same package result:"+sum);
		
	}
	
	private void add4num(){
		int a=2,b=3,c=4,d=5;
		int sum=a+b+c+d;
		System.out.println("Public class, private method(add4num) of another class another file of same package result:"+sum);
		
	}

}
