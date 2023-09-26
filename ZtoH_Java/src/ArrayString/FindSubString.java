package ArrayString;

public class FindSubString {

	public static void main(String[] args) {
		
			String s1="ztoh hi india ites pvtvti ltd";
			String s2="vti";
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
			
		
		/*
		String s="ztoh hi india ites pvtvti ltd";
		char ch[]=s.toCharArray();
		String sub="vti"; //This case it does not work, it works in all other cases
		char c[]=sub.toCharArray();
		int k=0,flag=1;
		for(int i=0;i<ch.length;i++) {
			//k=0;
			if(ch[i]==c[k]) {
				k++;
			}
			else {
				k=0;
			}
			if(k==c.length) {
				flag=0;
				break;
			}
		}
		if(flag==0) {
			System.out.println("substring is matching");
		}
		else {
			System.out.println("substring is not matching");
		}
		*/
	}

}
