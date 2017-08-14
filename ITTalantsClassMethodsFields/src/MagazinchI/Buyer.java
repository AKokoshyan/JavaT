package MagazinchI;

import Product.Product;

public class Buyer {

	private Shop favoriteShop;
	private double moneyCash;
	private Product[] cart;
	private int capacity;
	private double sumProducts;

	// Constructors
	public Buyer(Shop favoriteShop, double money, int capacity) {
		setCapacity(capacity);
		this.cart = new Product[capacity];
	}

	// Getter and setter
	protected void setFavoriteShop(Shop favoriteShop) {
		if (favoriteShop != null) {
			this.favoriteShop = favoriteShop;
		}
	}

	public double getMoneyCash() {
		return moneyCash;
	}

	public void setMoneyCash(double moneyCash) {
		if (moneyCash >= 0) {
			this.moneyCash = moneyCash;
		}
	}

	public Product[] getCart() {
		return cart;
	}

	public void setCart(Product[] cart) {
		this.cart = cart;
	}

	private void setCapacity(int capacity) {
		if (capacity > 0) {
			this.capacity = capacity;
		}
	}

	// public methods
	public void addToCart(String productName, double quantity) {
		if (this.favoriteShop != null) {
			for (int i = 0; i < this.favoriteShop.getInventory().length; i++) {
				if (this.favoriteShop.getInventory()[i] != null) {
					if (this.favoriteShop.getInventory()[i].getName().equals(productName)) {
						if (this.favoriteShop.getInventory()[i].getQuantity() <= quantity) {
							for (int j = 0; j < this.cart.length; j++) {
								if (this.cart[j] == null) {
									this.cart[j] = this.favoriteShop.getInventory()[i];
									this.favoriteShop.getInventory()[i] = null;
									break;
								}
							}
						}
						if (this.favoriteShop.getInventory()[i].getQuantity() > quantity) {
							Product newProduct = new Product(productName,
									this.favoriteShop.getInventory()[i].getPrice(), quantity);
							this.favoriteShop.getInventory()[i]
									.setQuantity(this.favoriteShop.getInventory()[i].getQuantity() - quantity);
							for (int j = 0; j < cart.length; j++) {
								if (cart[j] == null) {
									cart[j] = newProduct;
									break;
								}
							}
						}
					}
				}
			}

		} else {

			System.out.println("The inventory of the shop is empty!");
		}
	}

	public void printCart() {
		int cout = 0;
		for (int i = 0; i < this.cart.length; i++) {
			if (this.cart[i] != null) {
				System.out.println((i + 1) + ". " + this.cart[i].getName() + this.cart[i].getQuantity());
				cout++;
			}
		}

		if (cout == 0) {
			System.out.println("The cart is empty!");
		}
	}

}
