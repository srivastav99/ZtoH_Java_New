package TestQS;

public class ArrayQ5_ReverseString {

	public static void main(String[] args) {
		
		String s = "Hi Hello Hi";
		String s1 = "";
		char []c = s.toCharArray();
		
		for(int i=c.length-1;i>=0;i--) {
			
			 s1=s1+c[i];
		}
		
		System.out.println(s1);

	}

}
