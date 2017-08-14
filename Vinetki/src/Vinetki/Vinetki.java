package Vinetki;

import java.time.LocalDate;
import java.util.Date;

public abstract class Vinetki {

	protected LocalDate date = LocalDate.now();
	protected String color;
	protected String type;
	protected LocalDate expairDate;

	protected Vinetki(String color, String type) {
		this.color = color; //TODO validation
		setType(type);
		setExpairDate();
	}

	private void setExpairDate() {
		if (this.type.equals("daily")) {
			expairDate= date.plusDays(1);
		} else if (this.type.equals("montly")) {
			expairDate= date.plusMonths(1);
		} else if (this.type.equals("yearly")) {
			expairDate= date.plusYears(1);
		}

	}

	private void setType(String type) {
		if (type.equals("daily") || type.equals("montly") || type.equals("yearly")) {
			this.type = type;
		}
	}

	public abstract int getPrice();

	abstract void stickIt();
}
