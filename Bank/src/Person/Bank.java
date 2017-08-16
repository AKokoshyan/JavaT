package Person;

import BankProdukt.BankProduct;
import BankProdukt.Deposit;

public class Bank extends Person {
	private double reserve;
	private double debt = 0;

	public Bank(String name, String address, double money) {
		super(name, address, money);
	}

	public void openDeposit(Client client, double sum, String name) {

		BankProduct testReturn = verifyBankProduct(name);
		if (testReturn == null) {
			System.out.println("not exist \n");
		} else {
			Deposit deposit = new Deposit(null, client, sum, 0, sum, name, sum);
		}

		if (debt == 0)
			;
		this.money += sum;
		this.reserve += (sum * 0.9);

	}

	private BankProduct verifyBankProduct(String name) {
		for (BankProduct bankProduct : products) {
			if (name.equals(bankProduct.getName())) {
				return bankProduct;
			}
		}
		return null;
	}

}
