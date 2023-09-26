package Basic;

public class PrimeNumber50to150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=50;
		System.out.println("Prime Numbers from 50 to 150:");
		while(n<=150) {
			int i = 2;
			int f=0;
			while(i<n) {
				if(n%i==0) {
					f=1;
					break;
				}
				
				i++;
			}
			
			if(f==0) {
				System.out.println(n);
			}
			n++;
		}

	}

}
