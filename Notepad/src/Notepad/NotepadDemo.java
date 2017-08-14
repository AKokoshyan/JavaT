package Notepad;

import java.util.Scanner;

public class NotepadDemo {

	public static void main(String[] args) {

		Sheet stranica = new Sheet("Glava 1 ", "Gosho pushi c12igari !");
		stranica.containsDigits();

		ElectronicSecuredNotepad notepad = new ElectronicSecuredNotepad("Tonio", 15, 834282);

		Scanner sc = new Scanner(System.in);

		int options;
		int page;
		String word;
		int stop;

		do {
			System.out.println("The notepad is started ");
			notepad.start();
			do {
				System.out.println(
						"---- Welcome to notepad menu ----\nTo add text press 1.\nTo overwrite text press 2.\nTo delete text of page press 3.\nTo print notepad press 4.\nTo search word press 5\nTo print all pages with digits press 6\nFor exit press 0");
				options = sc.nextInt();
				switch (options) {
				case 0:
					break;
				case 1:
					System.out.println("On wiche page do you want to add text ?");
					page = sc.nextInt();
					notepad.addText(page);
					break;
				case 2:
					System.out.println("On whiche page do you want to overwrite text ?");
					page = sc.nextInt();
					notepad.overWriteText(page);
					break;
				case 3:
					System.out.println("On whiche page do you want to delete the text ?");
					page = sc.nextInt();
					notepad.deleteText(page);
					break;
				case 4:
					notepad.printNotepad();
					break;
				case 5:
					System.out.println("Whiche word do you want to search?");
					word = sc.nextLine();
					word = sc.nextLine();
					notepad.searchWord(word);
					break;
				case 6:
					notepad.printAllPagesWithDigits();
					break;
				default:
					System.out.println("There is no such options in the menu !");
					break;
				}
			} while (options != 0);
			if (notepad.isStarted()) {
				System.out.println("If you want to stop the notepad press 1!");
				stop = sc.nextInt();
				if (stop == 1) {
					notepad.stop();
				}
			}
		} while (notepad.isStarted());
		sc.close();
	}
}
