package Basic;

import java.util.Scanner;

public class ShopDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unitCost = 100, discount = 10;
		double quantity, totalPrice, finalCost;

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the quantity to be purchased:");
		quantity = sc.nextDouble();
		
		totalPrice = quantity*unitCost;
		
		if(totalPrice > 1000) {
			finalCost = totalPrice - (totalPrice*discount/100);
			System.out.println("Since the purchase is above 1000,a discount of "+discount+" percentage is applied. The final price for the purchase is:"+finalCost);
		}
		else {
			System.out.println("The total price for the purchase is:"+totalPrice);
		}
		
		
	}

}
