package Persons;

import Hospital.Ordinatory;

public abstract class Person {

	protected String name;
	protected String phoneNumber;
	protected boolean isMale;
	protected Ordinatory ordinatory;
	
	public Ordinatory getTheOrdinatory() {
		return ordinatory;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public boolean isMale() {
		return isMale;
	}

	public Person(String name, char gender){
		if(name != null && !(name.isEmpty())){
			this.name = name;
		}
		
		if(gender == 'M' || gender =='F'){
			this.isMale = gender == 'M'? true : false;
		}
	}
}
