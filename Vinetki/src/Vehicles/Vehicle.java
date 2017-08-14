package Vehicles;

import Vinetki.Vinetki;

public abstract class Vehicle {

	private String model;
	private Vinetki vinetka;
	private int yearManaufactured;

	public Vehicle(String model, Vinetki vinetka, int yearManufactured) {
		setModel(model);
		setVinetka(vinetka);
		setYearManufactured(yearManufactured);
	}

	public void setVinetka(Vinetki vinetka) {
		if (vinetka != null) {
			this.vinetka = vinetka;
		}

	}

	private void setYearManufactured(int yearManufactured) {
		if (yearManufactured > 1900 && yearManufactured < 2017) {
			this.yearManaufactured = yearManufactured;
		}

	}

	private void setModel(String model) {
		if (model != null) {
			this.model = model;
		}
	}
	
	public Vinetki getVinetka() {
		return vinetka;
	}
}
