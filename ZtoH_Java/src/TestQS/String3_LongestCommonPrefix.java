package TestQS;


//Given a set of strings, find the longest common prefix.
public class String3_LongestCommonPrefix {

	public static void main(String[] args) {

		String[] s = { "apple", "ape", "april" };
		int length = 0, maxLength = 0, strmax=0;
		boolean flag=true;
		// finding the largest string in the array
		String sLarge = "";
		for (int i = 0; i < s.length - 1; i++) {

			String str = s[i];
			if (str.length() <= s[i + 1].length()) {
				sLarge = s[i+1];
			}

		}
		
		// converting largest string found to char array
		char[] cArraysLarge = sLarge.toCharArray();

		// logic to find largest prefix length
		for (int i = 0; i < s.length; i++) {
			if (!(s[i].equals(sLarge))) {
				flag=false;
				length = 0;
				char[] csArray = s[i].toCharArray();
				for (int j = 0; j < cArraysLarge.length; j++) {
					if (j <= csArray.length - 1 && cArraysLarge[j] == csArray[j]) {
						length++;

					} else {
						strmax = j;
						break;
					}

				}
				if (length > maxLength && strmax!=s[i].length()) {
					maxLength = length;
				}
				if(strmax == s[i].length() || length == s[i].length()) {
					maxLength = length;
					break;
				}
			}
			
			
		}

		// printing the largest prefix
		System.out.println("Largest common prefix found:");
		if(flag==false) {
			for (int i = 0; i < maxLength; i++) {
				System.out.print(cArraysLarge[i]);
			}
		}
		else {
			for(int i=0;i<cArraysLarge.length;i++) {
				System.out.print(cArraysLarge[i]);
			}
		}

	}

}
