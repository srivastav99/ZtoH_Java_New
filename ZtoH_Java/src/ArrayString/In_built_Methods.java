package ArrayString;

public class In_built_Methods {

	public static void main(String[] args) {
		
		String s = "java";
	//charAt()
		//The Java String class charAt() method returns a char value at the given index number.
		System.out.println("charAt():");
		char c = s.charAt(1);
		System.out.println(c);
		System.out.println();
		
	//compareTo()
		//It compares strings on the basis of the Unicode value of each character in the strings.The Java String class compareTo() method compares the given string with the current string lexicographically. It returns a positive number, negative number, or 0.If the first string is lexicographically greater than the second string, it returns a positive number (difference of character value). If the first string is less than the second string lexicographically, it returns a negative number, and if the first string is lexicographically equal to the second string, it returns 0.
		System.out.println("compareTo():"); //compares ASCII values of character one by one and if they are unequal it gives its difference in ASCII value, if entire charcaters of entire string matches it gives 0 
		String s1="java";
		
		int b = s.compareTo(s1);
		System.out.println(b); //if same gives 0
		b = s.compareTo("jAva");//a=97 A=65, 97-65=32
		System.out.println(b);
		System.out.println();
		
	//concat()
		//The Java String class concat() method combines specified string at the end of this string. It returns a combined string. It is like appending another string.
		System.out.println("concat():");
		String s2 = s.concat(s1);
		System.out.println(s2);
		String s3 = s.concat("programming");
		System.out.println(s3);
		System.out.println();
		
	//contains() 
		//The Java String class contains() method searches the sequence of characters in this string. It returns true if the sequence of char values is found in this string otherwise returns false.
		System.out.println("contains():");
		boolean bool = s.contains(s1); //s=java s1=java 
		System.out.println(bool);
		bool = s.contains("ja");
		System.out.println(bool);
		System.out.println();
		
	//endsWith()
		//The Java String class endsWith() method checks if this string ends with a given suffix. It returns true if this string ends with the given suffix; else returns false.
		System.out.println("endsWith():");
		String str = "a";
		bool = s.endsWith(str);
		System.out.println(bool);
		bool = s.endsWith("a");
		System.out.println(bool);
		System.out.println();
		
	//equals()
		//The Java String class equals() method compares the two given strings based on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.
		System.out.println("equals():");
		System.out.println(s==s1);//In this case it is taken as string literal, if we consider object it gives false(refer to intern()).
		System.out.println(s.equals(s1)); //s=java, s1=java
		System.out.println(s.equals("va"));
		System.out.println();
		
	//equalsIgnoreCase()
		//The Java String class equalsIgnoreCase() method compares the two given strings on the basis of the content of the string irrespective of the case (lower and upper) of the string. It is just like the equals() method but doesn't check the case sensitivity. If any character is not matched, it returns false, else returns true.
		System.out.println("equalsIgnoreCase():");
		System.out.println(s.equalsIgnoreCase(s1));//s=java, s1=java
		System.out.println(s.equalsIgnoreCase("Java"));
		System.out.println();
		
	//format() 
		//The java string format() method returns the formatted string by given locale, format and arguments.The format() method of java language is like sprintf() function in c language and printf() method of java language.
		float f = 3.2346f;
		System.out.println("format():");
		System.out.println(String.format("%s is programming language", s));//string s=java
		System.out.println(String.format("is programming %d language", 23));//int
		System.out.println(String.format("%f is programming language", f));//float
		System.out.println(String.format("%c is programming language", 'j'));//char
		System.out.println();
		
	//getBytes() 
		//converts string into byte arrays having ASCII values of respective characters 
		//The Java String class getBytes() method does the encoding of string into the sequence of bytes and keeps it in an array of bytes.
		System.out.println("getBytes():");
		String s4 = "abcd";
		byte[] bytes=s4.getBytes(); 
		for(int i=0;i<bytes.length;i++){  
			System.out.println(bytes[i]);  
		} 
		System.out.println();
		
	//getChars()
		//The Java String class getChars() method copies the content of this string into a specified char array. There are four arguments passed in the getChars() method. 
		System.out.println("getChars():");
		String str1 = "java is a programming language";
		char[] ch = new char[4];
		  
		str1.getChars(5, 9, ch, 0);//Here, string from 5th position to 9th position is taken and stored in char array ch from position 0 of char array
		System.out.println(ch);
		System.out.println();
		
	//indexOf() 	
		//The Java String class indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
		System.out.println("indexOf():");
		String str2 = "i am a human";
		int n=str2.indexOf("m");
		System.out.println(n);
		n=str2.indexOf("h");
		System.out.println(n);
		System.out.println();
		
	//intern()
		//takes string and puts its in string pool so when we use == it checks whether string is in string pool and returns true or false
		//The Java String class intern() method returns the interned string. It returns the canonical representation of string.It can be used to return string from memory if it is created by a new keyword. It creates an exact copy of the heap string object in the String Constant Pool.
		System.out.println("intern():");
		String str3=new String("java program");
		String str4=new String("java program");
		System.out.println("With out intern method:");
		System.out.println(str3==str4);
		str3=new String("java program").intern();
		str4=new String("java program").intern();
		System.out.println("With intern method:");
		System.out.println(str3==str4);
		System.out.println();
		
	//isEmpty() 
		//The Java String class isEmpty() method checks if the input string is empty or not. Note that here empty means the number of characters contained in a string is zero.
		System.out.println("isEmpty():");
		String str5 = "";
		String str6 = " ";
		String str7 = null;
		System.out.println(str5.isEmpty());//gives true since there is no characters in the string
		System.out.println(str6.isEmpty());//gives false as there is a character(space) in the string
		//System.out.println(str7.isEmpty());//gives error as "String.isEmpty()" cannot be invoked because "str7" is null
		System.out.println();
		
	//join()
		//The Java String class join() method returns a string joined with a given delimiter. In the String join() method, the delimiter is copied for each element. The join() method is included in the Java string since JDK 1.8.
        //delimiter : char value to be added with each element
		System.out.println("join():");
		String date = String.join("/", "25", "06", "2018");
		System.out.println(date);
		String time = String.join(":", "12", "10", "10");
		System.out.println(time);
		System.out.println();
		
	//lastIndexOf()
		//The Java String class lastIndexOf() method returns the last index of the given character value or substring. If it is not found, it returns -1. The index counter starts from zero.
		System.out.println("lastIndexOf():");
		String s5="this is index of example";//there are 2 's' characters in this sentence  
		int index1=s5.lastIndexOf('s');//returns last index of 's' char value  
		System.out.println(index1);//6 
		index1=s5.lastIndexOf('z');
		System.out.println(index1);//-1 as the char doesnot exist in the string
		index1=s5.lastIndexOf("is");
		System.out.println(index1);//5 as 'is' starts at index 5
		System.out.println();
		
	//length() 
		//The Java String class length() method finds the length of a string. The length of the Java string is the same as the Unicode code units of the string.
		System.out.println("length():");
		System.out.println(s.length());//s=java
		System.out.println();
		
	//replace()
		//The Java String class replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
		System.out.println("replace():");
		String s6="java is a good language";  
		String replaceString=s6.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString); 
		String replaceString1=s6.replace("java","python");//replaces all occurrences of 'java' to 'python'  
		System.out.println(replaceString1);
		System.out.println();
	
