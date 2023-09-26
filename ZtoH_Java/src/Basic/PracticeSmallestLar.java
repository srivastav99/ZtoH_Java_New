package Basic;

import java.util.Scanner;

public class PracticeSmallestLar {

	public static void main(String[] args) {
		
		int no, no1, max=0, min=0;;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range:");
		no=sc.nextInt();
		System.out.println("Now enter as per range:");
		for(int i=1;i<=no;i++) {
			no1=sc.nextInt();
			if(no1>max || max==0) {
				max=no1;
			}
			if(no1<min || min==0){
				min=no1;
				
			}
		}
		System.out.println("Largest number:"+max);
		System.out.println("Smallest number:"+min);

	}

}
