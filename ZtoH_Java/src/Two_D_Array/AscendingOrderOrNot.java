package Two_D_Array;

import java.util.Iterator;

public class AscendingOrderOrNot {

	public static void main(String[] args) {
		
	//	int []arr = {1,2,50,55,90,100};
		int []arr = {1,2,90,55,60,100};
		boolean b = true;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]<arr[i+1]) {
				b=true;
			}
			else {
				b=false;
				break;
			}
		}
		
		if (b) {
			System.out.println("Elements in the array are in ascending order");
		}
		else {
			System.out.println("Elements in the array are NOT in ascending order");
		}

	}

}
