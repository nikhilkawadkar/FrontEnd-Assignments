package Exception_Handling_3;

public class SavingAccount {

	long loginID= 123456;
	double balance =2000;
	
	public void showInfo() {
		System.out.println("LoginId : " + loginID + "\n" + "Balance : " + balance);
	}
	
	public void withDraw(double amount) throws IlligalBankTransactionException,InSufficientBalanceException{
		if( balance < amount || balance==0) {
			throw new InSufficientBalanceException("Insufficient Balance");
		}else if (amount<0) {
			throw new IlligalBankTransactionException("Illigal Bank Transaction Exception");
		}else {
			balance -= amount;
			System.out.println("Your money:" + amount);
		}
	}
	
}
