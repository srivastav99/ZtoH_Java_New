package Polymorphism;

public class RunTime_Mobile {

	public static void main(String[] args) {
		
		Samsung_Galaxy_M14 o1= new Samsung_Galaxy_M14();
		System.out.println("Samsung_Galaxy_M14:");
		System.out.print("Display:");
		o1.display();
		System.out.print("RAM:");
		o1.ram();
		System.out.print("Back camera:");
		o1.backCam();
		System.out.print("Front camera:");
		o1.frontCam();
		System.out.print("Country:");
		o1.origin();
		System.out.println("SIM details:");
		o1.sim();
		
		System.out.println();
		System.out.println();
		
		Samsung_Galaxy_M33 o2 = new Samsung_Galaxy_M33();
		System.out.println("Samsung_Galaxy_M33:");
		System.out.print("Display:");
		o2.display();
		System.out.print("RAM:");
		o2.ram();
		System.out.print("Back camera:");
		o2.backCam();
		System.out.print("Front camera:");
		o2.frontCam();
		System.out.print("Country:");
		o2.origin();
		System.out.println("SIM details:");
		o2.sim();
		
		
		
		o1=(Samsung_Galaxy_M14)o2;
		o1.ram();
		
		
		o1=o2;
		o1.ram();
		  
	}
 
}
class Samsung_Galaxy_M14{
	
	void display() {
		String resolution = "1080 x 2400 pixels";
		System.out.println(resolution);
	}
	void ram() {
		String ram = "4 GB";
		System.out.println(ram);
	}
	void backCam() {
		String bmp = "32 MP";
		System.out.println(bmp);
	}
	void frontCam() {
		String fmp = "13 MP";
		System.out.println(fmp);
	}
	void origin() {
		String country = "India";
		System.out.println(country);
	}
	void sim() {
		String sim = "Dual sim supported";
		String simType="Nano sim";
		System.out.println(sim);
		System.out.println("Sim type:"+simType);
	}
}

class Samsung_Galaxy_M33 extends Samsung_Galaxy_M14{
	
	 void ram() {
		String ram = "6 GB";
		System.out.println(ram);
	}
	void frontCam() {
		String fmp = "18 MP";
		System.out.println(fmp);
	}
	
}
