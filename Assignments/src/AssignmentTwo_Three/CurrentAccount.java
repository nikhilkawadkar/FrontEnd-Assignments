package AssignmentTwo_Three;

public class CurrentAccount extends Bank{
	
	private String name = "Current Account";

	public void showTotal() {
		System.out.println("The Cash Credits of " + name + " is " + totalAmount);
	}

}
