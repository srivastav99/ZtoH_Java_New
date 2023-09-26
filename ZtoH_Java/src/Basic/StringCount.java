package Basic;


public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "srivastav";
		int len,count =0;
		len = s.length();
		
		
		for(int i=0;i<len;i++) {
			Character str = s.charAt(i);
			//System.out.println(str);
			count=0;
			for(int j=0;j<len;j++) {
				//System.out.println(s.charAt(j));
				if(str.equals(s.charAt(j))) {
					count++;
				
			}
			
		}
			System.out.println(str+" repeats "+count+" times");

	}

}
}
