package Interface;

import OPPS_AccessModifier.Public_Add;

//Interface declaration: by first user  
interface Drawable{  
void draw();  
}  

//Implementation: by second user  
class Rectangle implements Drawable{  
	public void draw() {
		System.out.println("drawing rectangle");
	}
}  

class Circle implements Drawable{  
	public void draw() {
		
		System.out.println("drawing circle");
	}
	
}
 
//Using interface: by third user  
class TestInterface {
	public static void main(String args[]) {
		Drawable d = new Circle();// In real scenario, object is provided by method e.g. getDrawable()
		d.draw(); //executes draw method of Circle class since we are calling it using Circle class object.
		
		Drawable d1 = new Rectangle();
		d1.draw(); //executes draw method of Rectangle class since we are calling it using Rectangle class object.
		
	  //Drawable d2 = new Drawable();// Gives error as interface promotes security but by creating a object we are making everything inside Circle and Rectangle class accessible which should not be allowed and thus java does not allow us to create an object of interface, we can only create object of a class.
	}
}
