package TestQS;

public class ArrayQ7_Occurrence {

	public static void main(String[] args) {
		
		String s1="Hi Hellolllo how are you";
		String s2="ll";
		char c[]=s1.toCharArray();
		char c1[]=s2.toCharArray();
		int flag=0,k=0;
		int count=0;   
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
				count++;
			}
		}
		if(count>=1) {
			System.out.println("Substring "+s2+" occurs "+count+" times in the given string:"+s1);
		}
		else {
			System.out.println("Substring not matching");
		}
		
	
		

	}

}
