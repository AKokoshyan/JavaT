package com.gasstation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import com.vignette.BusVignette;
import com.vignette.CarVignette;
import com.vignette.TruckVIgnette;
import com.vignette.Vignette;

public class GasStation {

	private static final int RANDOM_NUMBER = new Random().nextInt(3);

	private String name;
	private String address;
	private ArrayList<Vignette> vignettesForSale;

	// Constructors
	public GasStation(String name, String address) {
		setName(name);
		setAddress(address);
		this.vignettesForSale = new ArrayList<Vignette>();
		setVignettesForSale();
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		} else {
			this.name = "undefinde";
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address != null) {
			this.address = address;
		} else {
			this.address = "undefined";
		}
	}

	public ArrayList<Vignette> getVignettesForSale() {
		return vignettesForSale;
	}

	public void setVignettesForSale() {
		for (int i = 0; i < 10000; i++) {
			vignettesForSale.add(genereteVignette());
		}
	}

	private Vignette genereteVignette() {
		Random randomInteger = new Random();
		Vignette generetedVignette = null;

		int randomNumber = randomInteger.nextInt(3);
		switch (randomNumber) {
		case 0:
			generetedVignette = new CarVignette(genereteType());
			break;
		case 1:
			generetedVignette = new BusVignette(genereteType());
			break;
		case 2:
			generetedVignette = new TruckVIgnette(genereteType());
			break;
		default:
			System.out.println("Vignette was not inicialized!");
		}

		return generetedVignette;

	}

	private String genereteType() {
		String type = null;

		switch (RANDOM_NUMBER) {
		case 0:
			type = "daily";
			break;
		case 1:
			type = "monthly";
			break;
		case 2:
			type = "yearly";
			break;
		default:
			System.out.println("Type was not inicialized");
		}

		return type;
	}

}
