package com.nestedstatic;

public class Car {

	void print() {
		int x = 3;
		class Guma {
			void getX() {
				System.out.println(x);
			}
		}
		Guma carGuma = new Guma();
		carGuma.getX();
	}

}