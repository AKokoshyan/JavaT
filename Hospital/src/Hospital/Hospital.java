package Hospital;

import java.util.ArrayList;

import Misc.Generator;
import Persons.*;

public class Hospital {

	private ArrayList<Doctor> freeDoctors = new ArrayList();
	private ArrayList<Nurse> nurses = new ArrayList();
	private Ordinatory[] ordinatories = new Ordinatory[3];
	Generator g = new Generator();

	public ArrayList<Doctor> getFreeDoctors() {
		return freeDoctors;
	}

	public ArrayList<Nurse> getNurses() {
		return nurses;
	}

	public Ordinatory[] getOrdinatories() {
		return ordinatories;
	}

	public Hospital() {
		this.ordinatories[0] = new Cardiology();
		this.ordinatories[1] = new Ortopedy();
		this.ordinatories[2] = new Virosology();

		employDoctors();
		employNurses();
	}

	private void employNurses() {
		for (int i = 0; i < 6; i++) {
			char gender = Math.random() < 0.5 ? 'M' : 'F';
			if (i <= 1) {
				this.nurses.add(new Nurse(g.genName(), gender, this.ordinatories[0]));
			} else if (i <= 3) {
				this.nurses.add(new Nurse(g.genName(), gender, this.ordinatories[1]));
			} else if (i <= 6) {
				this.nurses.add(new Nurse(g.genName(), gender, this.ordinatories[2]));
			}
		}
	}

	private void employDoctors() {
		for (int i = 0; i < 6; i++) {
			char gender = Math.random() < 0.5 ? 'M' : 'F';
			if (i <= 1) {
				this.freeDoctors.add(new Doctor(g.genName(), gender, this.ordinatories[0]));
			} else if (i <= 3) {
				this.freeDoctors.add(new Doctor(g.genName(), gender, this.ordinatories[1]));
			} else if (i <= 6) {
				this.freeDoctors.add(new Doctor(g.genName(), gender, this.ordinatories[2]));
			}
		}

	}
}
