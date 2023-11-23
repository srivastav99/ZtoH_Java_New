package Two_D_Array;

public class LargestandSmallestWord {

	public static void main(String[] args) {
		
		String s= "It is a string with QualiTlabs and you in a sentence.";
		
		char[] c = s.toCharArray();
		
		int wordCount = 0, smallest =9999999, largest=0;
		String largeString="";
		String smallString="";
	
		for(int i=0;i<c.length;i++) {
			
			if(c[i]!=' ') {
				wordCount++;
			}
			else {
				
				if(wordCount>largest) {
					largest=wordCount;
					largeString ="";
					for(int j=i-1;c[j]!=' ' && j!=0;j--) {
						largeString = largeString+c[j];
					}
					
				}
				if(wordCount<smallest) {
					smallest=wordCount;
					smallString ="";
					for(int j=i-1;c[j]!=' '&& j!=0;j--) {
						smallString = smallString+c[j];
					}
					
				}
				wordCount=0;
			}
			
		}
		
		char []small = smallString.toCharArray();
		char []large = largeString.toCharArray();
		
		System.out.print("The largest word is '");
		for(int i=large.length-1;i>=0;i--) {
			
			System.out.print(large[i]);
		}
		
		System.out.print("' and the smallest word is '");
		for(int i=small.length-1;i>=0;i--) {
			
			System.out.print(small[i]);
		}
		
		System.out.println("' in the string");
	}

}
