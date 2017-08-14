package Exercize;

public class Demo {

	public static void main(String[] args) {
		Mouse micki = new Mouse();
		Cat tom = new Cat();

		IExample temp = (IExample) tom;
		tom.print();
	}
}
