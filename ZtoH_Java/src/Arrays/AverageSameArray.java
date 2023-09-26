package Arrays;

public class AverageSameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		double avg=0;
		
		for(int i=0;i<arr.length;i++) {
			avg = avg+arr[i];
		}
		avg=avg/arr.length;
		
		System.out.println("Average of same array:"+avg);

	}

}
