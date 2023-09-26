package Functions;


public class Array_SumSameArray {

	
	/*
	//A R
	public static int[] SumSameArray(int arr[]) {
		
		int []arrSum = new int[arr.length];
		

		for(int i=0;i<arr.length;i++) {
			
			arrSum[i]=arr[i]+arr[i];
		}
		return arrSum;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5}; 
	
		int[] arrSum=SumSameArray(arr); 
		
		System.out.println("Sum of same array:");
		
		
		for(int i=0;i<arrSum.length;i++) {
			
			System.out.print(arrSum[i]+" ");
		}
		
		
	}
	*/
	
	
	/*
	//NA NR
		public static void SumSameArray() {
			
			int[] arr = {1,2,3,4,5}; 
			int []arrSum = new int[arr.length];
			

			for(int i=0;i<arr.length;i++) {
				
				arrSum[i]=arr[i]+arr[i];
			}
			
			System.out.println("Sum of same array:");	
			
			for(int i=0;i<arrSum.length;i++) {
				
				System.out.print(arrSum[i]+" ");
			}
			
		}
		
		
		public static void main(String[] args) {
	
			SumSameArray(); 

		}
		*/
	

	/*
	//A NR
		public static void SumSameArray(int arr[]) {
			
			int []arrSum = new int[arr.length];
			

			for(int i=0;i<arr.length;i++) {
				
				arrSum[i]=arr[i]+arr[i];
			}
			
			System.out.println("Sum of same array:");
			
			
			for(int i=0;i<arrSum.length;i++) {
				
				System.out.print(arrSum[i]+" ");
			}
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] arr = {1,2,3,4,5}; 
		
			SumSameArray(arr); 
			
			
			
		}
		*/
	
	
	
	
	//NA R
		public static int[] SumSameArray() {
			
			int[] arr = {1,2,3,4,5};
			int []arrSum = new int[arr.length];
			

			for(int i=0;i<arr.length;i++) {
				
				arrSum[i]=arr[i]+arr[i];
			}
			return arrSum;
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		
			int[] arrSum=SumSameArray(); 
			
			System.out.println("Sum of same array:");
			
			
			for(int i=0;i<arrSum.length;i++) {
				
				System.out.print(arrSum[i]+" ");
			}
			
			
		}
	
	

}
