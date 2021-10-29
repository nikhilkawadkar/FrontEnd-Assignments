package AssignmentTwo_One;

public class SingletoneDP {
	
	private static SingletoneDP createInstance = new SingletoneDP();
	
	private SingletoneDP(){
		
	}
	
	public static SingletoneDP getInstance(){
	      return createInstance;
	   }
	
	public void name() {
		System.out.println("Nikhil Kawadkar");
	}

}
