package OPPS_Class_Object;

import java.util.Scanner;



//Taking values in another class
/*
class Operators_Main {

	public static void main(String[] args) {
		
		Sub addn = new Sub();
		addn.add();; 
		 
		Sub sub = new Sub();
		sub.subtract();
		 
		Sub mul = new Sub();
		mul.multiply();
		
		Sub cal = new Sub();
		cal.math();
		 
		Sub circleA = new Sub();
		circleA.CircleArea();;
		 
		Sub RobertM = new Sub();
		RobertM.RobertMarks();
		 
		Sub Stu = new Sub();
		Stu.Student();
		 
		Sub SandP = new Sub();
		SandP.SumandProduct();
		 
		Sub SwapWV = new Sub();
		SwapWV.SwapWithoutVariable();
		 
		Sub SwapV = new Sub();
		SwapV.SwapWithVariable();
		  

	}

}

class Sub{
	
	
	public void add() {
		
		double a,b,sum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Addition program:");
		
		System.out.println("Enter the value of a:");
		a=sc.nextDouble();
		
		System.out.println("Enter the value of b:");
		b=sc.nextDouble();
		
		sum=a+b;
		
		System.out.println("Sum of "+a+" and "+b+" is:"+sum);
		
		System.out.println();
		
	}
	
	
	public void subtract() {
		
		double a,b,diff;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Subtraction program:");
		
		System.out.println("Enter the value of a:");
		a=sc.nextDouble();
		
		System.out.println("Enter the value of b:");
		b=sc.nextDouble();
		
		diff=a-b;
		
		System.out.println("Difference of "+a+" and "+b+" is:"+diff);
		
		System.out.println();
		
	}
	
	public void multiply() {
		
		double a,b,mul;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Multiplication program:");
		
		System.out.println("Enter the value of a:");
		a=sc.nextDouble();
		
		System.out.println("Enter the value of b:");
		b=sc.nextDouble();
		
		mul=a*b;
		
		System.out.println("Multiplication of "+a+" and "+b+" is:"+mul);
		
		System.out.println();
		
	}
	
	
	public void math () {
		
		int a;
		double  b,res1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Math calulation program:");
		
		System.out.println("Enter number a:");
		a=sc.nextInt();
		
		System.out.println("Enter number b:");
		b=sc.nextDouble();
		
		res1 = (a+b)/3;
		//System.out.println(res1);
		res1 = (res1%5)*5;
		
		System.out.println("Final result: "+ res1);
		
		System.out.println();
		
	}
	
	
	public void CircleArea() {
		
		double r,a;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Area of circle program:");
		
		System.out.println("Enter radius of circle:");
		r=sc.nextDouble();
		
		a=(22.0/7)*r*r;
		System.out.println("Area of circle of radius "+r+" is: "+a);
		
		System.out.println();
	}

	
	public void RobertMarks() {
		
		int s1, s2, s3;
		double percentage, total;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Robert marks program:");
		
		System.out.println("Enter subject1 marks:");
		s1 = sc.nextInt();
		
		System.out.println("Enter subject2 marks:");
		s2 = sc.nextInt();
		
		System.out.println("Enter subject3 marks:");
		s3 = sc.nextInt();

		total = s1+s2+s3;
		percentage = (total/(100*3))*100;
		System.out.println("Total marks of 3 subjects: "+total);
		System.out.println("Total percentage of 3 subjects: "+percentage);
		
		System.out.println();
		
	}
	
	
	public void Student() {
		
	
		String name, interest, rollno;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Student details program:");
		
		System.out.println("Enter name:");
		name = s.nextLine();
		
		System.out.println("Enter rollno:");
		rollno = s.nextLine();
		
		System.out.println("Enter field of interest:");// This program will not take in interest input if you take rollno as int and use s.nextLine() for taking interest input. It will work if you use s.next()to take interest input.The problem is with the input.nextInt() method; it only reads the int value. So when you continue reading with input.nextLine() you receive the "\n" Enter key. So to skip this you have to add the input.nextLine().
		interest = s.nextLine();
		
		System.out.println("Hey, my name is "+name+" and my roll number is "+rollno+". My field of interest are "+interest+".");
		
		System.out.println();
		
	}
	
	
	public void SumandProduct() {
	
		 int a, b, sum, product;
		  
		 Scanner sc = new Scanner(System.in);
		  
		 System.out.println("Sum and product program:");
		 
		 System.out.println("Enter an integer value of a:");
		 a = sc.nextInt();
		  
		 System.out.println("Enter an integer value of b:"); 
		 b = sc.nextInt();
		  
		 sum = a + b; 
		 product = a * b;
		  
		 System.out.println("Sum of " + a + " and " + b + " is " + sum);
		 System.out.println("Product of " + a + " and " + b + " is " + product);
		 
		 System.out.println();
		 

	}
	
	
	
	public  void SwapWithoutVariable() {
	
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Swap Without Variable program:");
		
		System.out.println("Enter number a:");
		a=sc.nextInt();
		
		System.out.println("Enter number b:");
		b=sc.nextInt();
		
		System.out.println("Before swapping, the values of a and b respectively are: "+a+" and "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		
		System.out.println();

	}
	
	
	
	
	public void SwapWithVariable() {
	
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Swap with Variable program:");
		
		System.out.println("Enter number a:");
		a=sc.nextInt();
		
		System.out.println("Enter number b:");
		b=sc.nextInt();
		
		System.out.println("Before swapping, the values of a and b respectively are: "+a+" and "+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		
		System.out.println();
		
	}


	
}
*/





