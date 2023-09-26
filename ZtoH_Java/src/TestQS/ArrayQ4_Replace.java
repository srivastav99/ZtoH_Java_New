package TestQS;

public class ArrayQ4_Replace {

	public static void main(String[] args) {
		
		int []a = {-1,-2,6,8,5};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					a[i]=a[j];
					break;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
