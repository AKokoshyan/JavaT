package Notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted = false;

	public ElectronicSecuredNotepad(String owner, int numberPages, int password) {
		super(owner, numberPages, password);

	}

	public void addText(int sheetNumber) {
		if (this.isStarted) {
			super.addText(sheetNumber);
		} else {
			System.out.println("To do this action you have to start the notepad!");
		}
	}

	public void overWriteText(int sheetNumber) {
		if (isStarted) {
			super.overWriteText(sheetNumber);
		} else {
			System.out.println("To do this action you have to start the notepad!");
		}
	}

	public void deleteText(int sheetNumber) {
		if (isStarted) {
			super.deleteText(sheetNumber);
		} else {
			System.out.println("To do this action you have to start the notepad!");
		}
	}

	public void printNotepad() {
		if (isStarted) {
			super.printNotepad();
		} else {
			System.out.println("To do this action you have to start the notepad!");
		}
	}

	public void searchWord(String word) {
		if (isStarted) {
			super.searchWord(word);
		} else {
			System.out.println("To do this action you have to start the notepad!");
		}
	}

	public void printAllPagesWithDigits() {
		if (isStarted) {
			super.printAllPagesWithDigits();
		} else {
			System.out.println("To do this action you have to start the notepad!");
		}
	}

	@Override
	public void start() {
		this.isStarted = true;

	}

	@Override
	public void stop() {
		this.isStarted = false;

	}

	@Override
	public boolean isStarted() {
		if (this.isStarted) {
			return true;
		}
		return false;
	}

}
