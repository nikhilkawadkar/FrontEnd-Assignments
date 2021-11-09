package SpringCore_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		 
		context = new ClassPathXmlApplicationContext("SpringCore_1_bean.xml");
		
		//using setter injection
		//Customer customer = (Customer)context.getBean("customer");
		//customer.displayCustomer();
		
		Customer customer2 = (Customer)context.getBean("customerConstructor");
		customer2.displayCustomer();
		
		
	}
	

}
