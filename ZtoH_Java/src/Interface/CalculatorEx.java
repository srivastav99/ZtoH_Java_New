package Interface;


interface NormalCalcI{
	
	void Add();
	void Sub();
	void Mul();
	void Div();
	
}

interface SciCalcI extends NormalCalcI{
	
	void sin();
	void cos();
	void tan();
	void epowerx();
	void numpowerx();
	

}

interface BusinessCalcI extends SciCalcI{
	
	void SI();
	void CI();
	void avg();
	void percentage();
}


class NormalCalc implements NormalCalcI{
	
	public void Add() {
		System.out.println("Adding");
	}
	
	public void Sub() {
		System.out.println("Subtracting");
	}
	
	public void Mul() {
		System.out.println("Multiplication");
	}
	
	public void Div() {
		System.out.println("Division");
	}
		
}

class SciCalc extends NormalCalc implements SciCalcI{
	
	public void sin() {
		System.out.println("sin function");
	}
	
	public void cos() {
		System.out.println("cos function");
	}
	
	public void tan() {
		System.out.println("tan function");
	}
	
	public void epowerx() {
		System.out.println("e power x");
	}
	
	public void numpowerx() {
		System.out.println("Number power x");
	}
	
	
}

class BusinessCalc extends SciCalc implements BusinessCalcI{
	
	public void SI() {
		System.out.println("Simple interest");
	}
	
	public void CI() {
		System.out.println("Compound interest");
	}
	
	public void avg() {
		System.out.println("Average");
	}
	
	public void percentage() {
		System.out.println("Percentage");
	}
			
}

public class CalculatorEx {

	public static void main(String[] args) {
		
		

	}

}
