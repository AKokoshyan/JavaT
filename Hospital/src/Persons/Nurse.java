package Persons;

import Hospital.Ordinatory;

public class Nurse extends Person {

	private int exp;
	
	
	
	
	public Nurse(String name, char gender, Ordinatory ordinatory) {
		super(name, gender);
		this.ordinatory = ordinatory;
	}
}
