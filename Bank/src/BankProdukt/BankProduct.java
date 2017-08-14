package BankProdukt;

import Person.Bank;
import Person.Client;

public abstract class BankProduct {

	protected Bank bank;
	protected Client client;
	protected double money;
	protected int period;
	protected double interest;
	protected String name;
	protected double monthlyPayment;

	// Constructors
	public BankProduct(Bank bank, Client client, double money, int period, double interest, String name,
			double monthlyPayment) {
		this.bank = bank;
		this.client = client;
		this.money = money;
		this.period = period;
		this.interest = interest;
		this.name = name;
		this.monthlyPayment = monthlyPayment;
	}

	public String getName() {
		return this.name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public Client getClient() {
		return client;
	}

	public double getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getters and setters
}
