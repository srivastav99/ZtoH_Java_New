package ArrayString;

public class ChartoString {

	public static void main(String[] args) {
		
		String s = "i am a human";
		char []c= s.toCharArray();
		int count=0,counter=0;
		String s1="";
		
		for(int i=0;i<c.length;i++) {
			if(c[i]==' ') {
				count++;
			}
		}
		String []str = new String[count+1];
		
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {
				s1=s1+c[i];
			}
			if(c[i]==' '|| i==c.length-1) {
				str[counter]=s1;
				counter++;
				s1="";
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}
				
	}

}
