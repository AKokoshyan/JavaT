package Vinetki;

import java.time.LocalDate;
import java.util.Date;

public abstract class Vinetki {

	protected LocalDate date = LocalDate.now();
	protected String color;
	protected String type;
	protected LocalDate expairDate;

	// Constructors
	protected Vinetki(String color, String type) {
		this.color = color;
		setType(type);
		setExpairDate();
		this.type = type;
	}

	// Getters and setters
	private void setExpairDate() {
		if (this.type.equals("daily")) {
			expairDate = date.plusDays(1);
		} else if (this.type.equals("montly")) {
			expairDate = date.plusMonths(1);
		} else if (this.type.equals("yearly")) {
			expairDate = date.plusYears(1);
		}

	}

	public LocalDate getExpairDate() {
		return expairDate;
	}

	private void setType(String type) {
		if (type.equals("daily") || type.equals("montly") || type.equals("yearly")) {
			this.type = type;
		}
	}

	public String getType() {
		return this.type;
	}
	// Other methods

	public abstract int getPrice();

	abstract void stickIt();
}
