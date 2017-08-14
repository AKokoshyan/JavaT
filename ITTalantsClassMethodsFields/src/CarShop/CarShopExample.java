package CarShop;

public class CarShopExample {

	public static void main(String[] args) {
		CarShop balkanStar = new CarShop(5);
		Car mercedess = new Car("SLS 500");
		Car firstMercedess = new Car("E320");
		Car secondMercedess = new Car("C63 AMG");
		balkanStar.addCar(mercedess);
		balkanStar.addCar(firstMercedess);
		balkanStar.addCar(secondMercedess);

		balkanStar.showAllCarsInTheShop();
		System.out.println();
		Person gosho = new Person("Gosho", false, "9011027988");
		balkanStar.sellNextCar(gosho);
		Person pesho = new Person("Pesho", false, "8204235625");
		balkanStar.sellNextCar(pesho);
		Person mariya = new Person("Mariya", false, "9401262634");
		balkanStar.sellNextCar(mariya);
		mariya.getCar().carInfo();
		Person qnko = new Person("Qnko", false, "8612278965");
		balkanStar.sellNextCar(qnko);
		qnko.getCar();
		System.out.println();
		gosho.getCar().carInfo();
		System.out.println();
		pesho.getCar().carInfo();
		System.out.println();
		balkanStar.showAllCarsInTheShop();
	}

}
