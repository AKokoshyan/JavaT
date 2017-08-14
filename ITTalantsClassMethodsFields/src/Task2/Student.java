package Task2;

public class Student {

	private String name;
	private String subject;
	private double grade;
	private int yearInCollage;
	private int age;
	private boolean isDegree;// Is the student graduated!
	private double money;

	public Student() {
		this.grade = 4.0;
		this.yearInCollage = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	public void upYear() {
		if (this.yearInCollage < 5) {
			this.yearInCollage++;
		}
	}

	public double receiveSchoolership(double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			this.money += amount;
		}
		return this.money;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		if (grade > 0.0 && grade <= 6.0) {
			this.grade = grade;
		}
	}

	public int getYearInCollage() {
		return yearInCollage;
	}

	public void setYearInCollage(int yearInCollage) {
		if (yearInCollage > 0 && yearInCollage <= 5) {
			this.yearInCollage = yearInCollage;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 && age < 100) {
			this.age = age;
		}
	}

	public boolean isDegree() {
		return isDegree;
	}

	public void setDegree(boolean isDegree) {
		if (this.yearInCollage == 5 && isDegree) {
			this.isDegree = isDegree;
		}
		if (isDegree) {
			System.out.println(this.name + " can't graduate because he is not 5th year in college!");
			this.isDegree = false;
		} else {
			this.isDegree = isDegree;
		}
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		if (money > 0) {
			this.money = money;
		}
	}

}
