package Hospital;

import Persons.Patient;

public class Room {
	private static int counter = 1;
	private char gender = '*';
	private int number;
	private Patient[] beds = new Patient[3];

	public Room() {
		this.number = counter++;
	}

	public boolean isAvailable(Patient patient) {
		if (gender == '*') {
			return true;
		}
		if (this.gender == (patient.isMale() ? 'M' : 'F')) {
			if (beds[0] != null || beds[1] != null || beds[2] != null) {
				return true;
			}
		}

		return false;
	}

	public void addPatient(Patient patient) {
		if (beds[0] == null && beds[1] == null && beds[2] == null) {
			this.gender = (patient.isMale() ? 'M' : 'F');
		}
		
		boolean isAdded = false;
		for (int i = 0; i < this.beds.length; i++) {
			if (beds[i] == null) {
				this.beds[i] = patient;
				System.out.println("Прациентът " + patient.getName() + " беше приет в стая номер " + this.number);
				isAdded = true;
				break;
			}
		}
		if(!isAdded){
			System.out.println("Прациентът " + patient.getName() + " не беше приет.");
		}
	}
}
