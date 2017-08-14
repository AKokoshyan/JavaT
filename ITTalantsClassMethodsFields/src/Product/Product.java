package Product;

public class Product {
	final private String name;
	private double price;
	private double quantity;

	public Product(String name, double price, double quantity) {
		this.name = name;
		setPrice(price);
		setQuantity(quantity);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price >= 0) {
			this.price = price;
		}
	}

	public String getName() {
		return name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		if (quantity > 0.0) {
			this.quantity = quantity;
		} else {
			this.quantity = 0.0;
		}
	}
}
