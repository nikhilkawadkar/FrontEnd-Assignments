package AssignmentTwo_Three;

public class SavingAccount extends Bank {
	 
	private String name = "Saving Account";
	
	public void showTotal() {
		System.out.println("Your Fixed Deposits " + name + " balnce is " + totalAmount);
	}

}
