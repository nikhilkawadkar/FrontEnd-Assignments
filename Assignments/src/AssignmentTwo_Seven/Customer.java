package AssignmentTwo_Seven;
import java.util.Scanner;

public class Customer {
	int noOfCandy,noOfCookies,noOfIcecream;
	
	public void placeOrder(DessertItems candy , DessertItems cookies , DessertItems iceCream) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		Boolean isTrue = true;
		while(isTrue) {
			
			System.out.println("Select your order :"+"\n"+ "1. Candy(60rs)" +"\n"+"2. Cookies(50)"
			+"\n"+"3. Icecream(70)"+"\n"+"Press 1 for candy, 2 for cookies, 3 for icecream"
			+"\n");
			
			int selected = sc.nextInt();
			
			 switch (selected) {
			case 1: {
				System.out.println("Enter number of Candy to add : ");
				noOfCandy = sc.nextInt();
				cookies.numOfDesert -=  noOfCandy;
				 break;
			}
			case 2: {
				System.out.println("Enter number of Cookies to add : ");
				noOfCookies = sc.nextInt();
				cookies.numOfDesert -=  noOfCookies;
				break;
			}
			case 3: {
				System.out.println("Enter number of Icecream to add : "); 
				noOfIcecream = sc.nextInt();
				iceCream.numOfDesert -= noOfIcecream;  
				 break;
			}
			default:
				System.out.println("Wrong option");	
			}
			
			System.out.println("Enter 1 to select more and 0 if exit : ");
			int num = sc.nextInt();
			if (num == 0) {
				isTrue = false;
			}   
			
		}
		System.out.println("Added successfully!!!");
		showOrder(candy.getCost(), cookies.getCost(), iceCream.getCost());
		
	}
	
	public void showOrder(int a, int b, int c) {
		System.out.println("Your order is:" + "\n" + "Desserts    "+"Qty   " +"Amount"
	+"\n"+"1. candy     "+noOfCandy+"     "+(a*noOfCandy)+"\n"+"2. Cookies   "+noOfCookies+"      "+(b*noOfCookies)+"\n"
	+"3. Icecream  "+noOfIcecream+"      " +(c*noOfIcecream)+"\n"+"-----------------------"+"\n"+"Total bill"+"          "
	+((a*noOfCandy)+(b*noOfCookies)+(c*noOfIcecream)));
	}
}
