package Gasstation;

import java.util.ArrayList;

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
			this.quantityVinetki = quantityVinetki;
		}

	}

	private void setMoney(double money) {
		if (money > 0 && money < 100000) {
			this.money = money;
		}
	}
	public void addMoney(double money){
		this.money +=money;
	}
	
	public Vinetki sellVinetka(Vehicle vehicle, String type ){
		return Vinetki vinetka;
	}

}
