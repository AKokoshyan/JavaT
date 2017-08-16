package com.vignette;

public class CarVignette extends Vignette {

	// Constructors
	public CarVignette(String type) {
		super("green", type, 5);
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}

	@Override
	void stickIt() {
		System.out.println("Stick the vignette for 5 seconds!");
	}

}
