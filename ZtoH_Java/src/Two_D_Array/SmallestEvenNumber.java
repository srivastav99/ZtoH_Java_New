package Two_D_Array;

import java.util.Iterator;

public class SmallestEvenNumber {

	public static void main(String[] args) {
		
		int []arr = {10,40,50,6,3,100,5,200};
		
		int smallEven=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				smallEven = arr[i];
				break;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0) {
				
				if(arr[i]<smallEven) {
					smallEven = arr[i];
				}
			}
		}
		
		System.out.println(smallEven+" is smallest even number in the array");

	}

}
