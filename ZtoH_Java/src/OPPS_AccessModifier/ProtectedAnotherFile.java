package OPPS_AccessModifier;

public class ProtectedAnotherFile extends ProtectedClass {

	public static void main(String[] args) {
		
		ProtectedAnotherFile o = new ProtectedAnotherFile();
		o.printAnother();
	}
	
	 protected void printAnother() {
		 ProtectedAnotherFile obj = new ProtectedAnotherFile();
		 obj.printMain();
		 
		System.out.println("Method of another file,another class.");
	}

}

