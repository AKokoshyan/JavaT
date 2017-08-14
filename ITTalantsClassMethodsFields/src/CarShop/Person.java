package CarShop;

import java.util.Scanner;

public class Person {
	private final String name;
	private boolean haveCar;
	private Car car;
	private String personId;
	private String sex;

	public Person(String name, boolean haveCar, String personId) {
		if (haveCar) {
			this.car = new Car();
		}
		this.name = name;
		setPersonId(personId);
	}

	public String getName() {
		return name;
	}

	public Car getCar() {
		if (this.car != null) {
			return car;
		} else {

			return null;
		}
	}

	public void setCar(Car car) {
		if (car != null) {
			this.car = car;
			this.haveCar = true;
		} else {
			System.out.println("This car is not existing!");
		}
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		// In this method check is the
		// given personId valid if its not it will read string until valid
		// string will be given and from
		// it determining the sex of the
		// person!
		boolean isNotValide = false;
		if (personId.length() != 10) {
			isNotValide = true;
		}
		if (!isNotValide) {
			for (int i = 0; i < personId.length(); i++) {
				if (personId.charAt(i) < '0' || personId.charAt(i) > '9') {
					isNotValide = true;
					break;
				}
			}
		}
		if (!isNotValide) {
			this.personId = personId;
			setSex(personId);
		}
		if (isNotValide) {
			validatePersonId();
		}

	}

	public String getSex() {
		return sex;
	}

	private void setSex(String personId) {
		if (personId.charAt(8) < 0 || personId.charAt(8) > 9) {
			int sex = personId.charAt(8);
			if (sex % 2 == 0) {
				this.sex = "male";
			} else {
				this.sex = "female";
			}
		}
	}

	private void validatePersonId() {
		Scanner scanner = new Scanner(System.in);
		boolean notValide = false;
		String newPersonId;
		do {
			newPersonId = scanner.nextLine();
			if (newPersonId.length() != 10) {
				notValide = true;
			}
			if (!notValide) {
				for (int i = 0; i < newPersonId.length(); i++) {
					if (newPersonId.charAt(i) < '0' || newPersonId.charAt(i) > '9') {
						notValide = true;
						break;
					}
				}
			}
		} while (notValide);
		this.personId = newPersonId;
		setSex(newPersonId);

	}

}
