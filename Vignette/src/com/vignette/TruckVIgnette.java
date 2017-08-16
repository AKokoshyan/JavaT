package com.vignette;

public class TruckVIgnette extends Vignette {

	public TruckVIgnette(String type) {
		super("yellow", type, 7);
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}

	@Override
	void stickIt() {
		System.out.println("Stick the vignette for 10 seconds!");

	}
}
