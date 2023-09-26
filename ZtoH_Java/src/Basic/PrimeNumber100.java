package Basic;

public class PrimeNumber100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Prime numbers from 0 to 100 are: ");
		//with loop
		
		for (int i = 2; i <= 100; i++) {
			
			int flag = 0;

			for (int j = 2; j <= i/2 ; j++) {
				
				if (i % j == 0) {
					flag = 1;

					break;
				}
			}
			
			
		
			if (flag == 0) {
				System.out.print(i+" ");

			} 
			
		}
		
		
		//without loop
		/*
		for (int i = 2; i <= 100; i++) {
			
			int flag = 0;
			
			if(i%2==0) {
				if(i==2) {
					flag = 1;
				}
			}
			else if(i%3==0){
				if(i==3) {
					flag = 1;
				}
	
			}
			else if(i%5==0) {
				if(i==5) {
					flag = 1;
				}
			}
			else if(i%7==0) {
				if(i==7) {
					flag = 1;
				}
			}
			else {
				flag =1;
			}
			
			
			if (flag == 1) {
				System.out.print(i+" ");

			} 
			
			}
			*/
		

	}

}
