package Person;

public class Client extends Person {

	private double salary;
	private double moneyDebt;

	// Constructors
	public Client(String name, String address, double money) {
		super(name, address, money);
	}

	// Getters and setters

	// Public methods

	public void askDeposit(Bank bank, double sum, String name) {
		if (this.money >= sum) {
			bank.openDeposit(this, sum, name);
			this.money -= sum;
		}
	}
}
