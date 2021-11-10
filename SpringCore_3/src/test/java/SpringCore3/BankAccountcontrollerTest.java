package SpringCore3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

public class BankAccountcontrollerTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Object controller = context.getBean("controller");
		
		assertEquals(controller.getClass().getSimpleName(), "BankAccountcontroller");
		
		
		 
//		if (controller.getClass().getSimpleName().equals("Question")) {
//			System.out.println("Success");
//		} else {
//			fail("Not yet implemented");
//		}
		
		 
	}

}
