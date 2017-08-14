package BankProdukt;

import Person.Bank;
import Person.Client;

public class Deposit extends BankProduct {

	public Deposit(Bank bank, Client client, double money, int period, double interest, String name,
			double monthlyPayment) {
		super(bank, client, money, period, interest, name, monthlyPayment);
		
	}

}
