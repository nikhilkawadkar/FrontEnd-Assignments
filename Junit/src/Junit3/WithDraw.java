package Junit3;

import java.util.Scanner;

public class WithDraw {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		BankAccount demoAccount = new BankAccount();
		
		demoAccount.showInfo();
		System.out.println("\n"+"Enter amount to withdraw:");
		
		double amount = sc.nextDouble();
		
		try {
			
			demoAccount.withDraw(amount);
			
		} catch (InSufficientBalanceException e) {
			
			System.out.println(e);
			 
		} 
	}
}
