package Task2;

public class StudentGroup {
	private String groupSubject;
	private Student[] students;
	private int freePlaces;

	public StudentGroup() {
		this.freePlaces = 5;
		this.students = new Student[5];
	}

	public StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	public void addStudent(Student s) {
		if (freePlaces > 0) {
			for (int i = 0; i < students.length; i++) {
				if (this.students[i] == null && this.groupSubject.equals(s.getSubject())) {
					this.students[i] = s;
					this.freePlaces--;
					break;
				}
			}
		}
	}

	public void emptyGroup() {
		this.students = new Student[5];
		this.freePlaces = 5;
	}

	public String theBestStudent() {
		String bestStudentName = "";
		double maxGrade = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				break;
			}
			if (this.students[i].getGrade() > maxGrade) {
				bestStudentName = students[i].getName();

			}
		}

		if (bestStudentName.equals("")) {
			return "There is no students in this class !";
		} else {
			return bestStudentName;
		}
	}

	public void printStudentsInGroup() {
		System.out.println("Info for " + this.groupSubject + " class : ");
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println((i + 1) + "." + this.students[i].getName() + ", " + this.students[i].getAge()
						+ " years old," + " with grade " + this.students[i].getGrade());
			}
		}
	}
}
