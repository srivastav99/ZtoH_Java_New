package TestQS;

import java.util.HashSet;
import java.util.Set;
//code only works till 4 letters word
public class Permutation_Word {
	
	public static void main(String[] args) {
		
		String s = "ABCD";
		
		char[] c = s.toCharArray();
		
		Set<String> hs = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			
			String str = String.valueOf(c);
			hs.add(str);
			
			
			for(int j=0;j<c.length-1;j++) {
				
				for (int k = 0; k < c.length-1; k++) {
					char[] c1 = c;
					char temp = c1[k];
					c1[k] = c1[k+1];
					c1[k+1] = temp;
					
					str = String.valueOf(c);
					hs.add(str);
				}
				char temp = c[j];
				c[j] = c[j+1];
				c[j+1] = temp;
				
				str = String.valueOf(c);
				hs.add(str);
				
			}
			
			
		}
		System.out.println("Length of hashset:"+hs.size());
		System.out.println(hs);
		
		
		

	}

}