//Taking values in main method with scanner
/*
class Operators_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Addition program:");

		Sub addn = new Sub();
		
		System.out.println("Enter value of a:");
		addn.a=sc.nextInt();
		System.out.println("Enter value of b:");
		addn.b=sc.nextInt();
		
		addn.add();
		
		
		System.out.println("Subtraction program:");
		
		Sub sub = new Sub();
		
		System.out.println("Enter value of a:");
		sub.a=sc.nextInt();
		System.out.println("Enter value of b:");
		sub.b=sc.nextInt();
		
		sub.subtract();
		
		
		System.out.println("Multiplication program:"); 
		
		Sub mul = new Sub();
		
		System.out.println("Enter value of a:");
		mul.a=sc.nextInt();
		System.out.println("Enter value of b:");
		mul.b=sc.nextInt();
		
		mul.multiply();
		
		
		System.out.println("Math calulation program:");
		
		Sub cal = new Sub();
		
		System.out.println("Enter value of a:");
		cal.a=sc.nextInt();
		System.out.println("Enter value of b:");
		cal.b=sc.nextInt();
		
		cal.math();
		
		
		System.out.println("Area of circle program:");
		
		Sub circleA = new Sub();
		
		System.out.println("Enter radius of circle:");
		circleA.r=sc.nextDouble();
		
		circleA.CircleArea();
		
		
		
		System.out.println("Robert marks program:");
		Sub RobertM = new Sub();
		
		System.out.println("Enter subject1 marks:");
		RobertM.s1 = sc.nextInt();
		
		System.out.println("Enter subject2 marks:");
		RobertM.s2 = sc.nextInt();
		
		System.out.println("Enter subject3 marks:");
		RobertM.s3 = sc.nextInt();

		RobertM.RobertMarks();
		
		
		
		System.out.println("Student details program:"); 
		
		Sub Stu = new Sub();
		
		System.out.println("Enter name:");
		Stu.name = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter rollno:");
		Stu.rollno = sc.nextLine();
		
		System.out.println("Enter field of interest:");// This program will not take in interest input if you take rollno as int and use s.nextLine() for taking interest input. It will work if you use s.next()to take interest input.The problem is with the input.nextInt() method; it only reads the int value. So when you continue reading with input.nextLine() you receive the "\n" Enter key. So to skip this you have to add the input.nextLine().
		Stu.interest = sc.nextLine();
		
		Stu.Student();
		
		
		
		
		System.out.println("Sum and product program:");
		Sub SandP = new Sub();
		
		 System.out.println("Enter an integer value of a:");
		 SandP.a = sc.nextDouble();
		  
		 System.out.println("Enter an integer value of b:"); 
		 SandP.b = sc.nextDouble();
		
		 SandP.SumandProduct();
		
		
		
		
		
		System.out.println("Swap Without Variable program:"); 
		Sub SwapWV = new Sub();
		
		System.out.println("Enter number a:");
		SwapWV.a=sc.nextInt();
		
		System.out.println("Enter number b:");
		SwapWV.b=sc.nextInt();
		
		SwapWV.SwapWithoutVariable();
		 
		
		
		System.out.println("Swap with Variable program:");
		Sub SwapV = new Sub();

		System.out.println("Enter number a:");
		SwapV.a=sc.nextInt();
		
		System.out.println("Enter number b:");
		SwapV.b=sc.nextInt();
		
		SwapV.SwapWithVariable();
		  

	}

}

class Sub{
	
	double a,b,sum;
	public void add() {
		
		
		sum=a+b;
		
		System.out.println("Sum of "+a+" and "+b+" is:"+sum);
		
		System.out.println();
		
	}
	
	double diff;
	public void subtract() {
		
		
		
		diff=a-b;
		
		System.out.println("Difference of "+a+" and "+b+" is:"+diff);
		
		System.out.println();
		
	}
	
	double mul;
	public void multiply() {
		

		mul=a*b;
		
		System.out.println("Multiplication of "+a+" and "+b+" is:"+mul);
		
		System.out.println();
		
	}
	
	double  res1;
	public void math () {
		
		res1 = (a+b)/3;
		//System.out.println(res1);
		res1 = (res1%5)*5;
		
		System.out.println("Final result: "+ res1);
		
		System.out.println();
		
	}
	
	double r,ar;
	public void CircleArea() {
		
		ar=(22.0/7)*r*r;
		System.out.println("Area of circle of radius "+r+" is: "+ar);
		
		System.out.println();
	}

	
	
	int s1, s2, s3;
	double percentage, total;
	public void RobertMarks() {
		
		

		
		total = s1+s2+s3;
		percentage = (total/(100*3))*100;
		System.out.println("Total marks of 3 subjects: "+total);
		System.out.println("Total percentage of 3 subjects: "+percentage);
		
		System.out.println();
		
	}
	
	String name, interest, rollno;
	public void Student() {
		
		System.out.println("Hey, my name is "+name+" and my roll number is "+rollno+". My field of interest are "+interest+".");
		
		System.out.println();
		
	}
	
	double sumn, product;
	public void SumandProduct() {
	
		  
		 sumn = a + b; 
		 product = a * b;
		  
		 System.out.println("Sum of " + a + " and " + b + " is " + sumn);
		 System.out.println("Product of " + a + " and " + b + " is " + product);
		 
		 System.out.println();
		 

	}
	
	
	
	public  void SwapWithoutVariable() {
	

		System.out.println("Before swapping, the values of a and b respectively are: "+a+" and "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		
		System.out.println();

	}
	
	
	
	double c;
	public void SwapWithVariable() {
	
		System.out.println("Before swapping, the values of a and b respectively are: "+a+" and "+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		
		System.out.println();
		
	}


	
}
*/



