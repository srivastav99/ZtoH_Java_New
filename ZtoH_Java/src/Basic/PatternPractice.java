package Basic;

import java.util.Scanner;

public class PatternPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range:");
		n = sc.nextInt();   
		//left half pyramid
		System.out.println("left half pyramid");
		for(int i=1;i<=n;i++) {    //n=5
			
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		} 
		
		System.out.println();
		System.out.println();
		
		
		
		//reverse left half pyramid
		System.out.println("Reverse left half pyramid");
		for(int i=1;i<=n;i++) {   //n=5
			
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		//Right half pyramid
		System.out.println("Right half pyramid");
		for(int i=1;i<=n;i++) {     //n=5
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		//reverse right half pyramid
		System.out.println("Reverse right half pyramid");
		for(int i=1;i<=n;i++) {     //n=4
			
			for(int j=i;j>1;j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j=n;j>=i;j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		//full pyramid
		System.out.println("Full pyramid");
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		//reverse full pyramid
		System.out.println("Reverse full pyramid");
		for(int i=1;i<=n;i++) {     //n=5
			
			for(int j=i;j>1;j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j=n;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		//full pyramid combination of upper and lower pyramid
		System.out.println("full pyramid combination of upper and lower pyramid");
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j>1;j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j=n;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//1,2 in n lines pattern
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i%2==1)
				System.out.print("1 ");
				if(i%2==0) {
					System.out.print("2 ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//number pattern in n by 3(row by column)
		int k=0;
		for(int i=1;i<=n;i++) {
			for(int j=3;j>=1;j--) {
				k++;
				if(k%3!=0)
				System.out.print(k+" ");
				if(k%3==0) {
					System.out.println(k);
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//odd no.of stars pyramid
		System.out.println("odd no.of stars pyramid");
		int m=1;
		for(int i=1;i<=n;i++) {   //n=5
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=m;j++) {  // without m use - for(int j=1;j<=(i*2)-1;j++){
					
				System.out.print("*");
			}
			m=m+2;		
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//odd number pyramid with same number in a row
		System.out.println("odd number pyramid with same number in a row");
		int s=1;
		for(int i=1;i<=n;i++) {   //n=5
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=s;j++) {       // without m use - for(int j=1;j<=(i*2)-1;j++){
					
				System.out.print(i);
			}
			s=s+2;		
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//5 by 3 pattern with stars
		System.out.println("5 by 3 pattern with stars");
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//Left half pyramid with numbers
		System.out.println("Left half pyramid with numbers");
		int d=1;
		for(int i=1;i<=n;i++) {    //n=4
			
			for(int j=i;j>=1;j--) {
				System.out.print(d);
				d++;
			}
			System.out.println();
		} 
		
		System.out.println();
		System.out.println();
		
		
		
		
		//Even number pyramid with numbers
		System.out.println("Even number pyramid with numbers");
		int p=1;
		int L=0;
		int h=1;
		for(int i=1;i<=n;i++) {   //n=5
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=p;j++) {
				if(j!=L){
					
				System.out.print(h);
				h++;
				}
				else {
					System.out.print(" ");
				}
			}
			p=p+2;
			L=(p/2)+1;
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//Left half pyramid with numbers starting with 1 in every row and incrementing as per row
		
		System.out.println("Left half pyramid with numbers starting with 1 in every row and incrementing as per row");
		for(int i=1;i<=n;i++) {    //n=5
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//Left half pyramid with numbers printing the row number as per row order
		System.out.println("Left half pyramid with numbers printing the row number as per row order");
		for(int i=1;i<=n;i++) {     //n=5
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//Reverse right half pyramid with numbers as per column order
		System.out.println("Reverse left half pyramid with numbers as per column order");
		int v= n;     // n=5  
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>=i;j--) {
				System.out.print(v);
			}
			v--;
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//Reverse right half pyramid with numbers as per column order
		System.out.println("Reverse right half pyramid with numbers as per column order");
		int u=n;      // n=5  
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j>1;j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j=n;j>=i;j--) {
				
				System.out.print(u);
			}
			u--;
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//row increment, 1, decrement pyramid pattern
		System.out.println("row increment, 1, decrement pyramid pattern");
		
		for(int i=1;i<=n;i++) {   //n=5
			
			for(int j=1;j<=n-i;j++) {
				
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//row increment, 1, decrement reverse pyramid pattern
		System.out.println("row increment, 1, decrement reverse pyramid pattern");
		int o=n;     //n=5
		for(int i=1;i<=n;i++) {                    
			                                    
			for(int j=1;j<i;j++) {
				
				System.out.print(" ");
			}
			for(int j=o;j>=1;j--) {
				System.out.print(j);
			}
			
			for(int j=2;j<=o;j++) {
				System.out.print(j);
			}
			o--;
			System.out.println();
		}
		

		System.out.println();
		System.out.println();
		
		
		
		
		//full pyramid combined
		System.out.println("Full pyramid combined");
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i=1;i<=n-1;i++) {
			
			for(int j=i;j>=1;j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j=n-1;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		
		//row increment, decrement pyramid pattern
		System.out.println("row increment, decrement pyramid pattern");
			int g=1;	
			for(int i=1;i<=n;i++) {   //n=5
				
				for(int j=1;j<=n-i;j++) {
					
					System.out.print(" ");
				}
				for(g=1;g<=i;g++) {
					System.out.print(g);
				}
				
				for(g=g-1;g>1;g--) {
					System.out.print(g-1);
				}
				System.out.println();
			}
	}

}
