package TestQS;

public class ArrayQ6_LowertoUpper {

	public static void main(String[] args) {
		
		String s = "abcd";
		String str = "";
		
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>=97 && c[i]<=122)
				str = str+(char)(c[i]-32);
		}
		System.out.println(str);
		
		char c1[]=s.toCharArray();
		String str1=s.toUpperCase();
		
		System.out.println(str1);

	}

}
