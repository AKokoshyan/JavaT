package Task2;

public class College {

	public static void main(String[] args) {
		Student ivan = new Student("Ivan", "Navigation", 21);
		Student gosho = new Student("Gosho", "Navigation", 25);
		Student petkan = new Student("Petkan", "Navigation", 26);
		Student marin = new Student("Marin", "Navigation", 20);

		StudentGroup navigation = new StudentGroup("Navigation");

		ivan.setGrade(5.0);
		navigation.addStudent(gosho);
		navigation.addStudent(marin);
		navigation.addStudent(petkan);
		navigation.addStudent(ivan);

		System.out.println(navigation.theBestStudent());
	}

}
