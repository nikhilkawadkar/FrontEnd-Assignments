package SpringCore_1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	@Test
	public void test() {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringCore_1_bean.xml");
		Customer cust = (Customer)context.getBean("customerConstructor");
		
		 
		Customer obj2 = new Customer(1, "Nikhil kawadkar", 9860782947L,new Address("xyz", "Hinganghat", "Maharashtra", "442301", "India"));
		
		
		if (cust.getCustomerName().equals(obj2.getCustomerName())) {
			System.out.println("Success");
		} else {
			fail("Not yet implemented");
		}
		
	}

}
