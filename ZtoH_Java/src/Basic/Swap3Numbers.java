package Basic;

import javax.swing.text.rtf.RTFEditorKit;

public class Swap3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=3,d;
		
		System.out.println("Before swap:\na:"+a+"\nb:"+b+"\nc:"+c);
		//With 4rt variable
		/*
		d=a;
		a=b;
		b=c;
		c=d;
		*/
		//Without 4rt variable
		
		a=a+b+c;
		b=a-(b+c);//a+b+c-b-c = a
		c=a-(b+c);//a+b+c-a-c = b
		a=a-(b+c);//a+b+c-a-b = c
	    
		
		System.out.println("After swap:\na:"+a+"\nb:"+b+"\nc:"+c);
		
	
	}

}
