package TestQS;


public class ArrayQ8_Replace {

	public static void main(String[] args) {
		
		String s = "Hi Hello How  are you";
		
		String []str = s.split("\\s+");
		
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
		
		System.out.println("Number of words in the string:"+str.length);
		
		for(int i=0;i<str.length;i++) {
			String s1="";
			if(i!=str.length-1) {
				s1 = str[i];
				str[i] = str[i+1];
				str[i+1] = s1;
				i++;
				
			}
		}
		
		System.out.println("String after replacing:");
		for(int i=0;i<str.length;i++) {
			if(i==str.length-1) {
				System.out.print(str[i]);
				break;
			}
			System.out.print(str[i]+" ");
		}
		
		/*
		String s2="";
		System.out.println("String after replacing:");
		for(int i=0;i<str.length;i++) {
			if(i!=str.length-1) {
				s2 = s2+str[i]+" ";
			}
			else {
				s2 = s2+str[i];
			}
			
		}
		System.out.print(s2);
	*/
		
		
	}

}
