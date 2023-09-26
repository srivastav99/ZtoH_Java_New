package Conditional_ifAndelse;

import java.util.Scanner;

public class ShopDiscountAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unitCost = 100;
		double quantity, totalPrice, finalCost;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the purchased quantity:");
		quantity = sc.nextDouble();
		
		totalPrice = quantity*unitCost;
		
		if(totalPrice < 1000) {
			
			System.out.println("The total price for the purchase is:"+totalPrice);
		}
		else if (totalPrice >= 1000 && totalPrice < 5000) {
			
			finalCost = totalPrice - totalPrice*10/100;
			System.out.println("Since the purchase is equal to or above 1000 and below 5000,a discount of 10 percentage is applied. The final price for the purchase is:"+finalCost);
			
			
		}
		else if (totalPrice >= 5000 && totalPrice < 10000) {
			
			finalCost = totalPrice - totalPrice*30/100;
			System.out.println("Since the purchase is equal to or above 5000 and below 10000,a discount of 30 percentage is applied. The final price for the purchase is:"+finalCost);
			
		}
		else if (totalPrice >= 10000 && totalPrice < 20000) {
			
			finalCost = totalPrice - totalPrice*50/100;
			System.out.println("Since the purchase is equal to or above 10000 and below 20000,a discount of 50 percentage is applied. The final price for the purchase is:"+finalCost);
			
		}
		
		else {
			
			finalCost = totalPrice - totalPrice*70/100;
			System.out.println("Since the purchase is equal to or above 20000,a discount of 70 percentage is applied. The final price for the purchase is:"+finalCost);
		}

	}

}
