package com.nestedstatic;

import com.nestedstatic.Car.Engine;

public class Demo {

	public static void main(String[] args) {
		Car ehe = new Car("Peugeot 406");
		Car.Engine hdi = new Car.Engine(110, 2000);
		hdi.start();
	}

}
