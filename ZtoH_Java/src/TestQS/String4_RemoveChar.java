package TestQS;
//remove characters from the first String which are present in the second String irrespective of case(upper case, lower case).
//if the first String "India is great" and the second String is "in" then the output should be "da s great"

public class String4_RemoveChar {

	public static void main(String[] args) {
		
		String s1 = "India is great";
		
		String s2 = "in";
		
		String res = s1.toLowerCase();
		
		char[] s2c = s2.toCharArray();
		
		for(int i=0;i<s2c.length;i++) {
			
			res = res.replaceAll(String.valueOf(s2c[i]) , "");
				
		}
		
		System.out.println(res);
	}

}
 