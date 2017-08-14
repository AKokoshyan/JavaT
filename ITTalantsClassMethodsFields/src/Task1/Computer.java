package Task1;

public class Computer {
	private int yearManufactured;
	private double price;
	private boolean isNotebook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;

	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	public Computer(int yearManufactured, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	public Computer(int yearManufactured, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	public int getYearManufactured() {
		return yearManufactured;
	}

	public void setYearManufactured(int yearManufactured) {
		if (yearManufactured < 1995 && yearManufactured > 2017) {
			this.yearManufactured = yearManufactured;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public boolean isNotebook() {
		return isNotebook;
	}

	public void setNotebook(boolean isNotebook) {
		this.isNotebook = isNotebook;
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(int hardDiskMemory) {
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
		}
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(int freeMemory) {
		if (freeMemory > 0) {
			this.freeMemory = freeMemory;
		}
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		changeOperationSystem(operationSystem);
	}

	public void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	public int comparePrice(Computer other) {
		int result = 2;
		if (this.getPrice() > other.getPrice()) {
			result = 1;
		} else if (this.getPrice() == other.getPrice()) {
			result = 0;
		} else if (this.getPrice() < other.getPrice()) {
			result = -1;
		}
		return result;
	}


	public void useMemory(int usedMemory) {
		if (freeMemory < usedMemory) {
			System.out.println("Not enough free memory!");
		} else {
			freeMemory -= usedMemory;
		}
	}

	public void print() {
		System.out.println("The year of manufacturing : " + yearManufactured + "\n" + "The price of computer is : "
				+ price + "\n" + "The computer is " + (isNotebook ? "notebook" : "PC") + "\n"
				+ "The capacity of the hard disk is : " + hardDiskMemory + "\n"
				+ "The free memory of the computer is : " + freeMemory + "\n"
				+ "The operational system of the computer is : " + operationSystem);
	}
}
