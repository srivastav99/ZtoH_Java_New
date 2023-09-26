package OOPS_AccessModifier1;

class Default_Subtract1 {

	public void sub2num(){
		int a=2,b=3;
		int diff=a-b;
		System.out.println("Default class, public method(sub2num) of another class another file of another package result:"+diff);
		
	}
	
	void sub3num(){
		int a=2,b=3,c=4;
		int diff=a-b-c;
		System.out.println("Default class, Default method(sub3num) of another class another file of another package result:"+diff);
		
	}
	
	private void sub4num(){
		int a=2,b=3,c=4,d=5;
		int diff=a-b-c-d;
		System.out.println("Default class, private method(sub4num) of another class another file of another package result:"+diff);
		
	}
}

