package MagazinchI;

import Product.Product;

public class Shop {
	private String name;
	private final String address;
	private double money;
	private Product[] inventory;
	private int capacety;
	private int checkIsInventoryFull = 0;

	// Constructors
	public Shop(String name, String address, double money, int capacety) {
		setName(name);
		this.address = address;
		setMoney(money);
		setCapacety(capacety);
		inventory = new Product[capacety];
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if (money >= 0) {
			this.money = money;
		}
	}

	public Product[] getInventory() {
		return inventory;
	}

	public void setInventory(Product[] inventory) {
		if (inventory != null) {
			this.inventory = inventory;
		}
	}

	public String getAddress() {
		return address;
	}

	private void setCapacety(int capacety) {
		if (capacety > 0) {
			this.capacety = capacety;
		}
	}

	// Public methods

	public void addProductToInventory(Product newItem) {
		int capacity = 0;
		for (int i = 0; i < inventory.length; i++) {
			if (this.inventory[i] == null) {
				this.inventory[i] = newItem;
				checkIsInventoryFull++;
				break;
			}
		}

		if (checkIsInventoryFull == inventory.length) {
			System.out.println("You cant put this item in the inventory because the inventory is full!");
		}
	}
}
