package Notepad;

import java.util.Scanner;

public class SimpleNotepad implements INotepad {
	private Scanner scanner = new Scanner(System.in);
	private Sheet[] pages;
	private int numberPages;
	private String owner;

	// Constructors

	public SimpleNotepad(String owner, int numberPages) {
		setOwner(owner);
		setNumberPages(numberPages);
		setPages(this.numberPages);
	}

	// Getters and setters

	private void setOwner(String owner) {
		if (owner != null) {
			this.owner = owner;
		}

	}

	private void setNumberPages(int numberPages) {
		if (numberPages > 0) {
			this.numberPages = numberPages;
		} else {
			System.out.println("There is no notebook without pages!");
		}

	}

	private void setPages(int numberPages) {
		pages = new Sheet[numberPages];
		for (int i = 0; i < pages.length; i++) {
			pages[i] = new Sheet(null, null);
		}
	}

	// Public methods

	@Override
	public void addText(int sheetNumber) {
		if (sheetNumber < 0 || sheetNumber > pages.length) {
			System.out.println("Sorry, there is no such page!");
		} else {
			System.out.println("You are writing on page " + (sheetNumber + 1));
			String temp = scanner.nextLine();
			this.pages[sheetNumber].addText(temp);
		}

	}

	@Override
	public void overWriteText(int sheetNumber) {
		if (sheetNumber < 0 || sheetNumber > pages.length) {
			System.out.println("Sorry, there is no such page!");
		} else {
			pages[sheetNumber].deleteText();
			System.out.println("You are over writing on page " + (sheetNumber + 1));
			String temp = scanner.nextLine();
			pages[sheetNumber].addText(temp);
		}

	}

	@Override
	public void deleteText(int sheetNumber) {
		if (sheetNumber < 0 || sheetNumber > pages.length) {
			System.out.println("Sorry, there is no such page!");
		} else {
			pages[sheetNumber].deleteText();
		}
	}

	@Override
	public void printNotepad() {
		for (int i = 0; i < pages.length; i++) {
			System.out.println("---------- Page " + (i + 1) + " ----------");
			System.out.println(this.pages[i].toString());
		}

	}

	@Override
	public void searchWord(String word) {
		for (int i = 0; i < pages.length; i++) {
			if (this.pages[i].searchWord(word)) {
				System.out.println("On page N" + (i + 1) + " there is word " + word);
				return;
			}
		}
		System.out.println("There is no such word in the notepad !");
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if (this.pages[i].containsDigits()) {
				pages[i].toString();
			}
		}
	}

}
