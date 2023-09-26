package Basic;

import java.util.Scanner;

public class FibonacciPositions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int f1=0,f2=1,f3,n;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter range:");
				n=sc.nextInt();
				
				
				System.out.print("fibonacci series for the given range: "+f1+" "+f2+" ");
				
				f3=f1+f2;
				while(f3<=n) {
					
					System.out.print(f3+" ");
	
					f1=f2;
					f2=f3;
					f3=f1+f2;
				}

	}

}
