package Loops;

import java.util.Scanner;



public class PatternButterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many lines you want to print:");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
		
			if(i==1 || i==n) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			}
			
			if(i==n/2-1 || i==n-1) {
			for(int j=1;j<=n;j++) {
				if(j==2||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			}
			
			if(i==n/2 || i==n-2) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n || j==3 || j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			}
			
			if(i==n/2+1) {
			for(int j=1;j<=n;j++) {
				if(j==2||j==n/2+1 || j==6 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			}
			
			
		
			
			System.out.println();
		}
		*/
		
		//My code
		/*
		Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter odd number of lines needed to print the pattern: ");

        int n = sc.nextInt();
       
        
        // first half above portion till n/2+1
        for (int i=1; i<=(n/2)+1; i++)
        {
        	// printing above left quarter
            for (int j = 1; j <= i; j++)
            {
            	if(i%2==0) { //condition to check for even lines
            		if(j%2==0) { //condition to check for even places as in this pattern in even lines stars are to be printed at even places and same applies for odd lines.
            			System.out.print(" *");
            		}
            	}
            	else {  //condition to check for odd lines
            		if(j%2==1) {  //condition to check for odd places to print stars
            			System.out.print("* ");
		            	}
            	}
            }
            
            //for spaces in between
            for (int k = i*2; k <= n-2; k++)
            {
                System.out.print(" ");
            }
            
            // printing above right quarter
            for (int j = 1; j <= i; j++) 
            {
            	if(i==(n/2)+1 && i==j) { // To eliminate center line first element otherwise a extra star will be printed.In order to start the right half with two stars (vertically) this is needed.
            		break;
            	}
            	if(i%2==0) {   //condition to check for even lines
	            	if(j%2==0) {  //condition to check for even spaces to print stars
	            		System.out.print(" *");
	            	}
	            }
	            else {    //condition to check for odd lines
	            	if(j%2==1) {  //condition to check for odd places to print stars

			            System.out.print("* ");
	
	            	}
	            		
	            }
            }
            System.out.println();
        }
        
        
        //second half below portion (from middle+1 to end)
        for (int i=1; i<=(n/2+1)-1; i++)
        {
        	// printing below left quarter
            for (int j = (n/2+1)-1; j >= i; j--)
            {
            	if((n/2+1)%2==0)  //condition to check starting line is even or odd, in second half if n/2+1 is odd then first line of second half is even but since we are stating loop with i=1, it will be taken as odd instead of even and thus instead of printing " *" as in even  we print "* " as in odd and thus it is required to keep this if-else in second half. 
            	{
            		if(i%2==0) {   //condition to check for even lines
            			if(j%2==0) {   //condition to check for even spaces to print stars
            				System.out.print(" *");
            			}	
            		}
            		else {    //condition to check for odd lines
            			if(j%2==1) {     //condition to check for odd places to print stars
			                System.out.print("* ");
			            	}
            		}
            	}
            	else { //means odd starting line and thus we have to swap print statement - even with odd and odd with even as done below  
            		
            		if(i%2==0) {    //condition to check for even lines
    	            	if(j%2==0) {    //condition to check for even spaces to print stars
    	            		System.out.print("* ");
    	            	}
    	            }
    	            else {     //condition to check for odd lines
    	            	if(j%2==1) {    //condition to check for odd places to print stars
    			             System.out.print(" *");
    			            	}
    	            }
            	}
            }
            
            //for spaces in between
            for (int k = 1; k <= i*2-2; k++)
            {
                System.out.print(" ");
            }
            
         // printing below right quarter
            for (int j = (n/2+1)-1; j >= i; j--)
            {
            	if((n/2+1)%2==0)  //condition to check starting line is even or odd, in second half if n/2+1 is odd then first line of second half is even but since we are stating loop with i=1, it will be taken as odd and thus instead of printing " *" we print "* " and thus it is required to keep this if-else in second half.
            	{
            	
            		if(i%2==0) {    //condition to check for even lines
            			if(j%2==0) {    //condition to check for even spaces to print stars
            				System.out.print(" *");
            			}
            		}
	            	else {     //condition to check for odd lines
	            		if(j%2==1) {     //condition to check for odd places to print stars
			                System.out.print("* ");
			            	}
	            		
	            		}
            	}
            	else {   //means odd starting line and thus we have to swap print statement - even with odd and odd with even as done below
            		if(i%2==0) {     //condition to check for even lines
    	            	if(j%2==0) {    //condition to check for even spaces to print stars
    	            		System.out.print("* ");
    	            		}
    	            }
    	            else {     //condition to check for odd line
    	            	if(j%2==1) {     //condition to check for odd places to print stars
    			               System.out.print(" *");
    			            }
    	            		
    	            }
            		
            	}
            }
            
            System.out.println();
        }
        
        */
        
		// other code
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
		int num=a/2+1;
		//Top left triangle
		for(int i=1;i<=num;i++)
		{
			for(int st=1;st<=i;st++)
			{
				if(st==num);
				else {
					if((i+st)%2==0)
						System.out.print(" *");
					else
						System.out.print("  ");
				}
			}
			for(int sp=i+1;sp<2*num-i;sp++)
			{
				System.out.print("  ");
			}
			//Top right triangle
			for(int st=1;st<=i;st++)
			{
				if(st%2==0)
				System.out.print("  ");
				else
					System.out.print(" *");
			}
			System.out.println();
		}
		//Bottom left triangle
		for(int i=2;i<=num;i++)
		{
			for(int st=num;st>=i;st--)
			{
				if((i+st)%2==0)
					System.out.print(" *");
					else
						System.out.print("  ");
			}
			for(int sp=1;sp<=2*i-3;sp++)
			{
				System.out.print("  ");
			}
			for(int st=num;st>=i;st--)
			{
				if(num%2==1) {
				if(st%2==0)
				System.out.print("  ");
				else
					System.out.print(" *");
			}
				else
					{
					if(st%2==0)
						System.out.print(" *");
						else
							System.out.print("  ");
					}
					}
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		// trail code
		/* 
		
		Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the odd number of lines needed to print the pattern: ");

        int n = scanner.nextInt();
       
        
        // first half above portion till n/2+1
        for (int i=1; i<=n/2+1; i++)
        {
        	// printing above left quarter
            for (int j = 1; j <= i; j++)
            {
            	if(i%2==0) { //condition to check for even lines
            		if(j%2==0) { //condition to check for even places as in this pattern in even lines stars are to be printed at even places and same applies for odd lines.
            			System.out.print("  * ");
            		}
            	}
            	else {
            		if(j%2==1) {
            			System.out.print("*   ");
		            	}
            	}
            }
            
            //for spaces in between
            for (int k =(((2*(n/2+1))-(i-1))-2); k >= 1; k--)
            {
                System.out.print(" ");
            }
            
            // printing above right quarter
            for (int j = 1; j <= i; j++) 
            {
            	if(i==n/2+1 && i==j) { // To eliminate center line first element otherwise a extra star will be printed.In order to start the right half with two stars (vertically) this is needed.
            		break;
            	}
            	if(i%2==0) {
	            	if(j%2==0) {
	            		System.out.print("* ");
	            	}
	            }
	            else {
	            	if(j%2==1) {

			            System.out.print("* ");
	
	            	}
	            		
	            }
            }
            System.out.println();
        }
        
        
        //second half below portion (from middle+1 to end)
        for (int i=1; i<=(n/2+1)-1; i++)
        {
        	// printing below left quarter
            for (int j = (n/2+1)-1; j >= i; j--)
            {
            	if((n/2+1)%2==0)  // in second half if n/2+1 is odd then first line of second half is even but since we are stating loop with i=1, it will be taken as odd and thus instead of printing " *" we print "* " and thus it is required to keep this if-else in second half. 
            	{
            		if(i%2==0) {
            			if(j%2==0) {
            				System.out.print("  * ");
            			}	
            		}
            		else {
            			if(j%2==1) {
			                System.out.print("*   ");
			            	}
            		}
            	}
            	else {
            		
            		if(i%2==0) {
    	            	if(j%2==0) {
    	            		System.out.print("*   ");
    	            	}
    	            }
    	            else {
    	            	if(j%2==1) {
    			             System.out.print("  * ");
    			            	}
    	            }
            	}
            }
            
            //for spaces in between
            for (int k = 1; k <= 2*(i*2-2); k++)
            {
                System.out.print(" ");
            }
            
         // printing below right quarter
            for (int j = (n/2+1)-1; j >= i; j--)
            {
            	if((n/2+1)%2==0)  // in second half if n/2+1 is odd then first line of second half is even but since we are stating loop with i=1, it will be taken as odd and thus instead of printing " *" we print "* " and thus it is required to keep this if-else in second half.
            	{
            	
            	if(i%2==0) {
	            	if(j%2==0) {
	                System.out.print("  * ");
	            	}
	            }
	            	else {
	            		if(j%2==1) {
			                System.out.print("*   ");
			            	}
	            		
	            }
            	}
            	else {
            		if(i%2==0) {
    	            	if(j%2==0) {
    	                System.out.print("*   ");
    	            	}
    	            }
    	            	else {
    	            		if(j%2==1) {
    			                System.out.print("  * ");
    			            	}
    	            		
    	            }
            		
            	}
            }
            
            System.out.println();
        }
        
        */
	}
	

}
