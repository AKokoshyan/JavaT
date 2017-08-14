package Vinetki;

public class TruckVinetki extends Vinetki {
	private int busVinetkaPricePerDay = 7;
	private int price;

	public TruckVinetki(String type) {
		super("red", type);
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
	public
	int getPrice() {
		return this.price;
	}

	@Override
	void stickIt() {
		System.out.println("Zalepih vinetuku za 10 sekundi!");

	}

}
