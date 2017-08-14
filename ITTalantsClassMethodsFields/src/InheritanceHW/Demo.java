package InheritanceHW;

public class Demo {

	public static void main(String[] args) {
		Person[] room = new Person[10];

		Person gosho = new Person("Gosho", 25, true);
		Person maria = new Person("Maria", 20, false);

		Student ivancho = new Student("Ivancho", 16, true, 4.5);
		Student mariika = new Student("Mariika", 15, false, 5.0);

		Employee lazar = new Employee("Lazar", 32, true, 50.0);
		Employee penka = new Employee("Penka", 29, false, 100.0);

		room[0] = gosho;
		room[1] = maria;
		room[2] = ivancho;
		room[3] = mariika;
		room[4] = lazar;
		room[5] = penka;

		for (int i = 0; i < room.length; i++) {
			if (room[i] != null) {

				if (room[i] instanceof Student || room[i] instanceof Employee) {
					if (room[i] instanceof Student) {
						Student temp = (Student) room[i];
						temp.showStudentInfo();
						System.out.println();
					}
					if (room[i] instanceof Employee) {
						Employee temp = (Employee) room[i];
						temp.showEmployeeInfo();
						System.out.println();
					}
				} else {
					if (room[i] instanceof Person) {
						room[i].showPersonInfo();
						System.out.println();
					}
				}
			}
		}

		System.out.println();
		for (int i = 0; i < room.length; i++) {
			if (room[i] instanceof Employee) {
				Employee temp = (Employee) room[i];
				System.out.println("The money for overtime are : " + temp.calculateOvertime(2.0));
			}
		}
	}

}
