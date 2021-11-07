package Annotation_3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
 

public class AnnotaionThree {

	public static void main(String[] args) throws Exception {
		
		MyClass obj = new MyClass();
		
		Method[] methods = obj.getClass().getDeclaredMethods();
		 
		for (int i = 1; i < methods.length+1; i++) {
			
			for(int j = 0; j<methods.length; j++) {
			Execute ex = methods[j].getAnnotation(Execute.class);
			if (ex.sequence()== i) {
				methods[j].invoke(obj);
			}
			 
			}
			
		}
		
	}

}


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int sequence();
}

class MyClass{	
	
	  @Execute(sequence=2)
	  public void myMethod1()
	      {
		  System.out.println("Method : 1, Sequence : 2");
		  } 
	  
	  @Execute(sequence=1)
	  public void myMethod2()
	      {
		  System.out.println("Method : 2, Sequence : 1");
		  } 
	  
	  @Execute(sequence=3)
	  public void myMethod3()
	      {
		  System.out.println("Method : 3, Sequence : 3");
		  } 
	  }

