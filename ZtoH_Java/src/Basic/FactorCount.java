package Basic;

import java.util.Scanner;

public class FactorCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,count=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		n = sc.nextInt();
	
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.print("The number of factors for "+n+" are:"+count);
	}

}
