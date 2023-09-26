package Basic;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////Without scanner - Without user input
		/*
		int x=5, y=10;
		System.out.println(x>y && y<x);
		System.out.println(x>y || y<x);
		System.out.println(x+=y);
		System.out.println(x=y);
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x-=y);
		System.out.println(x%=y);
		System.out.println(x%y);
		System.out.println(x*=y);
		System.out.println(x*y);
		System.out.println(x!=y);
		System.out.println(x--);
		System.out.println(x++);
		System.out.println(--y);
		System.out.println(++y);
		*/
		
		//With scanner - With user input
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number x:");
		x=sc.nextInt();
		
		System.out.println("Enter number y:");
		y=sc.nextInt();
		
		System.out.println(x>y && y<x);
		System.out.println(x>y || y<x);
		System.out.println(x+=y);
		System.out.println(x=y);
		System.out.println(x>y);
		System.out.println(x>=y);
		System.out.println(x<y);
		System.out.println(x<=y);
		System.out.println(x-=y);
		System.out.println(x%=y);
		System.out.println(x%y);
		System.out.println(x*=y);
		System.out.println(x*y);
		System.out.println(x!=y);
		System.out.println(x--);
		System.out.println(x++);
		System.out.println(--y);
		System.out.println(++y);
		
	}

}
