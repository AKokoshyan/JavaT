package InheritanceHW;

public class Student extends Person {

	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}

	public void setScore(double score) {
		if (score >= 2.0 && score <= 6.0) {
			this.score = score;
		}
	}

	public void showStudentInfo() {
		super.showPersonInfo();
		System.out.print("with score " + this.score);
	}
}
