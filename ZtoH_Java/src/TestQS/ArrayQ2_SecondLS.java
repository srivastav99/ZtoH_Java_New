package TestQS;

public class ArrayQ2_SecondLS {

	public static void main(String[] args) {
		
		int []a = {2,5,3,8,1,1,8};
			
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					a[i] = a[i] + a[j];
					a[j] = a[i] - a[j];
					a[i] = a[i] - a[j];
				}
			}
		}
		/*
		System.out.println("The second smallest element in the given array is:"+a[1]);
		System.out.println("The second largest element in the given array is:"+a[a.length-2]);
		*/
		
		for(int i=1;i<a.length;i++) {
			
			if(a[0]!=a[i]) {
				System.out.println("The second smallest element in the given array is:"+a[i]);
				break;
			}
		}
		
		for(int i=a.length-2;i>=0;i--) {
			
			if(a[a.length-1]!=a[i]) {
				System.out.println("The second largest element in the given array is:"+a[i]);
				break;
			}
		}
	} 

}
