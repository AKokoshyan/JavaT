package AbstractionHW;

public class Demo {

	public static void main(String[] args) {
		Task goshoTask = new Task("Brane na qgodi", 7.0);
		Task ivanTask = new Task("Brane na qgodi", 7.0);

		Employee gosho = new Employee("Gosho");
		Employee ivan = new Employee("Ivan");

		gosho.setCurrentTask(goshoTask);
		ivan.setCurrentTask(ivanTask);

		gosho.setHoursLeft(4.0);
		ivan.setHoursLeft(8.0);

		gosho.work();
		System.out.println();
		ivan.work();

	}
}
