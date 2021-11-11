package SpringCore4;

import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository {
	 public double getBalance(long accountld);
	 public double updateBalance (long accountld, double newBalance);
}
