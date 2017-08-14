package Documents;

import Persons.Patient;

public class Folder {

	private Patient patient;
	private String text;
	
	public Folder(Patient patient){
		this.patient = patient;
		String gender = patient.isMale()?"М":"Ж";
		this.text += "Име: " + patient.getName() + "\nГодини: " + patient.getAge() + "\nПол: " + gender + "Номер: " + patient.getPhoneNumber();
	}
	
	public void printFolder(){
		System.out.println("------------------");
		System.out.println(this.text);
		System.out.println("------------------");
	}
	
}
