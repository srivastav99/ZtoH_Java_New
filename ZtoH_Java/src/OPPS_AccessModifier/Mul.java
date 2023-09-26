package OPPS_AccessModifier;

public class Mul{

	public static void main(String[] args) {
		
		
		Mul objm=new Mul();
		objm.mul4num();
		
	}
	
	public void mul2num(){
		int a=2,b=3;
		int mul=a*b;
		System.out.println("Public class, public method(mul2num) of another class another file of same package result:"+mul);
		
	}
	
	void mul3num(){
		int a=2,b=3,c=4;
		int mul=a*b*c;
		System.out.println("Public class, default method(mul3num) of another class another file of same package result:"+mul);
		
	}
	
	private void mul4num(){
		int a=2,b=3,c=4,d=5;
		int mul=a*b*c*d;
		System.out.println("Public class, private method(mul4num) of another class another file of same package result:"+mul);
		
	}
	
	
	
	
	
	public static class nested_pub_Mul{
		
		public void mul2nestedpub(){
			int a=2,b=3;
			int mul=a*b;
			System.out.println("Public nested class, public method(mul2nestedpub) of another class another file of same package result:"+mul);
			
		}
		
		void mul3nestedpub(){
			int a=2,b=3,c=4;
			int mul=a*b*c;
			System.out.println("Public nested class, default method(mul3nestedpub) of another class another file of same package result:"+mul);
			
		}
		
		private void mul4nestedpub(){
			int a=2,b=3,c=4,d=5;
			int mul=a*b*c*d;
			System.out.println("Public nested class, private method(mul4nestedpub) of another class another file of same package result:"+mul);
			
		}
	}
	
	class nested_default_Mul{
		
		public void mul2nesteddef(){
			int a=2,b=3;
			int mul=a*b;
			System.out.println("Default nested class, public method(mul2nesteddef) of another class another file of same package result:"+mul);
			
		}
		
		void mul3nesteddef(){
			int a=2,b=3,c=4;
			int mul=a*b*c;
			System.out.println("Default nested class, default method(mul3nesteddef) of another class another file of same package result:"+mul);
			
		}
		
		private void mul4nesteddef(){
			int a=2,b=3,c=4,d=5;
			int mul=a*b*c*d;
			System.out.println("Default nested class, private method(mul4nesteddef) of another class another file of same package result:"+mul);
			
		}
		
	}
	private class nested_pvt_Mul{
		
		public void mul2nestedpvt(){
			int a=2,b=3;
			int mul=a*b;
			System.out.println("Private nested class, public method(mul2nestedpvt) of another class another file of same package result:"+mul);
			
		}
		
		void mul3nestedpvt(){
			int a=2,b=3,c=4;
			int mul=a*b*c;
			System.out.println("Private nested class, default method(mul3nestedpvt) of another class another file of same package result:"+mul);
			
		}
		
		private void mul4nestedpvt(){
			int a=2,b=3,c=4,d=5;
			int mul=a*b*c*d;
			System.out.println("Private nested class, private method(mul4nestedpvt) of another class another file of same package result:"+mul);
			
		}
	}

	
	
	
}

	




