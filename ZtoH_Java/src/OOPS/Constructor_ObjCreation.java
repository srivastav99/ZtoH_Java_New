package OOPS;

public class Constructor_ObjCreation {

	public static void main(String[] args) {
		
		

	}
	
	Constructor_ObjCreation(){
		System.out.println("Default constructor of main class");
	}
	
	Constructor_ObjCreation(int a){
		System.out.println("Overloaded constructor of main class");
	}
	
	
}

class Second {
	
	Constructor_ObjCreation o1 = new Constructor_ObjCreation();
	Constructor_ObjCreation o2 = new Constructor_ObjCreation(5);
	
	Second o3 = new Second();
	Second o4 = new Second(2);
	
	
	Second(){
		System.out.println("Default constructor of second class");
	}
	
	Second(int b) {
		System.out.println("Overloaded constructor on second class");
	}
}
