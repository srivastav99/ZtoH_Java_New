 package OOPS_AccessModifier1;

import OPPS_AccessModifier.ProtectedClass;

public class ProtectedAnotherPackage extends ProtectedClass{

	public static void main(String[] args) {
		
		ProtectedAnotherPackage object = new ProtectedAnotherPackage();
		object.printAnotherPackage();
	}
	
	void printAnotherPackage() {
		
		ProtectedAnotherPackage obj = new ProtectedAnotherPackage();
		obj.printMain();
		System.out.println("Method of another package, another file,another class, non-inherited");
	}
	 

}


