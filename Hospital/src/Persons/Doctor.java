package Persons;

import java.util.ArrayList;

import Hospital.Ordinatory;

public class Doctor extends Person {

	private ArrayList<Patient> patients;
	private boolean isFree;
	
	
	public Doctor(String name, char gender, Ordinatory ordinatory) {
		super(name, gender);
		this.isFree = true;
		this.ordinatory = ordinatory;
	}

	public void addPatient(Patient p){
		if(p == null){
			System.out.println("Ти не си човек, а котка!");
			return;
		}
		
		if(!this.isFree){
			System.out.println("Лекарят е твърде зает!");
			return;
		}
		
		patients.add(p);
		
		if(this.patients.size() == 3){
			this.isFree = false;
		}
		
	}
	
}
