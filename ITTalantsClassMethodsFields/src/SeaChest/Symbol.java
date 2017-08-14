package SeaChest;

public class Symbol {
	private char symbol;

	Symbol(char symbol) {
		setSymbol(symbol);
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		if (symbol == 'X' || symbol == 'O' || symbol == '-' || symbol == '|' || symbol == '+') {
			this.symbol = symbol;
		} else {
			System.out.println("Incorect symbol !");
		}
	}

	public void print() {
		System.out.print(this.symbol);
	}

}
