package Demo;

import Hospital.Hospital;
import Misc.Generator;
import Persons.Patient;

public class Demo {
	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		Generator g = new Generator();

		Patient patient = new Patient(g.genName(), 'M', 19, hospital);
		patient.hospitalise();
		patient.getPlan().printPlan();

	}
}
