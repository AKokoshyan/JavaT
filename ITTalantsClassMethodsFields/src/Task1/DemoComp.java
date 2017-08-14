package Task1;

public class DemoComp {

	public static void main(String[] args) {
		Computer dell = new Computer();
		Computer lenovo = new Computer();

		dell.setPrice(2000.0);
		lenovo.setPrice(2000.0);
		comparePriceMessage(dell.comparePrice(lenovo));
	}

	static void comparePriceMessage(int x) {
		if (x == 1) {
			System.out.println("This computer is more expensive!");
		}
		if (x == 0) {
			System.out.println("Both computers are with same price!");
		}
		if (x == -1) {
			System.out.println("This computer is cheaper!");
		}
		if (x == 2) {
			System.out.println("Something went wrong!");
		}
	}
}
