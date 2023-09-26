package Arrays;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];// or you can take the size from user
		int n;
		
		System.out.println("Enter elements in the array as per size:");
		for(int i=0;i<arr.length;i++) {
			n=sc.nextInt();
			arr[i]=n;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
