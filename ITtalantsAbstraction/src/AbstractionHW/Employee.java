package AbstractionHW;

public class Employee {

	private String name;
	private Task currentTask;
	private double hoursLeft;

	// Constructors
	public Employee(String name) {
		setName(name);
	}

	// Getter and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public double getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(double hoursLeft) {
		if (hoursLeft > 0) {
			this.hoursLeft = hoursLeft;
		}
	}

	// Public methods

	public void work() {
		if (this.currentTask != null) {
			if (this.hoursLeft <= this.currentTask.getWorkingHours()) {
				this.currentTask.setWorkingHours(this.currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
				this.showInfo();
			} else {
				this.hoursLeft -= this.currentTask.getWorkingHours();
				this.currentTask.setWorkingHours(0);
				this.showInfo();
			}
		} else {
			System.out.println("I don't have a task for whiche i can work!");
		}
	}

	private void showInfo() {
		System.out.println(this.name + " work over " + this.currentTask.getName()
				+ "\n now the remainging working hours of " + this.name + " are " + this.getHoursLeft()
				+ " and hours to be task finished are " + this.currentTask.getWorkingHours());
	}
}
