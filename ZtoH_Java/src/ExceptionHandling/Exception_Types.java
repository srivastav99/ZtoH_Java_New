package ExceptionHandling;

public class Exception_Types {

	public static void main(String[] args) {
		
		//Arithmetic Exception
		try {
			int first_no = 0;
			int scnd_no = 20;
			int third_no = 0;
			int fourth_no = (first_no-scnd_no)/third_no;
			System.out.println ("output after the operation " + fourth_no );
			}
			catch(ArithmeticException arithmetic_ex) {
			System.out.println ("The third number cannot store the value of first number multiplied by second number.");
			}
		
		//ArrayIndexOutOfBoundsException
		try{
			int ar_0[] = new int[6];
			ar_0[8] = 11;
			}
			catch(ArrayIndexOutOfBoundsException excp){
			System.out.println ("Index of the array has crossed the range.");
			}
		
		//Null Pointer Exception
		try {
			String art_1 = null;
			String art_3= "abc";
			System.out.println(art_1.charAt(0));
			} catch(NullPointerException excpn) {
			System.out.println("This will give a null pointer exception.");
			}
		
		//StringIndexOutOfBoundsException
		try {
			String ant = "ant crawls very slowly.";
			char chrct = ant.charAt(50);
			System.out.println(chrct);
			}
			catch(StringIndexOutOfBoundsException excepn) {
			System.out.println("String_Out_Of_Bound_Exception occured.");
			}
		
		// NumberFormatException
		try {
			int value1 = Integer.parseInt ("parasite1") ;
			System.out.println(value1);
			} catch(NumberFormatException excepn) {
			System.out.println("This gives Number Format Exception");
			}
		
		

	}

}
