package Loops;

import java.util.Scanner;

public class AutomobileWheels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v,w,Tw=0,Fw=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total number of vehicles(2 and 4 wheelers):");
		v=sc.nextInt();
		
		System.out.println("Enter total number of wheels:");
		w=sc.nextInt();
		
		
		if(w>=2 && w%2==0 && v<w ) {
			
			Tw = ((4*v)-w)/2;
			Fw = v-Tw;	
			
			//or
			/*
			Fw = (w-(2*v))/2;
			Tw = v-Fw;
			*/
			System.out.println("TW="+Tw+" FW="+Fw);
		}
		else {
			System.out.println("Invalid input.");
		}
		

		

	}

}
