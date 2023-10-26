package ExceptionHandling;

public class throw_practice {

	public static void main(String[] args) {
		
		throw_practice o = new throw_practice();
		o.method1();
		

	}

	void method1() {
		
		cc1 o2 = new cc1();
		try {
			o2.m1();
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

class cc1 {

	
	void m1 () throws Exception 
	{
		int a=10,b=0,res=0; 
		try
		{
		 res = a/b;
		}
		
		
		catch(NullPointerException ex )
		{
			
			System.out.println(ex.getMessage());
			
		}
		
		catch(Exception ex)
		{
			throw new Exception(ex.getMessage()); //here throw is used to just send back exception msg.
		

		}
	
		System.out.println("c1.m1() after exception===>"+res);
	}
	
	void m2()
	{
		System.out.println("c1.m2()");
	}
	
	
}

class cc2 extends cc1 {

	
	void m() {
		
		System.out.println("c2.m3");
	}

}