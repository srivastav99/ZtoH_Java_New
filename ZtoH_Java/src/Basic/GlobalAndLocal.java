package Basic;

public class GlobalAndLocal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		//x can be used here as it is a global variable here or local to main function.
		x=x+2;
		for(int i=0;i<5;i++) {
			//x can be used here also as it is a global variable here or local to main function.
			x=3;
			int y = 4;
			//y can be used here as it is local to for loop.
			y=y+4;
			i=2;
		}
		
		//y cannot be used here as it is local to for loop.
		//i cannot be used here as it is local to for loop.
		//x can be used here as it is global variable here or local to main function.
		x=7;
		
		
	}
	//x cannot be used here as it is local to main method.
	//y cannot be used here as it is local to for loop.
	
	
	
}
