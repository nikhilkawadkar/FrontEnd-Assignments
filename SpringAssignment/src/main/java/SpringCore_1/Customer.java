package SpringCore_1;

public class Customer {
	
	private int customerId;  
	private String customerName;  
	private long customerContact;
	private Address customerAddress;
	
	
	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}  
	
	
	public void displayCustomer() {
		System.out.println("Customer Id : " + customerId + " customer Name: " + customerName + " Customer contact : " + customerContact + " Customer Address: " + customerAddress);
	}
}
