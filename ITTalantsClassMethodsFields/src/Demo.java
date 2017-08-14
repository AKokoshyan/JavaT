import java.util.Random;

import Task1.Computer;

public class Demo {

	public static void main(String[] args) {
		getComputers();
	}

	static void getComputers() {
		Computer first = new Computer(2015, 1550.0, true, 750, 16, "Windows");
		Computer second = new Computer(1999, 1000.5, false, 256, 2, "iOS");

		first.useMemory(5);
		second.changeOperationSystem("Linux");

		first.print();
		System.out.println();
		second.print();
	}

	static void testPhoneCalls() {
		GSM nokia = new GSM("NOKIA", "0883412210");
		GSM ericson = new GSM("Ericson", "0886999804");
		nokia.call(ericson, 20);

		nokia.printInfoForTheLastOutgoingCall();
	}

	static void mortalCombat() {
		Fighter subZero = new Fighter();
		Fighter raiden = new Fighter();

		subZero.name = "Subzero";
		raiden.name = "Raiden";

		Random random = new Random();

		while (subZero.health > 0 && raiden.health > 0) {
			int randomHit = random.nextInt(5) + 1;
			switch (randomHit) {
			case 1:
				subZero.hit(raiden);
				break;
			case 2:
				subZero.block(raiden);
				break;
			case 3:
				subZero.criticalHit(raiden);
				break;
			case 4:
				raiden.hit(subZero);
				break;
			case 5:
				raiden.block(subZero);
				break;
			case 6:
				raiden.criticalHit(subZero);
				break;
			default:
				break;
			}
			if (raiden.health < 0) {
				System.out.println(subZero.name + " wins!");
			}
			if (subZero.health < 0) {
				System.out.println(raiden.name + " wins!");
			}
		}

	}
}
