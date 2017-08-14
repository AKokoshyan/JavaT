package Vinetki;

public class BusVinetki extends Vinetki {

	private int busVinetkaPricePerDay = 9;
	private int price;

	public BusVinetki(String type) {
		super("yellow", type);
	}

	private void setPrice() {
		if (this.type.equals("daily")) {
			this.price = this.busVinetkaPricePerDay;
		} else if (this.type.equals("montly")) {
			this.price = (busVinetkaPricePerDay * 10);
		} else if (type.equals("yearly")) {
			this.price = ((busVinetkaPricePerDay * 10) * 6);
		}
	}

	@Override
	public int getPrice() {

		return this.price;
	}

	@Override
	void stickIt() {
		System.out.println("Zalepih vinetuku za 20 sekundi!");

	}
}