//Taking values in main method and without scanner function

class SubO{
	
	double a,b,sum;
	public void add() {
		
		
		sum=a+b;
		
		System.out.println("Sum of "+a+" and "+b+" is:"+sum);
		
		System.out.println();
		
	}
	
	
	public void subtract() {
		
		
		double diff=a-b;
		
		System.out.println("Difference of "+a+" and "+b+" is:"+diff);
		
		System.out.println();
		
	}
	
	
	public void multiply() {
		

		double mul=a*b;
		
		System.out.println("Multiplication of "+a+" and "+b+" is:"+mul);
		
		System.out.println();
		
	}
	
	
	public void math () {
		
		double res1 = (a+b)/3;
		//System.out.println(res1);
		res1 = (res1%5)*5;
		
		System.out.println("Final result: "+ res1);
		
		System.out.println();
		
	}
	
	double r;
	public void CircleArea() {
		
		double ar=(22.0/7)*r*r;
		System.out.println("Area of circle of radius "+r+" is: "+ar);
		
		System.out.println();
	}

	
	
	int s1, s2, s3;
	
	public void RobertMarks() {
		
		double percentage, total;
		total = s1+s2+s3;
		percentage = (total/(100*3))*100;
		System.out.println("Total marks of 3 subjects: "+total);
		System.out.println("Total percentage of 3 subjects: "+percentage);
		
		System.out.println();
		
	}
	
