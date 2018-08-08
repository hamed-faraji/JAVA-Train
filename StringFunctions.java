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
			if (dastoor[0].equals("sort")) {
				String imported = dastoor[1];
				String[] array1 = imported.split("");
				// dar halati ke se vorodi dashte bawshim:
				if (imported.contains(",")) {
					String[] array2 = imported.split(",");

					String[] array3 = array2[0].split("");
					String a = array2[1];
					int start = Integer.parseInt(a);
					String b = array2[2];
					int end = Integer.parseInt(b);
					// sort bakhshe moshakhas shode:
					for (int t = start; t <= end; t++) {
						for (int k = t + 1; k <= end; k++) {
							if (array3[k].compareTo(array3[t]) < 0) {
								String temp = array3[t];
								array3[t] = array3[k];
								array3[k] = temp;

							}
						}

					}
					// print kardan dar khoroji:
					for (int j1 = 0; j1 < array3.length; j1++)
						System.out.print(array3[j1]);
					System.out.println();
				}
				// bakhshe marbot be sort yek vorodi:
				else {
					for (int t = 0; t < array1.length; t++) {
						for (int k = t + 1; k < array1.length; k++) {
							if (array1[k].compareTo(array1[t]) < 0) {
								String temp = array1[t];
								array1[t] = array1[k];
								array1[k] = temp;

							}
						}

					}
					for (int j1 = 0; j1 < array1.length; j1++)
						System.out.print(array1[j1]);
					System.out.println();

				}
			}
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
