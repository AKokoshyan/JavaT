package Gasstation;

import java.util.ArrayList;
import java.util.Random;

import Vehicles.Bus;
import Vehicles.Car;
import Vehicles.Truck;
import Vehicles.Vehicle;
import Vinetki.Vinetki;

public class Gasstation {

	private double money;
	private ArrayList<Vinetki> vinetkiForSale = new ArrayList<Vinetki>();
	private int quantityVinetki;

	public Gasstation(double money, int quantityVinetki) {
		setMoney(money);
		setQuantityVinetki(quantityVinetki);
	}

	private void setQuantityVinetki(int quantityVinetki) {
		if (quantityVinetki > 0 && quantityVinetki < 1000) {
			for (int i = 0; i < quantityVinetki; i++) {
				vinetkiForSale.add(generateVinetka());
			}
		}

	}

	private Vinetki generateVinetka() {
		Random r = new Random();
		int temp = r.nextInt(3) + 1;
		Vinetki newVehicle;
		switch (temp) {
		case 1:
			newVehicle = new CarVinetki;
			return newVehicle;
		case 2:
			newVehicle = new Bus(models[r.nextInt(3)], null, 1952);
			return newVehicle;
		case 3:
			newVehicle = new Truck(models[r.nextInt(3)], null, 1976);
			return newVehicle;
		default:
			System.out.println("Losho!");
			break;
		}
		return null;
		return null;
	}

	private void setMoney(double money) {
		if (money > 0 && money < 100000) {
			this.money = money;
		}
	}

	public void addMoney(double money) {
		if (money > 0) {
			this.money += money;
		}
	}

	public Vinetki sellVinetka(String type) {
		Vinetki temp = null;
		for (int i = 0; i < vinetkiForSale.size(); i++) {
			if (vinetkiForSale.get(i).getType().equals(type)) {
				temp = vinetkiForSale.get(i);
				vinetkiForSale.remove(i);
				break;
			}
		}
		
		
		return temp;
	}

}
