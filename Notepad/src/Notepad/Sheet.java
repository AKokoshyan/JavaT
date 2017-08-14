package Notepad;

public class Sheet {

	private String title;
	private String text;

	// Constructors

	public Sheet(String title, String text) {
		setTitle(title);
		setText(text);
	}

	// Getters and setters

	private void setText(String text) {
		if (text != null) {
			if (this.text == null) {
				this.text = text;
			} else if (this.text != null) {
				this.text += text;
			}
		}

	}

	private void setTitle(String title) {
		if (title != null) {
			if (this.title == null) {
				this.title = title;
			} else if (this.title != null) {
				this.title += title;
			}
		}

	}

	// Public methods

	public void addText(String text) {
		setText(text);
	}

	public void deleteText() {
		this.text = null;
	}

	public String toString() {
		String result;
		result = this.title + "\n" + this.text;
		return result;
	}

	public boolean searchWord(String word) {
		if (this.text != null) {
			String[] words;
			words = this.text.split(" ");
			for (int i = 0; i < words.length; i++) {
				if (words[i].equals(word)) {
					// System.out.println("The word " + word + " is in the text
					// in
					// position " + (i + 1));
					return true;
				}
			}
		}
		// System.out.println("The word " + word + " is not in the text!");
		return false;
	}

	public boolean containsDigits() {
		if (this.text != null) {
			int counter = 0;
			for (int i = 0; i < this.text.length(); i++) {
				if (this.text.charAt(i) >= '0' && this.text.charAt(i) <= '9') {
					counter++;
				}
				if (counter == 2) {
					System.out.println("The text of this page contains digits!");
					return true;
				}
			}
			// if (counter == 1) {
			// System.out.println("The text of this page contains one digit!");
			// } else {
			// System.out.println("The text is not containing digits!");
			// }
		}
		return false;
	}
}
