package Basic;

import java.util.Scanner;

public class PowerFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pow, n,total=1;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter a number:");
		 n = sc.nextInt();
		 
		 System.out.println("Enter the power value:");
		 pow = sc.nextInt();
		 
		 for(int i=1;i<=pow;i++) {
			 total = total*n;
		 }
		 System.out.println(n+" power "+pow+" is "+total);

	}

}
