package Arrays;

public class MultiplySameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5}, arrMul = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			arrMul[i]=arr[i]*arr[i];
		}
		
		System.out.println("Multiplication of same array:");
		
		for(int i=0;i<arrMul.length;i++) {
			System.out.print(arrMul[i]+" ");
		}
	}

}
