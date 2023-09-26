package Basic;

import java.util.Scanner;

public class ArmstrongNumWithoutCommaAtLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  digit,n=0, j=1;

		System.out.println("Armstrong numbers from 1 to 500 are:");
		
		for(j=1;j<=500;j++) {
			n=j;
		
			int sum = 0;
			while(n!=0) 
			{
				
				digit=n%10;  //Gives last digit of the number
				sum = sum+digit*digit*digit;  //Builds up the number in reverse order
				n=n/10;  //Eliminates the last digit as it is no longer required.
			}
		if(j==sum) {
			System.out.print(j);
			break;
		
			
		}
		}
		for(j=j+1;j<=500;j++) {
			n=j;
		
			int sum1 = 0;
			while(n!=0) 
			{
				
				digit=n%10;  //Gives last digit of the number
				sum1 = sum1+digit*digit*digit;  //Builds up the number in reverse order
				n=n/10;  //Eliminates the last digit as it is no longer required.
			}
		if(j==sum1) {
			System.out.print(","+j);
			
		
			
		}
		

			
	
	}

}
}
