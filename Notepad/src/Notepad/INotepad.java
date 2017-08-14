package Notepad;

public interface INotepad {

	void addText(int sheetNumber);

	void overWriteText(int sheetNumber);

	void deleteText(int sheetNumber);

	void printNotepad();

	void searchWord(String word);

	void printAllPagesWithDigits();
}
