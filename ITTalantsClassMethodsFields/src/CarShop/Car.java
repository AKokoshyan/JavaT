package CarShop;

public class Car {
	private String model;
	private int maxSpeed;
	private int currentGear;
	private Person owner;

	public Car() {
		this.maxSpeed = 210;
		this.currentGear = 0;
		this.owner = new Person("BalkanStar", false, "0123456789");
	}

	public Car(String model) {
		this();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model != null) {
			this.model = model;
		}
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		if (maxSpeed < 300) {
			this.maxSpeed = maxSpeed;
		}
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		if (currentGear > 0 && currentGear < 7) {
			this.currentGear = currentGear;
		}
	}

	public Person getOwner() {
		return this.owner;
	}

	public void setOwner(Person owner) {
		if (owner != null) {
			this.owner = owner;
		}
	}

	public void carInfo() {
		System.out.println(this.getOwner().getName() + "'s car is " + this.getModel() + " with max speed of "
				+ this.getMaxSpeed());
	}

}
