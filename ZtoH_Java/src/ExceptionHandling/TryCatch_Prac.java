package ExceptionHandling;

public class TryCatch_Prac {

	public static void main(String[] args) {
		
		int a=10,b=0;
		System.out.println("main start");
		try { //try can be executed without catch but it will require finally block. Without catch the code will stop in between when it comes across an exception
			System.out.println("try block before");
			int c=a/b;
			System.out.println("try block after");
		}
		
		finally {
			System.out.println("zero division");
		}
		System.out.println("main end");
		
		

	}

}
