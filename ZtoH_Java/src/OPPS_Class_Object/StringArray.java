package OPPS_Class_Object;

import java.util.Scanner;

class SubS{
	
	public void characterCount() {
		
		String str = "vastav";

		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				count++;
			}
		}
		System.out.println("The number of characters in the given string is: "+count);

	}
	
	
	public void characterPosition() {
		
		String str ="vastav";
		int flag=0;
	
		char[] ch=str.toCharArray();
		
		char c = 's';
		
		System.out.println("The given character "+c+" is found at position:");
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==c) {
				flag=1;
				//System.out.println("The given character "+c+" is found at position:"+(i+1));
				System.out.print(i+1+" ");
			}
		}
		if(flag==0) {
			System.out.println("The given character is not found in the given sting");
		}
		System.out.println();

	}
	
	
	
	
	public void consonantCount() {
		
		String str = "vastav";
		int count=0;
	
		char[] ch=str.toCharArray();
		System.out.println("Consonants in the string:");
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>=64 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122) {
				if(ch[i]!='a'&& ch[i]!='e'&& ch[i]!='i'&& ch[i]!='o'&& ch[i]!='u') {
					System.out.print(ch[i]+" ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("Number of consonants in the given string:"+count);

	}
	
	
	
	
	public void findDuplicate() {
		
		String str = "vastav";
		char temp=' ';
		int flag=0;
		
		char[] ch=str.toCharArray();
		
		System.out.println("Duplicate letters in the given array:");
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		
		for(int i=0;i<ch.length;i++) {
			int  count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				     flag=1;
				}
			}
			if(count>1) {   //Here spaces are also considered for duplicate. if you want to discard spaces the use if(count>1 & ch[i]!=' ')
				System.out.print(ch[i]+" ");
			}
		}
		if(flag==0) {
			System.out.println("There are no duplicate letters.");
		}
		System.out.println();

	}
	
	
	
	
	public void subString() {
		
	
			String s1="ztoh hi india ites pvt ltd";
			String s2="ites";
			char c[]=s1.toCharArray();
			char c1[]=s2.toCharArray();
			int flag=0,k=0;
			
			for(int i=0;i<c.length;i++) {
				k=i;
				flag=0;
				for(int j=0;j<c1.length;j++) {
					
					
					if(c[k]==c1[j]) {
						flag++;
						k++;
					}
					else {
						break;
					}
				}
				if(flag==c1.length) {
					break;
				}
			}
			if(flag==c1.length) {
				System.out.println("Substring matching");
			}
			else {
				System.out.println("Substring not matching");
			}
	}
	
	
	
	public void linesCount() {
		
		String str = "udiuwen\n dbjwhbdhewbdubwe\nyqxqeyxgy\ngdywe ye\neuejbeuw";
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\n' || i==ch.length-1) {
				count++;
			}
		}
		System.out.println("The number of lines in the given string is: "+count);


	}
	
	
	
	
	public void maxMin() {
		
		String str1 = "vastava";
		int count =0;
		char temp=' ' ;

		char[] ch=str1.toCharArray();
		int min=ch.length, max=-1;
		//bubblesort - ascending order
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		//to get max and min count values
		for(int i=0;i<ch.length;i++) {
			 count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				    
				}
			}
			if(count>max) {
				max=count;
				
				
			}
			if(count<min) {
				min=count;
				
				
			}
			
		}
		
		
		//Maximum repeating element
		System.out.println("Maximum repeating element:");
		for(int i=0;i<ch.length;i++) {
			 count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				    
				}
			}
			if(count==max) {
				System.out.print(ch[i]+" ");
				//System.out.println(ch[i]+" is repeating "+count+" times.");
			}
		}
		System.out.println();
		//Minimum repeating element
		System.out.println("Minimum repeating element:");
		for(int i=0;i<ch.length;i++) {
			 count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				     i++;
				    
				}
			}
		
			if(count==min) {
				System.out.print(ch[i]+" ");
				//System.out.println(ch[i]+" is repeating "+count+" times.");
			}
		}
		System.out.println();
	}
	
	
	
	
	public void palindrome() {
		
		int flag=0;
		String str = "maam";

		char[] ch=str.toCharArray();
	
		
		for(int i=0;i<ch.length/2;i++) {
			flag=0;
			if(ch[i]==ch[ch.length-1-i]) {
				flag=1;
			}
		}
		if(flag==1) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome.");
		}
	
	}

	
	
	
	public void removeChar() {
	
		String str1 = "vastav";
		String str2= "";
	
		char[] ch1=str1.toCharArray();
		
		char c = 's';
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=c) {
				
				str2=str2+ch1[i];
	
			}
		}
		System.out.println("String after removing the given charater from the string:"+str2);
	}
	
	
	
	public void removeDuplicate() {
		
		String str1 = "vastav",str2="";
	
		char[] ch=str1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j] || ch[j]=='&') {
					ch[j]='&';
					
					
				}
			}
			
		}
		for(int i=0;i<ch.length;i++){
			if(ch[i]!='&') {
				str2=str2+ch[i];
			}
			
		}
		System.out.println("String after removing duplicates:"+str2);

	}
	
	
	
	
	public void removeSpace() {

		String str1 = "vas ta v";
		String str2= "";
		
		char[] ch1=str1.toCharArray();
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=' ') {
				
				str2=str2+ch1[i];
	
			}
		}
		System.out.println("String after removing spaces from the string:"+str2);

	}
	
	
	
	public void reverseString() {
	
		
		String str1 = "abcd",str2="";
		
		char[] ch=str1.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			str2=str2+ch[i];
		}
		System.out.println("Reverse of given string:"+str2);

	}
	
	
	
	
	public void sentenceCount() {
		
		String str = "i am java.i am a programming language.";
		
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='.') {
				count++;
			}
		}
		System.out.println("The number of sentences in the given string is: "+count);

		
	}
	
	
	
	
	public void singleCharacterCount() {
		
		String str = "vastav";
		char x='a';
		int count=0;
		
		char[] ch=str.toCharArray();
	
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==x) {
				count++;
			}
		}
		System.out.println("The given letter "+x+" appears "+count+" times in the given string.");
		
		}

	
	
	
	public void spacesCount() {
		
		String str = "abc def ghi";
	
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				count++;
			}
		}
		System.out.println("The number of spaces in the given string is: "+count);

	}
	
	
	
	
	public void splitWithChar() {
		
				String s ="apple";
				char d[] = s.toCharArray();
				char ch='p';
				
				if(d[d.length-1] != ch)
				{
					s=s+ch;
				}
				
				char c[] = s.toCharArray();
				String str="";
				int count =0;
				for(int i=0;i<c.length;i++)
				{
					if(c[i]==ch)
					{
						count++;
						
					}
				}
			
				String s1[] = new String[count];
				int k=0;
				for(int i=0;i<c.length;i++)
				{	
					if(c[i] == ch)
					{
						s1[k]=str;
					    k++;
					    str="";
					}
					else
					{
						str+=c[i];
					}
				}
				for(int i=0;i<s1.length;i++)
				{
					System.out.println(s1[i]);
				}
				
				
				String str2[] =s.split("p");
				for(int i=0;i<str2.length;i++) {
					System.out.println(str2[i]);
				}
	}
	
	
	
	public void strAfterChar() {
		
		String str = "abcdef";

		char[] ch=str.toCharArray();
		
		char c = 'c';
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==c) {
				System.out.println("String after given character:");
				for(int j=i+1;j<ch.length;j++) {
					System.out.print(ch[j]+" ");
					i++; //to also increment i for loop so that it ends once we are out of if  and does not iterate after.
				}
				//or instead of i++ inside the loop keep break; outside the loop but inside if condition.
			}
			
		}
		System.out.println();
	}

	
	
	
	
	public void strBeforeChar() {
		
		String str = "abcdef";

		char[] ch=str.toCharArray();
		
		char c = 'c';
		System.out.println("String before given character:");
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]!=c) {

					System.out.print(ch[i]+" ");	
				
			}
			else {
				break;
			}
		}

		System.out.println();
	}

	
	
	public void subStringAtEnd() {
		
		String str = "i am a human";
		String substr = "man";
		int flag=0;
	
		char[] ch=str.toCharArray();
	
		char[] chsub=substr.toCharArray();
		
		int j=1;
		for(int i=chsub.length-1;i>=0;i--) {
			flag=0;
			if(ch[ch.length-j]==chsub[i]) {
				flag=1;
				j++;
			}
			else {
				break;
			}
		}
			
			
		
		if(flag==1) {
			System.out.println("The substring exists in the main string at ending position.");
		}
		else {
			System.out.println("The substring does not exist in the main string at ending position.");
		}
		 
	}
	
	
	
	
	public void subStringAtStart() {
		
		String str = "i am a human";
		String substr = "i am";
		int flag=0;
	
		char[] ch=str.toCharArray();
		
		char[] chsub=substr.toCharArray();
		
		for(int i=0;i<chsub.length;i++) {
			flag=0;
			if(ch[i]==chsub[i]) {
				flag=1;
			}
			else {
				break;
			}
		}
			
			
		
		if(flag==1) {
			System.out.println("The substring exists in the main string at starting position.");
		}
		else {
			System.out.println("The substring does not exist in the main string at starting position.");
		}
		
	}
	
	
	
	
	
	public void trim() {
		
		String str1 = "  srivastav ";
		String str2="";
		//System.out.println(str2);
		int count=0;
		
		char[] ch=str1.toCharArray();
		
		//To find how many spaces are there at the end
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]==' ') {
				count++;
			}
			else {
				break;
			}
		}
		
		//This loop iterates from 0 index to index where spaces start at the end.
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]==' ') { //To neglect spaces at the start
				
			}
			else { //Here we are appending string from index with first char(spaces at first not considered) to index with last char(spaces at end not considered).
				for(int j=i;j<ch.length-count;j++) {
					
					str2=str2+ch[j];
				}
				break;
			}
			
		}
		
		System.out.println("String after trimming:"+str2);
		
		//System.out.println(str1.trim());
		
	
	}

	
	
	
	public void voewlCount() {
		
		String str = "vastav";
		int count=0;
	
		char[] ch=str.toCharArray();
		System.out.println("Vowels in the string:");
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.print(ch[i]);
				count++;
			}
		}
		System.out.println();
		
		System.out.println("Number of vowels in the given string:"+count);

	}
	
	
	
	
	public void wordCount() {
		
		String str = "i am a human";
		
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=1;i<ch.length;i++) {
			
			if(ch[i-1]!=' ' || i==ch.length-1 ) {
				if((ch[i]==' ' && i!=ch.length-1)|| (i==ch.length-1 && ch[i]!=' ')) {
					count++;
				}
			}
			
			
		}
		System.out.println("The number of words in the given string is: "+count);

	}

	
	
	
}



