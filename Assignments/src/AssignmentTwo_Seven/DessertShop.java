package AssignmentTwo_Seven;

import java.util.Scanner;

public class DessertShop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DessertItems candy = new Candy();
		DessertItems cookies = new Cookies();
		DessertItems iceCream = new Candy();
		Owner owner = new Owner();
		Customer customer = new Customer();
		Boolean isTrue = true;
		
		while(isTrue) {
			
			System.out.println("\n\nOwner or Cutomer");
			System.out.println("press 1 for Owner press 2 for customer and 0 to exti");
			 
			 
			int key = sc.nextInt();
			
			if(key == 1) {
				System.out.println("\n"+"Owner:");
			 
				owner.addDessert(candy, cookies, iceCream);	
				
			}else if(key == 2){	
				customer.placeOrder(candy, cookies, iceCream);
			}
			else if(key == 0){
				int num = sc.nextInt();
				if (num == 1) {
					isTrue = false;
				}
			}	
		}
		sc.close();
	}
}
