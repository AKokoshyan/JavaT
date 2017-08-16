package Driver;

import java.util.ArrayList;
import java.util.Random;

import Gasstation.Gasstation;
import Vehicles.Bus;
import Vehicles.Car;
import Vehicles.Truck;
import Vehicles.Vehicle;
import Vinetki.Vinetki;

public class Driver {

	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	private double money;
	private Gasstation favoritTankstation;
	private String[] models = { "Trabant", "Vartburg", "Moskvich" };

	// Constructors

	public Driver(String name, int numberOfVehicles, double money, Gasstation favoriteTankstation) {
		setName(name);
		setNumberOfVehicles(numberOfVehicles);
		setMoney(money);
		setGasstation(favoriteTankstation);
	}
	// Getters and setters

	private void setMoney(double money) {
		if (money > 0) {
			this.money = money;
		}
	}

	private void setGasstation(Gasstation favoriteTankstation) {
		if (favoriteTankstation != null) {
			this.favoritTankstation = favoriteTankstation;
		}
	}

	private void setNumberOfVehicles(int numberOfVehicles) {
		if (numberOfVehicles > 0) {
			setVehicles(numberOfVehicles);
		}
	}

	private void setVehicles(int numberOfVehicles) {
		for (int i = 0; i < numberOfVehicles; i++) {
			this.vehicles.add(generateVehicle());
		}
	}

	private Vehicle generateVehicle() {
		Random r = new Random();
		int temp = r.nextInt(3) + 1;
		Vehicle newVehicle;
		switch (temp) {
		case 1:
			newVehicle = new Car(models[r.nextInt(3)], null, 1991);
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
	}

	private void setName(String name2) {
		// TODO Auto-generated method stub

	}

	// Public methods

}
