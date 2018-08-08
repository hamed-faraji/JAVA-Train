import java.util.Scanner;

public class StringFunctions {
	private static Scanner scanner;

	public static void main(String args[]) {
		
		scanner = new Scanner(System.in);
		String line;
		line = scanner.nextLine();/// first line of input.
		String command;
		String temp1;
		// jodasazie dastoorha:
		String[] parts = line.split("_");
		
		// jodasazie dastor asli va ebarate dakhelparantez:
		for (int i = 0; i < parts.length; i++) {
			command = parts[i];
			String[] dastoor = command.split("[()]");

			//////////////// SORT:
			if (dastoor[0].equals("sort")) {}
			//////////// REVERSE:
			if (dastoor[0].equals("reverse")) {}
			/////// TOLOWER
			if (dastoor[0].equals("tolower")) {}
			/////////// TOUPPER:
			if (dastoor[0].equals("toupper")) {}
			//////// CHANGECASE:
			if (dastoor[0].equals("changecase")) {}
			/////////// REPLACE:
			if (dastoor[0].equals("replace")) {}
			/////////// CONCAT:
			if (dastoor[0].equals("concat")) {}
		
		
		
		
		
		
		
		
		
		
	}
}
