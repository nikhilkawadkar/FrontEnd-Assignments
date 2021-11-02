package Collections_1;

public class Contact {
	
	long pNumber;
	String name;
	String email;
	String gender;
	
	public Contact(long pNumber, String name, String email, String gender) {
		super();
		this.pNumber = pNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "[Number=" + pNumber + ", Name=" + name + ", Email=" + email + ", Gender=" + gender + "]" + "\n";
	}
	
	
	
	

}
