package Lambda_2;

import java.util.Arrays;
import java.util.List;

public class OrderDemo {

	public static void main(String[] args) {
		 
		List<Order> ordersList = Arrays.asList(
				new Order("A", 11000, "ACCEPTED"),
				new Order("B", 12000, "COMPLETED"),
				new Order("C", 1000, "ACCEPTED"),
				new Order("D", 2000, "COMPLETED")
				);
		
		SortOrder orders = list ->{ for (Order order : list) {
			if(order.oPrice > 10000) {
				System.out.println(order);
			}
		}};
		
		 orders.sortedList(ordersList);
		
	}

}

interface SortOrder{
	public void sortedList(List<Order> l);
}

class Order {
	
	String oName;
	int oPrice;
	String status;
	public Order(String oName, int oPrice, String status) {
		super();
		this.oName = oName;
		this.oPrice = oPrice;
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order Name: " + oName + "  Prics: " + oPrice + "  Status: " + status  ;
	}
}