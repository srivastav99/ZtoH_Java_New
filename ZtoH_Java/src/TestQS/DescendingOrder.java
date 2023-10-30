package TestQS;


public class DescendingOrder {

	public static void main(String[] args) {
		
		//without using in-built methods
		
		String[] s = {"abc","bcd","cde","abcd","abe"};
		int maxLen = s[0].length();
		for (int i = 1; i < s.length; i++) {
			
			if (s[i].length()>s[0].length()) {
				maxLen = s[i].length();
			}
		}
		//System.out.println(maxLen);
		
		for(int k=0;k<maxLen;k++)
			for (int i = 0; i < s.length-1; i++) {
				
				char []c1 = s[i].toCharArray();
				
				for (int j = i+1; j < s.length; j++) {
					c1 = s[i].toCharArray();
					char []c2 = s[j].toCharArray();
					if(k<c2.length && k<c1.length)
					
					{
						if (c1[k]<c2[k] && k==0) { 
								String str = s[i];
								 s[i] = s[j];
								 s[j] = str;
							}
						
						if(k>0) {
							if(c1[k-1]==c2[k-1]) {
								if (c1[k]<c2[k]) { 
									String str = s[i];
									 s[i] = s[j];
									 s[j] = str;
								}
							}
						}
					
					}
					
				}
				
					
				
				
				
				}
			
			
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		
		
		//using in-built methods
		/*
		String[] s = {"abc","bcd","cde","abcd","abe"};
		
		for (int i = 0; i < s.length-1; i++) {
			for (int j = i+1; j < s.length; j++) {
				if ((s[i].compareTo(s[j])<0)) {
					
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
					
				}
			}
		}
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	*/
		
		
	}

}
