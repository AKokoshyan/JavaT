
public class Task10 {

	public static void main(String[] args) {
		String ala = "afdgj-15ak546";
		char[] newString = new char[ala.length()];

		for (int i = 0; i < newString.length; i++) {
			newString[i] = ala.charAt(i);
			newString[i] += 5;
		}
		for (int j = 0; j < newString.length; j++) {

			System.out.print(newString[j]);
		}
	}

}
