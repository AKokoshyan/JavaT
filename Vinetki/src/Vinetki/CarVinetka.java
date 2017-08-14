package Vinetki;

public class CarVinetka extends Vinetki {
	private int busVinetkaPricePerDay = 5;
	private int price;

	public CarVinetka(String type) {
		super("green", type);
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
		System.out.println("Zalepih vinetuku za 5 sekundi!");

	}
}
