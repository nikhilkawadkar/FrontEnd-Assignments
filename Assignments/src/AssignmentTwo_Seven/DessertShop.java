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
			System.out.println("0 to exit");
			 
			String person = sc.nextLine();
			
			if(person.equalsIgnoreCase("owner")) {
				System.out.println("\n"+"Owner:");
			 
				owner.addDessert(candy, cookies, iceCream);	
				
			}else if(person.equalsIgnoreCase("customer")){	
				customer.placeOrder(candy, cookies, iceCream);
			}else {
				int num = sc.nextInt();
				if (num == 1) {
					isTrue = false;
				}
			}
			
			
		}
		
		
		sc.close();
	}

}
