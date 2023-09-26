package Basic;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//With StringBuilder function
		
		String s= "Srivastav";
		
		StringBuilder rev = new StringBuilder(s);
		rev.reverse();
		System.out.println(rev);
		
		//Without stringBuilder function
		/*
		String s= "Srivastav",rev="";
		int len = s.length();
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		*/
	}

}
