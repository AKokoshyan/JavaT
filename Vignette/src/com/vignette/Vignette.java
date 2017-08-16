package com.vignette;

import java.time.LocalDate;

public abstract class Vignette {

	private int pricePerDay;
	private int pricePerMonth;
	private int pricePerYear;
	private int price;
	private LocalDate dateSold;
	private String color;
	private String type;
	private LocalDate expairDate;

	// Constructors
	public Vignette(String color, String type, int price) {
		this.dateSold = LocalDate.now();
		this.color = color;
		this.pricePerDay = price;
		this.pricePerMonth = (pricePerDay * 7) * 10;
		this.pricePerYear = pricePerMonth * 6;
		setType(type);
		setPrice(type);
		setExpairDate(type);
	}

	// Getters and setters
	public String getType() {
		return type;
	}

	private void setType(String type) {
		if (type.equals("daily") || type.equals("monthly") || type.equals("yearly")) {
			this.type = type;
		} else {
			this.type = "undefined";
		}
	}

	public int getPrice() {
		return this.price;
	}

	private void setPrice(String type) {
		if (type.equals("daily")) {
			this.price = this.pricePerDay;
		} else if (type.equals("monthly")) {
			this.price = this.pricePerMonth;
		} else if (type.equals("yearly")) {
			this.price = this.pricePerYear;
		}
	}

	public LocalDate getExpairDate() {
		return expairDate;
	}

	private void setExpairDate(String type) {
		if (type.equals("daily")) {
			this.expairDate = dateSold.plusDays(1);
		} else if (type.equals("monthly")) {
			this.expairDate = dateSold.plusMonths(1);
		} else if (type.equals("yearly")) {
			this.expairDate = dateSold.plusYears(1);
		}
	}

	// Abstract methods

	abstract void stickIt();
}
