package Persons;

import Documents.*;
import Hospital.Hospital;
import Hospital.Ordinatory;
import Hospital.Room;

public class Patient extends Person {

	private int age;
	private Folder folder;
	private Doctor doctor;
	private Plan plan;
	private Room room;
	private Hospital bolnica;

	public Patient(String name, char gender, int age, Hospital hospital) {
		super(name, gender);
		this.age = age;
		this.bolnica = hospital;
	}

	public void hospitalise() {
		this.folder = new Folder(this);
		this.plan = new Plan(this);

		getOrdinatory();
		
		

	}

	public Plan getPlan() {
		return plan;
	}

	public void getOrdinatory() {
		if (this.plan.getDiagnosis().equals("Кардиологичен случай")) {
			this.ordinatory = this.bolnica.getOrdinatories()[0];
			getRoom(this.bolnica.getOrdinatories()[0]);
			System.out.println("Пациентът " + this.name + " беше приет в Отделение: " + this.ordinatory.getType());
			getDoctor();
		}

		if (this.plan.getDiagnosis().equals("Вирусологичен случай")) {
			this.ordinatory = this.bolnica.getOrdinatories()[2];
			getRoom(this.bolnica.getOrdinatories()[2]);
			System.out.println("Пациентът " + this.name + " беше приет в Отделение: " + this.ordinatory.getType());
			getDoctor();
		}

		if (this.plan.getDiagnosis().equals("Ортопедичен случай")) {
			this.ordinatory = this.bolnica.getOrdinatories()[1];
			getRoom(this.bolnica.getOrdinatories()[1]);
			System.out.println("Пациентът " + this.name + " беше приет в Отделение: " + this.ordinatory.getType());
			getDoctor();

		}
	}
	
	public void getDoctor(){
		if (this.plan.getDiagnosis().equals("Кардиологичен случай")) {
			this.doctor = this.bolnica.getFreeDoctors().get(0);
			System.out.println("Д-р " + this.doctor.getName() + " беше назначен за лекуващ на " + this.name);
		}

		if (this.plan.getDiagnosis().equals("Вирусологичен случай")) {
			this.doctor = this.bolnica.getFreeDoctors().get(4);
			System.out.println("Д-р " + this.doctor.getName() + " беше назначен за лекуващ на " + this.name);
		}

		if (this.plan.getDiagnosis().equals("Ортопедичен случай")) {
			this.doctor = this.bolnica.getFreeDoctors().get(2);
			System.out.println("Д-р " + this.doctor.getName() + " беше назначен за лекуващ на " + this.name);

		}
	}
	
	public void getRoom(Ordinatory o){
		for (int i = 0; i < o.getRooms().length; i++) {
			if(o.getRooms()[i].isAvailable(this)){
				this.room = o.getRooms()[i];
				this.room.addPatient(this);
				break;
			}
		}
	}
	

	public Folder getFolder() {
		return folder;
	}

	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public int getAge() {
		return age;
	}

}
