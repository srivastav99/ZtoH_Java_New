package Basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int  digit,n=0,num;

		System.out.println("Armstrong numbers from 1 to 500 are:");
		
		for(int j=1;j<=500;j++) {
			n=j;
		
			int sum = 0;
			while(n!=0) 
			{
				
				digit=n%10;  //Gives last digit of the number
				sum = sum+digit*digit*digit;  //Builds up the number in reverse order
				n=n/10;  //Eliminates the last digit as it is no longer required.
			}
		if(j==sum) {
			//System.out.print(j+",");
			System.out.print(j+" ");
			
		
			
		}
		}
		
		*/
		
		int  count = 0, digit = 0;
		
		System.out.print("List of Armstrong numbers from 0 to 500: ");
		for (int j = 1; j <= 500; j++) {
			
			count = 0;
			int k=j;
			int l=j;
			while (l != 0) {

				l = l / 10;
				count++;
			}
			int sum=0;
			int mul=0;
				while (k != 0) {

					
					digit = k % 10; // Gives last digit of the number
					mul=1;
					for (int i = 1; i <= count; i++) {
						 
						mul = mul*digit; //gives power of value of a digit
						
					}
					sum=sum+mul;
					k = k / 10; // Eliminates the last digit as it is no longer required.
				}
			
			if (j == sum) {
				System.out.print(sum+" ");
			}

		}
		
	}

}
