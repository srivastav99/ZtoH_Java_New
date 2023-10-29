package TestQS;

import java.util.Arrays;

//find the minimum absolute difference between any two elements of the given array
public class Arrays5_MinAbsDiff {

	public static void main(String[] args) {
		
		int[] num = {5, -3, 7, -2};
		
		int[] numsort = num;
		
		Arrays.sort(numsort);
		
		int fele = numsort[0], sele = numsort[1];
		
		int min = Math.abs(numsort[1]-numsort[0]) ;
		
		for (int i = 2; i < numsort.length; i++) {
			if(Math.abs(numsort[i] - numsort[i-1]) < min) {
				
				min =  Math.abs(numsort[i]-numsort[i-1]);
				fele = numsort[i-1];
				sele = numsort[i];
			}
		}
		
		System.out.println("Minimum absolute differnece of two elements in the array is:"+min);
		System.out.println("The pair of numbers having minimum absolute differnce in the array are "+fele+" and "+sele);

	}

}
