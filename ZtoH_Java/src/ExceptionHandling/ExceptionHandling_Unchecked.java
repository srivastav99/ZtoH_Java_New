package ExceptionHandling;



public class ExceptionHandling_Unchecked { //In this code we can comment out throws still the code works since unchecked exceptions are thrown automatically
	
		public static void main(String[] args) {
			
			I o = new I();
			try {
				o.method1();
			}
			catch (IndexOutOfBoundsException e) {
				
				System.out.println("Cannot divide by 0");
			}
		
			
			catch (Exception e) {
				
				System.out.println(e.getMessage());
			}
			
		
		}	

}

class I {
	void method1() throws Exception  {
		
		int a=10, b=0,c=0;
		
		try {
			c=a/b;
		} 
		catch(IndexOutOfBoundsException e) {
			
			System.out.println("method 1 catch block");
		}
		System.out.println("method 1 end");
		
	}
}

