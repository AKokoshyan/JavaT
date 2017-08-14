package Documents;

import java.util.Random;

import Misc.Generator;
import Persons.Patient;

public class Plan {

	private String diagnosis;
	private String medicines;
	private int period;
	Generator g = new Generator();
	Random r = new Random();
	private Patient patient;

	public Plan(Patient patient) {
		this.patient = patient;
		diagnosis = g.genDiagnosis();
		this.medicines = g.getMedicines();
		this.period = r.nextInt(3) + 3;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public String getMedicines() {
		return medicines;
	}

	public int getPeriod() {
		return period;
	}
	
	public void printPlan(){
		System.out.println("На пациентът " + this.patient.getName() + " беше назначено лечение с " + this.medicines);
	}
}
