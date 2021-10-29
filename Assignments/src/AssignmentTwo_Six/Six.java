package AssignmentTwo_Six;

public class Six {

	public static void main(String[] args) {
		 
		Persistence obj1 = new FilePersistence();
		Persistence obj2 = new DatabasePersistence();
		
		
		obj1.persist();
		obj2.persist();

	}

}
