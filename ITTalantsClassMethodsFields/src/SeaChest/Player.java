package SeaChest;

public class Player {
	private String name;
	private Symbol[] symbol;

	
	public Player(int number, String name) {
		if (number == 1) {
			this.name = name;
			symbol = new Symbol[5];
			char x = 'X';
			for (int i = 0; i < symbol.length; i++) {
				symbol[i] = new Symbol(x);
			}
		}
		if (number == 2) {
			this.name = name;
			symbol = new Symbol[5];
			char o = 'O';
			for (int i = 0; i < symbol.length; i++) {
				symbol[i] = new Symbol(o);
			}
		}
	}
}
