package com.nestedstatic;

public class Car {

	private String model;
	private Engine ownEngine;

	public Car(String model) {
		this.model = model;
		this.ownEngine = new Engine(110, 2000);
	}

	public static class Engine {

		private int hP;
		private int engineVolume;

		public Engine(int hP, int engineVolume) {
			this.hP = hP;
			this.engineVolume = engineVolume;
		}

		protected void start() {
			System.out.println("Brum brum");
		}

	}

}