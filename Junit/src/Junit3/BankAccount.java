package Junit3;

public class BankAccount {

	long loginID= 123456;
	double balance =2000;
	
	public void showInfo() {
		System.out.println("LoginId : " + loginID + "\n" + "Balance : " + balance);
	}
	
	public void withDraw(double amount) throws InSufficientBalanceException{
		if( balance < amount) {
			throw new InSufficientBalanceException();
		}else {
			balance -= amount;
			System.out.println("Your money:" + amount);
		}
	}
	
}
