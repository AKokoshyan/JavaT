package com.vehicles;

import com.vignette.Vignette;

public abstract class Vehicles {

	private String model;
	private boolean hasVignette;
	private Vignette ownVignette;
	private int yearManafactured;

	// Constructors
	public Vehicles(String model, int yearManafactured, Vignette owVignette) {
		this.model = model;
		this.hasVignette = false;
		this.yearManafactured = yearManafactured;
		setOwnVignette(owVignette);
	}

	// Getters and setters
	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		if (model != null) {
			this.model = model;
		} else {
			this.model = "undefined";
		}
	}

	public boolean isHasVignette() {
		return hasVignette;
	}

	protected void setHasVignette(boolean hasVignette) {
		this.hasVignette = hasVignette;
	}

	public Vignette getOwnVignette() {
		return ownVignette;
	}

	public void setOwnVignette(Vignette ownVignette) {
		if (!isHasVignette() && ownVignette != null) {
			this.ownVignette = ownVignette;
			setHasVignette(true);
		} else {
			this.ownVignette = null;
		}
	}

	public int getYearManafactured() {
		return yearManafactured;
	}

	protected void setYearManafactured(int yearManafactured) {
		if (yearManafactured >= 1900 && yearManafactured <= 2017) {
			this.yearManafactured = yearManafactured;
		} else {
			this.yearManafactured = 1900;
		}
	}

}
