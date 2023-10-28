package TestQS;

//Finding first repeating and non-repeating character in the string 
public class String2_FirstRepeatingandnonRepeating {

	public static void main(String[] args) {
		
		String s = "abcdeabc";
		int flag = 0;
		char[] c = s.toCharArray();
		//for first repeating character
		for(int i=0;i<c.length;i++) {
			
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					System.out.println("The first repeating character in the string:"+c[i]);
					flag=1;
					break;
				}
			}
			if(flag==1) {
				break;
			}
			if((c.length-1)==i && flag==0) {
				System.out.println("No character in the string is repeating");
			}
			
		}
		
		//for first non-repeating character
		for(int i=0;i<c.length;i++) {
			flag=0;
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					
					flag=1;
					break;
					
				}
			}
			
			if(flag==0) {
				System.out.println("The first non-repeating character in the string:"+c[i]);
				break;
			}
			
		}
		
		

	}

}
