package Driver;

import java.util.ArrayList;

import Gasstation.Gasstation;
import Vehicles.Vehicle;
import Vinetki.Vinetki;

public class Driver {

	private final String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	private double money;
	private Gasstation gasstationCurrent;
	
	
	

	public void buyForOneVehicle(Gasstation gasstation, Vehicle vehicle, String type) {
		this.gasstationCurrent = gasstation;
		Vinetki vinetka = gasstation.sellVinetka(vehicle, type);
		
		if (this.money > vinetka.getPrice()) { 
			this.money -=vinetka.getPrice();
			gasstation.addMoney(vinetka.getPrice());
			vehicle.setVinetka(vinetka);
			
		}
	}

	public void buyForAllVehicles(Gasstation gasstation, String type) {
		for (Vehicle vehicle : vehicles) {
			this.buyForOneVehicle(gasstation, vehicle, type);
		}
	}

}
