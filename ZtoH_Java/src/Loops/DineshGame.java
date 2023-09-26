package Loops;

import java.util.Scanner;

public class DineshGame {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
        int hour,minute;
    
        hour=(str.charAt(0)-'0')*10 + str.charAt(1)-'0';
        minute=(str.charAt(3)-'0')*10 + str.charAt(4)-'0';
        
        
      
        int res=0;
        while(hour%10 != minute/10 || hour/10 != minute%10)
          {
                   minute++;
                   if(minute==60)
                   {
                       minute=0;
                       hour++;
                   }
                   if(hour==24)
                        hour=0;
                  res++;
          } 
           System.out.println(res);
	
		/*
		char a='4',b='2';
		char c=a-b; //does not accepts to store the value in c as the resultant is a int and c is char.Here we are getting integer char-integer char as int.
		int d=a-b;  //accepts to store the value in d as the resultant is a int and d is also int.Here we are getting integer char-integer char as int.
		
		 */
         
	}

}
