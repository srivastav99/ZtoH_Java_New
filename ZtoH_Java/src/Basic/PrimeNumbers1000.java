package Basic;

public class PrimeNumbers1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Prime numbers from 0 to 1000 are: ");
		for (int j = 2; j <= 1000; j++) {
			
			int flag = 0;

			for (int i = 2; i <= j/2 ; i++) {
				
				if (j % i == 0) {
					flag = 1;

					break;
				}
			}
			
			
		
			if (flag == 0) {
				System.out.print(j+" ");

			} 
			
		}

	}

}
