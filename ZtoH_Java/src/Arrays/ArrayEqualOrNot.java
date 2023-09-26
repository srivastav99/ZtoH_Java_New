package Arrays;

public class ArrayEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,3,4,5};
		int flag=0;
		
		if(arr1.length == arr2.length) {
			
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i]==arr2[i]) {
					flag=1;
				}
				else {
					flag=0;
					break;
				}
			}
		}
	
				
		
		if(flag==1) {
			System.out.println("Both the arrays are equal.");
		}
		else {
			System.out.println("Both the arrays are not equal.");
		}

	}

}
