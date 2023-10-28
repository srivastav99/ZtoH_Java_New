package TestQS;

//find all pairs of elements in an integer array whose sum is equal to a given number
public class Arrays2_SumOfPairEqualsNum {

	public static void main(String[] args) {
		
		int[] num = {4, 6, 5, -10, 8, 5, 20};
		
		int sum = 10;
		
		for (int i = 0; i < num.length; i++) {
			
			for (int j = i+1; j < num.length; j++) {
				
				if(num[i]+num[j]==sum) {
					System.out.println(num[i]+" and "+num[j]+" is a pair whose sum is "+sum);
				}
			}
			
		}

	}

}
