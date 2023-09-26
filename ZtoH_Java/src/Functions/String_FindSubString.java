package Functions;


public class String_FindSubString {

	
	
	/*
	//A R
	public static int FindSubString(char c[],char c1[]) {
		
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
		return flag;
	}
	
	
	public static void main(String[] args) {
		
	
			String s1="ztoh hi india ites pvt ltd";
			String s2="ites";
			
			char c[]=s1.toCharArray();
			char c1[]=s2.toCharArray();
			
			int flag=FindSubString(c,c1);
			
			if(flag==c1.length) {
				System.out.println("Substring matching");
			}
			else {
				System.out.println("Substring not matching");
			}
	}
	*/
	
	
	
	/*
	//NA NR
		public static void FindSubString() {
			
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
		
		
		public static void main(String[] args) {
	
				FindSubString();
	
		}
		*/
	
	
	
	/*
	//A NR
		public static void FindSubString(char c[],char c1[]) {
			
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
		
		
		public static void main(String[] args) {
			
		
				String s1="ztoh hi india ites pvt ltd";
				String s2="ites";
				
				char c[]=s1.toCharArray();
				char c1[]=s2.toCharArray();
				
				FindSubString(c,c1);
				
				
		}
		*/
	
	
	
	//NA R
		public static int[] FindSubString() {
			
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
			int res[]= {flag,c1.length};
			return res;
		}
		
		
		public static void main(String[] args) {
			
		
				
				int[] res=FindSubString();
				
				if(res[0]==res[1]) {
					System.out.println("Substring matching");
				}
				else {
					System.out.println("Substring not matching");
				}
		}

}
