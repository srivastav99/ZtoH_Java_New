package Arrays;


public class SumSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5}, arrSum = new int[arr.length];
	
	
		System.out.println("Sum of same array:");
		
		
		for(int i=0;i<arr.length;i++) {
			
			arrSum[i]=arr[i]+arr[i];
		}
		
		for(int i=0;i<arrSum.length;i++) {
			
			System.out.print(arrSum[i]+" ");
		}
		
		
		/*
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
		}
		System.out.println(sum);
		*/
	}

}
