package Two_D_Array;


public class SameElements {

	public static void main(String[] args) {
		
		
		String []arr1 = {"red","green","yellow","blue"};
		
		String []arr2 = {"green","blue","red","yellow"};
		boolean b = false;
		for(int i=0;i<arr1.length;i++) {
			
			char []c1 = arr1[i].toCharArray();
			
			for(int j=0;j<arr2.length;j++) {
				
				char []c2 = arr2[j].toCharArray();
				
				if(c1.length==c2.length) {
					for(int k=0;k<c1.length;k++) {
						
						if(c1[k]==c2[k]) {
							
							b=true;
							
							
						}
						else {
							b=false;
							break;
							
						}
					}
					
				}
				if(b) {
					break;
					
				}
			}
			if(!b) {
				break;
			}
		}
		if(b) {
			System.out.println("both arrays contain the same elements");
		}
		

	}

}
