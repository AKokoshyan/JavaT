package Person;

import java.util.ArrayList;

import BankProdukt.BankProduct;
import BankProdukt.Credit;
import BankProdukt.Deposit;

public abstract class Person {

	protected String name;
	protected String address;
	protected double money;
	protected ArrayList<BankProduct> products = new ArrayList<BankProduct>();
	
	//Constructors
	public Person(String name, String address, double money) {
		this.name = name;
		this.address = address;
		this.money = money;
	}
	
	//Getters and setters
	
	
}
