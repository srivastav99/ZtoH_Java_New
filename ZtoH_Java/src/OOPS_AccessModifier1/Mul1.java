package OOPS_AccessModifier1;



public class Mul1{
	
	public static void main(String[] args) {
		
		
		Mul1 objm=new Mul1();
		objm.mul4num();
		
	}
	
	
	public void mul2num(){
		int a=2,b=3;
		int mul=a*b;
		System.out.println("Public class, public method(mul2num) of another class another file of another package result:"+mul);
		
	}
	
	void mul3num(){
		int a=2,b=3,c=4;
		int mul=a*b*c;
		System.out.println("Public class, default method(mul3num) of another class another file of another package result:"+mul);
		
	}
	
	private void mul4num(){
		int a=2,b=3,c=4,d=5;
		int mul=a*b*c*d;
		System.out.println("Public class, private method(mul4num) of another class another file of another package result:"+mul);
		
	}
	
	
	
	
	
	public class nested_pub_Mul1{
		
		public void mul2nestedpub1(){
			int a=2,b=3;
			int mul=a*b;
			System.out.println("Public nested class, public method(mul2nestedpub1) of another class another file of another package result:"+mul);
			
		}
		
		void mul3nestedpub1(){
			int a=2,b=3,c=4;
			int mul=a*b*c;
			System.out.println("Public nested class, default method(mul3nestedpub1) of another class another file of another package result:"+mul);
			
		}
		
		private void mul4nestedpub1(){
			int a=2,b=3,c=4,d=5;
			int mul=a*b*c*d;
			System.out.println("Public nested class, private method(mul4nestedpub1) of another class another file of another package result:"+mul);
			
		}
	}
	
	class nested_default_Mul1{
		
		public void mul2nesteddef1(){
			int a=2,b=3;
			int mul=a*b;
			System.out.println("Default nested class, public method(mul2nesteddef1) of another class another file of another package result:"+mul);
			
		}
		
		void mul3nesteddef1(){
			int a=2,b=3,c=4;
			int mul=a*b*c;
			System.out.println("Default nested class, default method(mul3nesteddef1) of another class another file of another package result:"+mul);
			
		}
		
		private void mul4nesteddef1(){
			int a=2,b=3,c=4,d=5;
			int mul=a*b*c*d;
			System.out.println("Default nested class, private method(mul4nesteddef1) of another class another file of another package result:"+mul);
			
		}
		
	}
	private class nested_pvt_Mul1{
		
		public void mul2nestedpvt1(){
			int a=2,b=3;
			int mul=a*b;
			System.out.println("Private nested class, public method(mul2nestedpvt1) of another class another file of another package result:"+mul);
			
		}
		
		void mul3nestedpvt1(){
			int a=2,b=3,c=4;
			int mul=a*b*c;
			System.out.println("Private nested class, default method(mul3nestedpvt1) of another class another file of another package result:"+mul);
			
		}
		
		private void mul4nestedpvt1(){
			int a=2,b=3,c=4,d=5;
			int mul=a*b*c*d;
			System.out.println("Private nested class, private method(mul4nestedpvt1) of another class another file of another package result:"+mul);
			
		}
	}
	
	
	
	
}




	




