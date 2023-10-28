package TestQS;


//check if two strings are rotations of each other
//e.g. if the given String is "XYZ" and "ZXY" then your function should return true, but if the input is "XYZ" and "YXZ" then return false.


public class String5_Rotational {

	public static void main(String[] args) {
		
		String s1 = "XYZ";
		
		String s2 = "ZXY";
		
		
		
		int counts1=0, counts2=0;
		
		boolean flag=true;
		//finding length of string
		int len = s1.length();
				
		//for ratitional string the length should be same
		if(s1.length()==s2.length()) {
			
			char[] cs1 = s1.toCharArray();
			char[] cs2 = s2.toCharArray();
			//for geting to know at which index of the strings they become equal if they are equal
			for(int i=0;i<cs1.length;i++) {
				
				for(int j=0;j<cs2.length;j++) {
					if(cs1[i]==cs2[j]) {
						counts1=i;
						counts2=j;
						break;
					}
				}
				if(cs1[counts1]==cs2[counts2]) {
					break;
				}
			}
			//logic
			for(int i=0;i<cs1.length;i++) {
				if(cs1[counts1]==cs2[counts2]) {
					
					counts1++;
					counts2++;
					if(counts1>cs1.length-1) {
						counts1=0;
					}
					if(counts2>cs2.length-1) {
						counts2=0;
					}
					
				}
				else {
					flag=false;
					break;
				}
			}
			
			if(flag==true) {
				System.out.println("The given strings "+s1+" and "+s2+" are rotational");
			}
			else {
				System.out.println("The given strings "+s1+" and "+s2+" are not rotational");
			}
		}
		else {
			System.out.println("The given two strings are not equal in length so cannot be rotational");
		}

	}

}
