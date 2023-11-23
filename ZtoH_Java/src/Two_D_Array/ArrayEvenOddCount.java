package Two_D_Array;



public class ArrayEvenOddCount {

	public static void main(String[] args) {
		
		int[] arr = {1,2,7,9,16,99,100};
		int countEven =0, countOdd = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				countEven++;
			}
			else {
				countOdd++;
			}
		}
		
		System.out.println("Array contains "+countOdd+" odd numbers and  "+countEven+" even numbers");

	}

}
