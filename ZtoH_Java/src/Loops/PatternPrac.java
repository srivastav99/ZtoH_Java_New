package Loops;

import java.security.PublicKey;
import java.util.Scanner;

public class PatternPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        // Create a new Scanner object
	       /*
			Scanner scanner = new Scanner(System.in);

	        // Get the number of rows from the user
	        System.out.println("Enter the number of rows needed to print the pattern ");

	        int rows = scanner.nextInt();
	        System.out.println("## Printing the pattern ##");
	        
	        // Print i number of stars
	        for (int i=1; i<=rows; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	            	if(i%2==0) {
	            	if(j%2==0) {
	                System.out.print(" *");
	            	}
	            }
	            	else {
	            		if(j%2==1) {
			                System.out.print("* ");
			            	}
	            }
	            }
	            for (int k = i*2; k <= rows*2-1-2; k++)
	            {
	                System.out.print(" ");
	            }
	            for (int l = 1; l <= i; l++)
	            {
	            	if(i==rows && i==l) {
	            		break;
	            	}
	            	if(i%2==0) {
		            	if(l%2==0) {
		                System.out.print(" *");
		            	}
		            }
		            	else {
		            		if(l%2==1) {

				                System.out.print("* ");
				            	
		            			
		            		}
		            		
		            }
	            }
	            System.out.println();
	        }
	        
	        for (int i=1; i<=rows-1; i++)
	        {
	            for (int j = rows-1; j >= i; j--)
	            {
	            	if(i%2==0) {
		            	if(j%2==0) {
		                System.out.print(" *");
		            	}
		            }
		            	else {
		            		if(j%2==1) {
				                System.out.print("* ");
				            	}
		            }
	            }
	            for (int k = 1; k <= i*2-2; k++)
	            {
	                System.out.print(" ");
	            }
	            for (int l = rows-1; l >= i; l--)
	            {
	            	if(i%2==0) {
		            	if(l%2==0) {
		                System.out.print(" *");
		            	}
		            }
		            	else {
		            		if(l%2==1) {
				                System.out.print("* ");
				            	}
		            		
		            }
	            }
	            
	            System.out.println();
	        }
	        scanner.close();
	*/
		
		
		/*
		Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of lines needed to print the pattern ");

        int n = scanner.nextInt();
       
        
        // Print i number of stars
        for (int i=1; i<=n/2+1; i++)
        {
            for (int j = 1; j <= i; j++)
            {
            	if(i%2==0) {
            		if(j%2==0) {
            			System.out.print(" *");
            		}
            	}
            	else {
            		if(j%2==1) {
            			System.out.print("* ");
		            	}
            	}
            }
            for (int k = i*2; k <= n-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) // To eliminate center line first element.
            {
            	if(i==n/2+1 && i==l) {
            		break;
            	}
            	if(i%2==0) {
	            	if(l%2==0) {
	            		System.out.print(" *");
	            	}
	            }
	            else {
	            	if(l%2==1) {

			            System.out.print("* ");
	
	            	}
	            		
	            }
            }
            System.out.println();
        }
        
        for (int i=1; i<=(n/2+1)-1; i++)
        {
            for (int j = (n/2+1)-1; j >= i; j--)
            {
            	if((n/2+1)%2==0)  // in second half if n/2+1 is odd then first line of second half is even but since we are stating loop with i=1, it will be taken as odd and thus instead of printing " *" we print "* " and thus it is required to keep this if-else in second hald. 
            	{
            		if(i%2==0) {
            			if(j%2==0) {
            				System.out.print(" *");
            			}	
            		}
            		else {
            			if(j%2==1) {
			                System.out.print("* ");
			            	}
            		}
            	}
            	else {
            		
            		if(i%2==0) {
    	            	if(j%2==0) {
    	            		System.out.print("* ");
    	            	}
    	            }
    	            else {
    	            	if(j%2==1) {
    			             System.out.print(" *");
    			            	}
    	            }
            	}
            }
            for (int k = 1; k <= i*2-2; k++)
            {
                System.out.print(" ");
            }
            for (int l = (n/2+1)-1; l >= i; l--)
            {
            	if((n/2+1)%2==0)
            	{
            	
            	if(i%2==0) {
	            	if(l%2==0) {
	                System.out.print(" *");
	            	}
	            }
	            	else {
	            		if(l%2==1) {
			                System.out.print("* ");
			            	}
	            		
	            }
            	}
            	else {
            		if(i%2==0) {
    	            	if(l%2==0) {
    	                System.out.print("* ");
    	            	}
    	            }
    	            	else {
    	            		if(l%2==1) {
    			                System.out.print(" *");
    			            	}
    	            		
    	            }
            		
            	}
            }
            
            System.out.println();
        }
        scanner.close();
        */
		
	int n=9;	
	for(int r=1;r<=n;r++) {
		for(int c=1;c<=n;c++) {
			if(r+c==n+1 || (r+c)%2==0) {
				
				if((r==1&&r+c==n/2+1) || (r==1&&r+c==n-1) || (r==2&&r+c==n-1) || (r==n-1&&r+c==10) || (r==n&&r+c==10) || (r==n&&r+c==n*2-2)) {
					System.out.print("   ");
			}
			else {
				System.out.print(" * ");
			}
			}
			else {
				System.out.print("   ");
			}
		}
		System.out.println();
	}
	}

}
