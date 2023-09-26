package OPPS_AccessModifier;

public class ProtectedClass {

	public static void main(String[] args) {
		
		ProtectedClass o = new ProtectedClass();
		o.printMain();
		
		Pro1 o1 = new Pro1();
		o1.printSub();
		
		ProtectedAnotherFile o2 = new ProtectedAnotherFile();
		o2.printAnother();
		/*
		ProtectedAnotherPackage1 o3 = new  ProtectedAnotherPackage1();
		o3.printAnotherPackage1();
		
		ProtectedAnotherPackage o4 = new  ProtectedAnotherPackage();
		o4.printAnotherPackage();
		*/
		
	}
	
	protected void printMain(){
		System.out.println("Method of same class,same file");
	}

}

class Pro1 {
	protected void printSub() {
		System.out.println("Method of sub-class, same file.");
	}
}
