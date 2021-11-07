package Lambda_8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTereadDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Consumer<List<Integer>>dispList = (list1) -> System.out.println(list1);;
		 
		Thread newthread = new Thread( ()-> dispList.accept(list) );
		
		newthread.start();
 	 
	}
  
}
	