package OOPS_Static;


public class Static_prac {
	int a;
	static int b=50;
	public static void main(String[] args) {
		/*
		Static_prac o = new Static_prac();
		o.add();
		*/
		
		int b=100;
		//static int d = 10;
		//a=50;
		
		
	//	add();
		
		System.out.println(b);
		System.out.println(Static_prac.b);
		
		

	}
	
	void add() {
		int a1=5, a2=5;
		//static int c=10;
		b=100;
		String s1 = "string";
		String s2 = "string";
				
		System.out.print("a1:");
		System.out.println(System.identityHashCode(a1));
		
		System.out.print("a2:");
		System.out.println(System.identityHashCode(a2));
		
		System.out.print("s1:");
		System.out.println(System.identityHashCode(s1));
		
		System.out.print("s2:");
		System.out.println(System.identityHashCode(s2));
		
		
	}
	
	static void add1() {
		int a1=5, a2=5;
		int a=5;
		//static int e=10;
		b=100;
		String s1 = "string";
		String s2 = "string";
				
		System.out.print("a1:");
		System.out.println(System.identityHashCode(a1));
		
		System.out.print("a2:");
		System.out.println(System.identityHashCode(a2));
		
		System.out.print("s1:");
		System.out.println(System.identityHashCode(s1));
		
		System.out.print("s2:");
		System.out.println(System.identityHashCode(s2));
		
	}

}
