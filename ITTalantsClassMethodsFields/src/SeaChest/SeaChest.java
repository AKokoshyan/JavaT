package SeaChest;

public class SeaChest {

	private Symbol[][] field = new Symbol[5][5];
	private Player first;
	private Player second;

	public SeaChest() {
		constructField();
	}

	private void constructField() {
		Symbol one = new Symbol('|');
		Symbol two = new Symbol('|');
		Symbol tree = new Symbol('|');
		Symbol four = new Symbol('|');
		Symbol five = new Symbol('|');
		Symbol six = new Symbol('|');
		field[0][1] = one;
		field[0][3] = two;
		field[2][1] = tree;
		field[2][3] = four;
		field[4][1] = five;
		field[4][3] = six;
		Symbol firstPlus = new Symbol('+');
		Symbol secondPlus = new Symbol('+');
		Symbol thirdPlus = new Symbol('+');
		Symbol fourthPlus = new Symbol('+');
		field[1][1] = firstPlus;
		field[1][3] = secondPlus;
		field[3][1] = thirdPlus;
		field[3][3] = fourthPlus;
		Symbol first = new Symbol('-');
		Symbol second = new Symbol('-');
		Symbol third = new Symbol('-');
		Symbol fourth = new Symbol('-');
		Symbol fifth = new Symbol('-');
		Symbol sixst = new Symbol('-');
		field[1][0] = first;
		field[1][2] = second;
		field[1][4] = third;
		field[3][0] = fourth;
		field[3][2] = fifth;
		field[3][4] = sixst;

	}

	public void printFild() {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field.length; j++) {
				if (field[i][j] == null) {
					System.out.print(" ");
				} else {
					field[i][j].print();
				}
			}
			System.out.println();
		}
	}

}
