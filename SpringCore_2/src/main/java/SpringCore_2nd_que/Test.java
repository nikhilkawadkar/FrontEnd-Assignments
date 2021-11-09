package SpringCore_2nd_que;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	private static ApplicationContext context;
	public static void main(String[] args) {
		 
		context = new ClassPathXmlApplicationContext("beans.xml");
		Question question = (Question)context.getBean("question");
		
		System.out.println(question.getQuestion() + "\n Ans: " + question.getQuestionList());
	}

}
