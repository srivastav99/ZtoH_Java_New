package OOPS_AccessModifier1;


public class Calc_Main1 {

	public static void main(String[] args) {
		
	
		Calc_Main1 o = new Calc_Main1(); //accessing methods of same class of same file of same project
		o.f11();//accessing public method - no error
		o.f21();//accessing default method - no error
		o.f31();//accessing private method - no error
		
		subMain1 obj = new subMain1(); //accessing methods of another class of same file of same project
		obj.func11();//accessing public method - no error
		obj.func21();//accessing default method - no error
		//obj.func31();//accessing private method - error
		
		Public_Add1 objA = new Public_Add1(); //accessing methods of another class of another file of same project
		objA.add2num();//accessing public method - no error
		objA.add3num();//accessing default method - no error
		//objA.add4num();//accessing private method - error
		
		Default_Subtract1 objS = new Default_Subtract1();  //accessing methods of another class of another file of same project
		objS.sub2num();//accessing public method - no error
		objS.sub3num();//accessing default method - no error
		//objS.sub4num();//accessing private method - error
		
		Mul1 objM = new Mul1();  //accessing methods of another class of another file of same project
		objM.mul2num();//accessing public method - no error
		objM.mul3num();//accessing default method - no error
		//objM.mul4num();//accessing default method - error
			
		
		
		
		
	}
	public void f11(){
		
		System.out.println("This is public method of Calc_Main1 class");
		
	}
	
	void f21(){
		
		System.out.println("This is default method of Calc_Main1 class");
		
	}
	
	private void f31(){
		
		System.out.println("This is private method of Calc_Main1 class");
		
	}
	
}

class subMain1{
		
	public void func11(){
		
		System.out.println("This is public method of subMain1 class");
		
	}
	
	void func21(){
		
		System.out.println("This is default method of subMain1 class");
		
	}
	
	private void func31(){
		
		System.out.println("This is private method of subMain1 class");
		
	}
	
}