	String name, interest, rollno;
	public void Student() {
		
		System.out.println("Hey, my name is "+name+" and my roll number is "+rollno+". My field of interest is "+interest+".");
		
		System.out.println();
		
	}
	
	
	public void SumandProduct() {
	
		double sumn, product;
		 sumn = a + b; 
		 product = a * b;
		  
		 System.out.println("Sum of " + a + " and " + b + " is " + sumn);
		 System.out.println("Product of " + a + " and " + b + " is " + product);
		 
		 System.out.println();
		 

	}
	
	
	
	public  void SwapWithoutVariable() {
	

		System.out.println("Before swapping, the values of a and b respectively are: "+a+" and "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		
		System.out.println();

	}
	
	
	
	
	public void SwapWithVariable() {
	
		double c;
		
		System.out.println("Before swapping, the values of a and b respectively are: "+a+" and "+b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After swapping, the values of a and b respectively are: "+a+" and "+b);
		
		System.out.println();
		
	}


	
}





class Operators_Main {

	/*
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Addition program:");

		Sub addn = new Sub();
		
		addn.a=3;
		addn.b=2;
		
		addn.add();
		
		
		System.out.println("Subtraction program:");
		
		Sub sub = new Sub();
		
		sub.a=3;
		sub.b=2;
		
		sub.subtract();
		
		
		System.out.println("Multiplication program:"); 
		
		Sub mul = new Sub();
		
		mul.a=3;
		mul.b=2;
		
		mul.multiply();
		
		
		System.out.println("Math calulation program:");
		
		Sub cal = new Sub();
		
		cal.a=2;
		cal.b=3;
		
		cal.math();
		
		
		System.out.println("Area of circle program:");
		
		Sub circleA = new Sub();
		
		circleA.r=2;
		
		circleA.CircleArea();
		
		
		
		System.out.println("Robert marks program:");
		Sub RobertM = new Sub();
		
		RobertM.s1 = 90;
		RobertM.s2 = 80;
		RobertM.s3 = 90;

		RobertM.RobertMarks();
		
		
		
		System.out.println("Student details program:"); 
		
		Sub Stu = new Sub();
		

		Stu.name = "Vas";
		Stu.rollno = "123a30";
		Stu.interest = "IT";
		
		Stu.Student();
		
		
		
		
		System.out.println("Sum and product program:");
		Sub SandP = new Sub();
		
		 SandP.a = 3; 
		 SandP.b = 2;
		
		 SandP.SumandProduct();
		
		
		
		
		
		System.out.println("Swap Without Variable program:"); 
		Sub SwapWV = new Sub();
		
		SwapWV.a=2;
		SwapWV.b=3;
		
		SwapWV.SwapWithoutVariable();
		 
		
		
		System.out.println("Swap with Variable program:");
		Sub SwapV = new Sub();

		SwapV.a=2;
		SwapV.b=3;
		
		SwapV.SwapWithVariable();
		  

	}
	*/
	
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Addition program:");

		SubO obj = new SubO();
		
		obj.a=3;
		obj.b=2;
		
		obj.add();
		
		
		System.out.println("Subtraction program:");
		
		
		
		obj.a=3;
		obj.b=2;
		
		obj.subtract();
		
		
		System.out.println("Multiplication program:"); 
		
		
		
		obj.a=3;
		obj.b=2;
		
		obj.multiply();
		
		
		System.out.println("Math calulation program:");
		
		
		
		obj.a=2;
		obj.b=3;
		
		obj.math();
		
		
		System.out.println("Area of circle program:");
		
		
		
		obj.r=2;
		
		obj.CircleArea();
		
		
		
		System.out.println("Robert marks program:");
	
		
		obj.s1 = 90;
		obj.s2 = 80;
		obj.s3 = 90;

		obj.RobertMarks();
		
		
		
		System.out.println("Student details program:"); 
		

		obj.name = "Vas";
		obj.rollno = "123a30";
		obj.interest = "IT";
		
		obj.Student();
		

		
		System.out.println("Sum and product program:");
		
		
		obj.a = 3; 
		obj.b = 2;
		
		obj.SumandProduct();
		
		
		

		System.out.println("Swap Without Variable program:"); 
		
		
		obj.a=2;
		obj.b=3;
		
		obj.SwapWithoutVariable();
		 
		
		
		System.out.println("Swap with Variable program:");
		

		obj.a=2;
		obj.b=3;
		
		obj.SwapWithVariable();
		  

	}

}

