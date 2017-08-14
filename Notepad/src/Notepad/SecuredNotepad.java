package Notepad;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private Scanner scanner = new Scanner(System.in);
	private int password;

	// Constructors
	public SecuredNotepad(String owner, int numberPages, int password) {
		super(owner, numberPages);
		setPassword(password);
	}

	// Getters and setters
	private void setPassword(int password) {
		if (password > 100000 && password < 999999) {
			this.password = password;
		}

	}

	private void checkPassword() {
		System.out.println("Enter password :");
		int checkPassword;
		do {
			checkPassword = scanner.nextInt();
			if (this.password != checkPassword) {
				System.out.println("Incorect password! Try again : ");
			}
		} while (this.password != checkPassword);
	}

	// Public methods
	public void addText(int sheetNumber) {
		checkPassword();
		super.addText(sheetNumber);
	}

	public void overWriteText(int sheetNumber) {
		checkPassword();
		super.overWriteText(sheetNumber);
	}

	public void deleteText(int sheetNumber) {
		checkPassword();
		super.deleteText(sheetNumber);
	}

	public void printNotepad() {
		checkPassword();
		super.printNotepad();
	}

	public void searchWord(String word) {
		checkPassword();
		super.searchWord(word);
	}

	public void printAllPagesWithDigits() {
		checkPassword();
		super.printAllPagesWithDigits();
	}
}
