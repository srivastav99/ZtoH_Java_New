package TestQS;
//program to find all the leaders in an integer array
//A leader is an element of the array if it is greater than all the elements to its right side in the array
public class Arrays4_LeaderOfArray {

	public static void main(String[] args) {
		
		int[] num = {8, 23, 19, 21, 15, 6, 11};
		
		int max = num[0];
		int maxindex = 0;
		boolean flag = true;
		
		for (int i = 1; i < num.length; i++) {
			if(num[i]>max) {
				max=num[i];
				maxindex = i;
			}
		}
		System.out.print("Leaders of the given array:");
		System.out.print(num[maxindex]+" ");
		for (int i = maxindex+1; i < num.length; i++) {
			flag = true;
			int j=i+1;
			while(j<num.length) {
				if(num[i]>num[j]) {
					flag=true;
					j++;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag == true) {
				System.out.print(num[i]+" ");
			}
			
		}
		
		

	}

}
