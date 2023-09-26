package Loops;

import java.util.Scanner;


public class FindFactor {


		public static void main(String[] args) {

			int n;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a number to find its factors:");
			
			//n=Math.abs(sc.nextInt());
			//or
			n=sc.nextInt();
			
			if(n<0) {  //to convert -ve values to +ve values
				n=-n;
			}
			System.out.print("Factors of given number:");
			
			if(n>0) {
				for(int i=1;i<=n;i++) {
				
					if(n%i==0) {
						System.out.print(i);
						if(i!=n) {
							System.out.print(",");
						}
					
					}
				}
			}
			else {
				System.out.println("No factors");
			}
			

		}
		
	

}
