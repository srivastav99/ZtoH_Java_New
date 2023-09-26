package ArrayString;

import java.util.Scanner;

public class LinesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "udiuwen\n dbjwhbdhewbdubwe\nyqxqeyxgy\ngdywe ye\neuejbeuw";
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter a string:");
		//str = sc.nextLine();
		int count=0;
		char[] ch=str.toCharArray();
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='\n' || i==ch.length-1) {
				count++;
			}
		}
		System.out.println("The number of lines in the given string is: "+count);

		sc.close();

	}

}