	//replaceAll()
		//The Java String class replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string. Works same as replace()
		System.out.println("replaceAll():");
		String s7="java is a good language";  
		String replaceString2=s6.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString2); 
		String replaceString3=s6.replace("java","python");//replaces all occurrences of 'java' to 'python'  
		System.out.println(replaceString3);
		System.out.println();
		
	//split()
		//The java string split() method splits this string against given regular expression and returns a char array.
		//splitting with " "
		System.out.println("split():");
		String s8 = "i am a  human";
		String []strarr = s8.split(" ");
		System.out.println("Splitting a string with spaces using \" \"");
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i]);	
		}
		System.out.println("Length of string array:"+strarr.length); //5 ,when we use " " to split a string with space, and whenever there are two continuous spaces it will take in one space
		//splitting with \s+
		s8 = "i am a  human";
		strarr = s8.split("\\s+");//Here + makes sure that even if multiple spaces are there in string it will take care of it.if we use - instead if + then split will take the entire string and put it in single index of string array.
		System.out.println("Splitting a string with spaces using \\s+");
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i]); 	
		}
		System.out.println("Length of string array:"+strarr.length); //4,removes all white spaces and stores only words.
		//splitting with a character
		s8 = "i am a human";
		strarr = s8.split("a");
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i]);
		}
		System.out.println();
		
	//startsWith()
		//The Java String class startsWith() method checks if this string starts with the given prefix. It returns true if this string starts with the given prefix; else returns false.
		System.out.println("startsWith():");
		String s9="java string split method";    
		System.out.println(s9.startsWith("ja"));  // true  
		System.out.println(s9.startsWith("java string"));   // true  
		System.out.println(s1.startsWith(" xsa"));  // false as 'j' and 'xsa' are different   
		System.out.println();
		
	//substring()
		//Two types:
		//1.We pass beginIndex and endIndex number position in the Java substring method where beginIndex is inclusive, and endIndex is exclusive. It returns string from starting position(including element at starting position) to ending position(excluding element at ending position).
		//2.We pass beginIndex and it returns string from starting position(including element at starting position) till the end.
		System.out.println("substring():");
		String s10="i am a human";    
        String substr = s10.substring(2); // Starts with 0 and goes to end  
        System.out.println(substr);  
        String substr2 = s10.substring(2,8); // Starts from 2 and goes to 8 
        System.out.println(substr2);    
        System.out.println();
	
    //toCharArray()
        //The java string toCharArray() method converts this string into character array. It returns a newly created character array, its length is similar to this string and its contents are initialized with the characters of this string.
        System.out.println("toCharArray():");
        String s11="hello";  
        char[] ch1=s11.toCharArray();  
        for(int i=0;i<ch1.length;i++){  
        System.out.println(ch1[i]);  
        } 
        System.out.println();
        
    //toLowerCase()
        //The java string toLowerCase() method returns the string in lowercase letter. In other words, it converts all characters of the string into lower case letter.
        System.out.println("toLowerCase():");
        String s12="JAVA";  
        String s12lower=s1.toLowerCase();  
        System.out.println(s12lower); 
        System.out.println();
        
    //toUpperCase()
        //The java string toUpperCase() method returns the string in uppercase letter. In other words, it converts all characters of the string into upper case letter.
        System.out.println("toUpperCase():");
        String s13="java";  
        String s13Upper=s1.toUpperCase();  
        System.out.println(s13Upper); 
        System.out.println();
        
    // trim()
        //The Java String class trim() method eliminates leading and trailing spaces. The Unicode value of space character is '\u0020'. The trim() method in Java string checks this Unicode value before and after the string, if it exists then the method removes the spaces and returns the omitted string.
        System.out.println("trim():");
        String s14="  hello string   ";  
        System.out.println("without trim():"+s14+" of java");//without trim()  
        System.out.println("with trim():"+s14.trim()+" of java");//with trim()  
        System.out.println();
        
    //valueOf()
        //The java string valueOf() method converts different types of values into string. By the help of string valueOf() method, you can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string.
        System.out.println("valueOf:");
        int value=30;  
        String s15=String.valueOf(value); 
        System.out.println("int to string:");
        System.out.println(s15+"string");//concatenating string with string  
        
        boolean bol = true;   
        String s16 = String.valueOf(bol);
        System.out.println("boolean to string:");
        System.out.println(s16); 
        
        char ch4 = 'A';
        String s17 = String.valueOf(ch1); 
        System.out.println("char to string:");
        System.out.println(s17);  
        
        float f1  = 10.05f;    
        double d = 10.02;  
        String s18 = String.valueOf(f);    
        String s19 = String.valueOf(d); 
        System.out.println("float to string:");
        System.out.println(s18);
        System.out.println("double to string:");
        System.out.println(s19);  
        System.out.println();
        
        boolean b1=true;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f3 = 15.5f;  
        double d3 = 16.5d;  
        char chr[]={'j','a','v','a'};  
        In_built_Methods obj=new In_built_Methods();  
        String st1 = String.valueOf(b1);    
        String st2 = String.valueOf(b2);    
        String st3 = String.valueOf(sh);    
        String st4 = String.valueOf(i);    
        String st5 = String.valueOf(l);    
        String st6 = String.valueOf(f);    
        String st7 = String.valueOf(d);    
        String st8 = String.valueOf(chr);    
        String st9 = String.valueOf(obj);    
        System.out.println(st1);  
        System.out.println(st2);  
        System.out.println(st3);  
        System.out.println(st4);  
        System.out.println(st5);  
        System.out.println(st6);  
        System.out.println(st7);  
        System.out.println(st8);  
        System.out.println(st9);  
        
        
        System.out.println();
           
        
	}

}
