package BankProdukt;

import Person.Bank;
import Person.Client;

public class Credit extends BankProduct {

	public Credit(Bank bank, Client client, double money, int period, double interest, String name,
			double monthlyPayment) {
		super(bank, client, money, period, interest, name, monthlyPayment);
	}

	
}
