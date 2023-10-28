package TestQS;
//find continuous sub array whose sum is equal to a given number
public class Arrays3_SubArraySum {

	public static void main(String[] args) {
		
		int[] num = {42, 15, 12, 8, 6, 32,-6};
		
		int sum = 26;
		
		for (int i = 0; i < num.length; i++) {
			int n=0,j=i;
			while(j<num.length) {
				n=n+num[j];
				if(n==sum) {
					for (int k = i;  k<=j; k++) {
						System.out.print(num[k]+" ");
					}
					System.out.println();
					break;
				}
				j++;
			}
			
			
			
		}

	}

}
