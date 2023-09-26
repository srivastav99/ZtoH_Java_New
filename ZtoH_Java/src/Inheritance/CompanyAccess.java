package Inheritance;

public class CompanyAccess {

	public static void main(String[] args) {
		
		System.out.println("Employee has:");
		Employee emp=new Employee();
		emp.print();
		System.out.println();
		
		System.out.println("Manager has:");
		Manager manager=new Manager();
		manager.print();
		System.out.println();
		
		System.out.println("Management has:");
		Management management=new Management();
		management.print();
		System.out.println();
		
		System.out.println("CEO has:");
		CEO ceo=new CEO();
		ceo.print();
		
	}

}
class Employee{
	String str1="access to employees portal.";
	void print(){
		System.out.println(str1);
	}
}
class Manager extends Employee{
	String str2="access to managers portal.";
	void print(){
		System.out.println(str1+"\n"+str2);
		
	}
}
class Management extends Manager{
	String str3="access to management portal.";
	void print(){
		System.out.println(str1+"\n"+str2+"\n"+str3);
		
	}
}
class  CEO extends Management{
	String str4="access to CEO account.";
	void print(){
		System.out.println(str1+"\n"+str2+"\n"+str3+"\n"+str4);
		
	}
}
