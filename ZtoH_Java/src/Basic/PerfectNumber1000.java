package Basic;



public class PerfectNumber1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("List of perfect numbers from 1 to 1000:");
		for(int i=1;i<=1000;i++) {
			int sum=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
				
			}
			if(sum==i) {
				System.out.print(i+" ");
				
			}
		}
		

	}

}
