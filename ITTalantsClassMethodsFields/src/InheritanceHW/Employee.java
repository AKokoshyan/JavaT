package InheritanceHW;

public class Employee extends Person {

	static double workingHours = 8.0;
	private double daySalary;
	private double employeeWorkingHours;

	// Constructors
	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalaray(daySalary);
	}

	// Setters and getters
	private void setDaySalaray(double daySalary) {
		if (daySalary > 0) {
			this.daySalary = daySalary;

		}

	}

	// Public methods

	public double calculateOvertime(double hours) {
		double moneyPerHour = this.daySalary / workingHours;
		if (this.getAge() < 18) {
			return 0;
		} else {
			return (hours * (moneyPerHour * 1.5));
		}
	}

	public void showEmployeeInfo() {
		super.showPersonInfo();
		System.out.print(" dayly salary is " + this.daySalary);
	}
}