class StringArray {

	public static void main(String[] args) {
		
		SubS obj = new SubS();
		
		System.out.println("Character count program:");
		
		obj.characterCount();
		
		System.out.println();
		
		System.out.println("Position of character program:");
		
		obj.characterPosition();
		
		System.out.println();
		
		System.out.println("Consonant count program:");
		
		obj.consonantCount();
		
		System.out.println();
		
		System.out.println("Find duplicate program:");
		
		obj.findDuplicate();
		
		System.out.println();
		
		System.out.println("Find sub-string program:");
		
		obj.subString();
		
		System.out.println();
		
		System.out.println("Lines count program:");
		
		obj.linesCount();
		
		System.out.println();
		
		System.out.println("Maximum and minimum program");
		
		obj.maxMin();
		
		System.out.println();
		
		System.out.println("Palindrome program");
		
		obj.palindrome();
		
		System.out.println();
		
		System.out.println("Remove character program:");
		
		obj.removeChar();
		
		System.out.println();
		
		System.out.println("Remove duplicate program:");
		
		obj.removeDuplicate();
		
		System.out.println();
		
		System.out.println("Remove space program:");
		
		obj.removeSpace();
		
		System.out.println();
		
		System.out.println("Reverse String program:");
		
		obj.reverseString();
		
		System.out.println();
		
		System.out.println("Sentence count program:");
		
		obj.sentenceCount();
		
		System.out.println();
		
		System.out.println("Single character count program:");
		
		obj.singleCharacterCount();
		
		System.out.println();
		
		System.out.println("Spaces count program:");
		
		obj.spacesCount();
		
		System.out.println();
		
		System.out.println("Split with character program:");
		
		obj.splitWithChar();
		
		System.out.println();
		
		System.out.println("String after character program:");
		
		obj.strAfterChar();
		
		System.out.println();
		
		System.out.println("String before character program:");
		
		obj.strBeforeChar();
		
		System.out.println();
		
		System.out.println("Sub-string at end program:");
		
		obj.subStringAtEnd();
		
		System.out.println();
		
		System.out.println("Sub-string at start program:");
		
		obj.subStringAtStart();
		
		System.out.println();
		
		System.out.println("Trim program:");
		
		obj.trim();
		
		System.out.println();
		
		System.out.println("Vowel count program:");
		
		obj.voewlCount();
		
		System.out.println();
		
		System.out.println("Word count program:");
		
		obj.wordCount();
		
		
	}

}
