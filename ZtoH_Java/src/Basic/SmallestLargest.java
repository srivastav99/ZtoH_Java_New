package Basic;

import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, range, s=0,l=0 ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range:");
		range = sc.nextInt();
		
		System.out.println("Enter number 1:");
		s=sc.nextInt();
		
		System.out.println("Enter number 2:");
		l=sc.nextInt();
		
		if(s>l) {
			l=l+s;
			s=l-s;
			l=l-s;
		}
	
		for(int i=3;i<=range;i++) {
			System.out.println("Enter number "+i+":");
			n = sc.nextInt();
			
			if(n<=s) {
				s=n;
			}
			
			else if(n>l) {
				l=n;
			}
		}
		System.out.println("Smallest number entered:"+s);
		System.out.println("Largest number entered:"+l);
		
		
	}

}
