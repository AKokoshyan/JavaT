package CarShop;

import java.util.Scanner;

public class CarShop {
	private int capacity;
	private Car[] inventory;

	public CarShop(int capacity) {
		setCapacity(capacity);
		inventory = new Car[this.capacity];
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if (capacity > 0 && capacity <= 20) {
			this.capacity = capacity;
		} else {
			Scanner scanner = new Scanner(System.in);

			System.out.println(
					"The number that you enter is not valide for inventory of this shop! It mus be from 1 to 20 !");
			do {
				this.capacity = scanner.nextInt();
				if (this.capacity < 0 || this.capacity > 20) {
					System.out.println("The number that you entered is out of range 1 to 20! Try again!");
				}
			} while (this.capacity < 0 || this.capacity > 20);
		}
	}

	public Car[] getInventory() {
		return inventory;
	}

	public void setInventory(Car[] inventory) {
		this.inventory = inventory;
	}

	public boolean addCar(Car car) {
		boolean addedCar = false;
		if (car == null) {
			System.out.println("The car is not existing !");
			return addedCar;
		}
		for (int i = 0; i < inventory.length; i++) {
			if (this.inventory[i] == null) {
				this.inventory[i] = car;
				addedCar = true;
				break;
			}
		}
		if (!addedCar) {
			System.out.println("The car shop is full!");
		}
		return addedCar;
	}

	public Car getNextCar() {
		Car nextCar = null;
		for (int i = this.inventory.length - 1; i >= 0; i--) {
			if (this.inventory[i] != null) {
				nextCar = this.inventory[i];
				break;
			}
		}
		return nextCar;
	}

	public void sellNextCar(Person buyer) {
		Car barter = getNextCar();
		if (barter != null) {
			barter.setOwner(buyer);
			buyer.setCar(barter);
			removeCar(buyer.getCar());
		} else {
			System.out.println("There is no car for " + buyer.getName() + "!");
		}
	}

	private void removeCar(Car car) {
		for (int i = 0; i < inventory.length; i++) {
			if (this.inventory[i] == car) {
				this.inventory[i] = null;
			}
		}
	}

	public void showAllCarsInTheShop() {
		boolean isEmpty = true;

		for (int i = 0; i < inventory.length; i++) {
			if (inventory[i] != null) {
				System.out.println((i + 1) + " Car\n" + "Model : " + inventory[i].getModel() + "\nMax speed : "
						+ inventory[i].getMaxSpeed() + "\nOwenr is : " + this.inventory[i].getOwner().getName());
				isEmpty = false;
			}
		}
		if (isEmpty) {
			System.out.println("The car shop is empty!");
		}
	}
}
