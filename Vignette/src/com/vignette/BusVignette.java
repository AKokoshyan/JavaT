package com.vignette;

public class BusVignette extends Vignette {

	public BusVignette(String type) {
		super("yellow", type, 7);
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}

	@Override
	void stickIt() {
		System.out.println("Stick the vignette for 20 seconds!");

	}

}
