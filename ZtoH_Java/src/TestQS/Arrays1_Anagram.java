package TestQS;
//Write a program to check if two strings are anagrams using arrays(anagram means letters of a word when re-arranged forms another word).
//eg.silent and listen, heart and earth
//Check if two arrays are equal or not also same code can be used.
public class Arrays1_Anagram {

	public static void main(String[] args) {
		
		String s1 = "silent";
		String s2 = "listen";
		
		boolean flag=true;
		//comparing length of two strings
		if(s1.length()!=s2.length()) {
			System.out.println("Since the length of both the stings are not equal, they can not be anagrams.");
		}
		else {
			char[] cs1 = s1.toCharArray();
			char[] cs2 = s2.toCharArray();
			for(int i=0;i<cs1.length;i++) {
				for (int j = 0; j < cs2.length; j++) {
					if(cs1[i]==cs2[j]) {
						cs1[i]=' ';
						cs2[j]=' ';
						break;
					}
					
				}
				
			}
			
			for(int i=0;i<cs1.length;i++) {	
				if(cs1[i]==cs2[i]) {
					flag = true;
					
				}
				else {
					flag=false;
					break;
					
				}
			}
			if(flag==true) {
				System.out.println("The two strings are anagrams.");
			}
			else {
				System.out.println("The two strings are not anagrams.");
			}
				
		}
		

	}

}
