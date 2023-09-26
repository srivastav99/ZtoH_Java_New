package Functions;

public class Array_EqualOrNot {

	/*
	//A R
	public static int EqualOrNot(int flag) {
		int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,3,4,5};
		
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
		return flag;
	
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int flag=EqualOrNot(0);
	
		
		if(flag==1) {
			System.out.println("Both the arrays are equal.");
		}
		else {
			System.out.println("Both the arrays are not equal.");
		}

	}
	*/
	
	
	/*
	//NA NR
	public static void EqualOrNot() {
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
	
	
	public static void main(String[] args) {
		
		EqualOrNot();


	}
	*/
	
	
	
	
	/*
	//A NR
		public static void EqualOrNot(int flag) {
			int[] arr1 = {1,2,3,4,5}, arr2 = {1,2,3,4,5};
			
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

		
		public static void main(String[] args) {
			
			EqualOrNot(0);

		}
		*/
	
	
	
	//NA R
		public static int EqualOrNot() {
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
			return flag;
			
			
		
			
		}

		
		public static void main(String[] args) {
			
			int flag=EqualOrNot();
			
			if(flag==1) {
				System.out.println("Both the arrays are equal.");
			}
			else {
				System.out.println("Both the arrays are not equal.");
			}

		}
		

}
