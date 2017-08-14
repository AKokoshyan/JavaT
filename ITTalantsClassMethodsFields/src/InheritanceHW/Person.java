package InheritanceHW;

public class Person {

	private final String name;
	private int age;
	private boolean isMale;

	protected Person(String name, int age, boolean isMale) {
		this.name = name;
		setAge(age);
		this.isMale = isMale;
	}

	protected int getAge() {
		return age;
	}

	private void setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
		}
	}

	public void showPersonInfo() {
		System.out.print(this.name + ", " + this.age + " years old, " + (isMale ? "male" : "female"));
	}

}
