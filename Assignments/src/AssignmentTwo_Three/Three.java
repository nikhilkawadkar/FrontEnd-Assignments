package AssignmentTwo_Three;

public class Three {

	public static void main(String[] args) {
		 
		Bank newBank = new Bank();
		newBank.showTotal();
		
		Bank savingAc = new SavingAccount();
		
		Bank current = new CurrentAccount();
		
		savingAc.addAmt(1000);
		current.addAmt(20000);
		
		newBank.addToTotalBankCash(current);
		newBank.addToTotalBankCash(savingAc);
		
		current.showTotal();
		savingAc.showTotal();
		
		newBank.showTotal();	
	}

}
