package OPPS_Class_Object;


class SubC {

	int classesHeld, service, num, unitCost = 100,age;
	double classesAttended, salary, marks, quantity, totalPrice, finalCost;
	
	public void attendance() {
		// TODO Auto-generated method stub
		
		double percentage ;
	
		percentage = (classesAttended/classesHeld)*100; //or take both int and write (classAttended*100/classHeld)
		
		if(percentage < 75) {
			System.out.println("The student is not to be allowed for exam.");
		}
		else {
			System.out.println("The student is to be allowed for exam.");
		}
		
		
	}
	
	
	public void Bonus() {
		
	
		double bonus;
		
		
		if(service > 5) {
			//bonus = salary*(5.0/100);//Here one of 5.0 and 100.0 is to be given other wise it will consider as int and the resultant will be 0.
			//or
			bonus = salary*5/100;
			System.out.println("Net bonus amount(5%) = "+bonus);
		}
		else {
			System.out.println("Bonus is applicable for employees who have completed more than 5 years of service.");
		}
	}
	
	
	public void EvenOdd() {
		
		if(num%2==0) {
			System.out.println("The given number "+num+" is a even number.");
		}
		else {
			System.out.println("The given number "+num+" is a odd number.");
		}
	}
	
	
	
	public void GradingSystem() {
		

		if(marks >=0 && marks < 25) {
			
			System.out.println("Grade of the student is F.");
		}
		else if (marks >= 25 && marks < 45) {
			System.out.println("Grade of the student is E.");
			
		}
		else if (marks >= 45 && marks < 50) {
			System.out.println("Grade of the student is D.");
			
		}
		else if (marks >= 50 && marks < 60) {
			System.out.println("Grade of the student is C.");
			
		}
		else if (marks >= 60 && marks < 80) {
			System.out.println("Grade of the student is B.");
			
		}
		else if(marks >=80 && marks <= 100) {
			System.out.println("Grade of the student is A.");
		}
		else {
			System.out.println("Marks entered is invalid.");
			System.out.println("Entered value of marks:"+marks);
		}

	}
	
	
	
	public void ShopDiscountAmount() {

		totalPrice = quantity*unitCost;
		
		if(totalPrice < 1000) {
			
			System.out.println("The total price for the purchase is:"+totalPrice);
		}
		else if (totalPrice >= 1000 && totalPrice < 5000) {
			
			finalCost = totalPrice - totalPrice*10/100;
			System.out.println("Since the purchase is equal to or above 1000 and below 5000,a discount of 10 percentage is applied. The final price for the purchase is:"+finalCost);
			
			
		}
		else if (totalPrice >= 5000 && totalPrice < 10000) {
			
			finalCost = totalPrice - totalPrice*30/100;
			System.out.println("Since the purchase is equal to or above 5000 and below 10000,a discount of 30 percentage is applied. The final price for the purchase is:"+finalCost);
			
		}
		else if (totalPrice >= 10000 && totalPrice < 20000) {
			
			finalCost = totalPrice - totalPrice*50/100;
			System.out.println("Since the purchase is equal to or above 10000 and below 20000,a discount of 50 percentage is applied. The final price for the purchase is:"+finalCost);
			
		}
		
		else {
			
			finalCost = totalPrice - totalPrice*70/100;
			System.out.println("Since the purchase is equal to or above 20000,a discount of 70 percentage is applied. The final price for the purchase is:"+finalCost);
		}

	}
	
	
	
	public void Vote() {
		
		if(age>=18) {
			System.out.println("The person is eligible to vote.");
		}
		else {
			System.out.println("The person is not eligible to vote.");
		}
	}

}

	
	
	
class Conditional_ifElse{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubC obj = new SubC();
		
		System.out.println("Student attendance program:");
		
		obj.classesHeld=100;
		obj.classesAttended=90;
		obj.attendance();
		
		System.out.println();
		
		System.out.println("Bonus calculation program:");
		
		obj.salary=10000;
		obj.service=6;
		obj.Bonus();
		
		System.out.println();
		
		System.out.println("Even or odd program:");
		
		obj.num=24;
		obj.EvenOdd();
		
		System.out.println();
		
		System.out.println("Grading System program:");
		
		obj.marks=80;
		obj.GradingSystem();
		
		System.out.println();
		
		System.out.println("Shop Discount Amount program:");
		
		obj.quantity=25;
		obj.ShopDiscountAmount();
		
		System.out.println();
		
		System.out.println("Vote program:");
		
		obj.age=21;
		obj.Vote();
		
	}

}
