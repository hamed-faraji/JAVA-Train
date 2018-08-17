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
			if (dastoor[0].equals("reverse")) {String imported = dastoor[1];
				String[] array1 = imported.split("");
				// ghesmat marboot be 3 vorodi va reverse bakhshi az string:
				if (imported.contains(",")) {
					String[] array2 = imported.split(",");
					String[] array3 = array2[0].split("");
					String a = array2[1];
					int start = Integer.parseInt(a);
					String b = array2[2];
					int end = Integer.parseInt(b);
					// ja be ja kardane character haye bakhshe moshakhas shode
					// az reshte morede nazar:
					for (int j1 = start; j1 < end; j1++) {
						temp1 = array3[end];
						array3[end] = array3[j1];
						array3[j1] = temp1;
						end--;
					}
					// print khoroji:
					for (int j = 0; j < array3.length; j++)
						System.out.print(array3[j]);
					System.out.println();

				}
				// ghesmate marboot be yek khoroji:
				else {
					int a = array1.length;
					for (int j1 = a - 1; j1 >= 0; j1--)
						System.out.print(array1[j1]);
					System.out.println();
				}
			}
			/////// TOLOWER
			if (dastoor[0].equals("tolower")) {
				String imported = dastoor[1];
				String[] array1 = imported.split("");
				// ghesmat marboot be 3 vorodi va tolower bakhshi az string:
				if (imported.contains(",")) {
					String[] array2 = imported.split(",");
					String[] array3 = array2[0].split("");
					String a = array2[1];
					// moshakhas kardan ebteda va entehaye ghesmate morede nazar
					// dar string:
					int start = Integer.parseInt(a);
					String b = array2[2];
					int end = Integer.parseInt(b);
					// taghire horofe bozorg be kochik dar ghesmate khas:
					for (int j3 = 0; j3 < array3.length; j3++) {
						if (j3 == start)

						{
							for (int j = start; j <= end; j++) {

								char c = array3[j].charAt(0);
								int c1 = (int) c;
								int c2 = c1 + 32;
								if (c1 < 91 && c1 > 64)
									System.out.print(Character.toChars(c2));
								else
									System.out.print(array3[j]);

							}
							j3 = end + 1;
						}
						System.out.print(array3[j3]);
					}
					System.out.println();
				} else
				// ghesmati ke taha yek parametr darad
				{
					for (int j3 = 0; j3 < array1.length; j3++) {
						char c = array1[j3].charAt(0);
						int c1 = (int) c;
						int c2 = c1 + 32;
						// print khoroji ba emale taghirate marboote
						if (c1 < 91 && c1 > 64)
							System.out.print(Character.toChars(c2));
						else
							System.out.print(array1[j3]);
					}
					System.out.println();
				}
			}
			/////////// TOUPPER:
			if (dastoor[0].equals("toupper")) {
				String imported = dastoor[1];
				String[] array1 = imported.split("");
				// ghesmat marboot be 3 vorodi va toupper kardan string:
				if (imported.contains(",")) {
					String[] array2 = imported.split(",");
					String[] array3 = array2[0].split("");
					String a = array2[1];
					// moshakhas kardan ebteda va entehaye ghesmate morede
					// nazar:
					// dar string:
					int start = Integer.parseInt(a);
					String b = array2[2];
					int end = Integer.parseInt(b);
					// taghire horofekochak be horofe bozorg:
					for (int j3 = 0; j3 < array3.length; j3++) {
						if (j3 == start)

						{
							for (int j = start; j <= end; j++) {

								char c = array3[j].charAt(0);
								int c1 = (int) c;
								int c2 = c1 - 32;
								if (c1 > 96 && c1 < 123)
									System.out.print(Character.toChars(c2));
								else
									System.out.print(array3[j]);

							}
							j3 = end + 1;
						}
						System.out.print(array3[j3]);
					}
					System.out.println();
				} else{
					
					for (int j3 = 0; j3 < array1.length; j3++) {
						char c = array1[j3].charAt(0);
						int c1 = (int) c;
						int c2 = c1 - 32;
						// print khoroji ba emale taghirate marboote
						if (c1 < 123 && c1 > 96)
							System.out.print(Character.toChars(c2));
						else
							System.out.print(array1[j3]);
					}
					System.out.println();
					
				}
			}
			//////// CHANGECASE:
			if (dastoor[0].equals("changecase")) {
				String[] array2 = imported.split(",");
					String[] array3 = array2[0].split("");
					String a = array2[1];
					// moshakhas kardan ebteda va entehaye ghesmate morede
					// nazar:
					// dar string:
					int start = Integer.parseInt(a);
					String b = array2[2];
					int end = Integer.parseInt(b);
					// taghire horofekochak be horofe bozorg:
					for (int j3 = 0; j3 < array3.length; j3++) {
						if (j3 == start)

						{
							for (int j = start; j <= end; j++) {
								//// ghesmati ke horofe bozorg ra be kochak va
								//// horofe kochak ra be bozorg tabdil mikone:
								char c = array3[j].charAt(0);
								int c1 = (int) c;
								int c2 = c1 - 32;
								int c3 = c1 + 32;
								if (c1 < 123 && c1 > 96)
									System.out.print(Character.toChars(c2));
								else if (c1 < 91 && c1 > 64)
									System.out.print(Character.toChars(c3));
								else
									System.out.print(array3[j]);
							}
							j3 = end + 1;
						}
						System.out.print(array3[j3]);
					}
					System.out.println();
				}else{
					
				}
			}
			/////////// REPLACE:
			if (dastoor[0].equals("replace")) {}
			/////////// CONCAT:
			if (dastoor[0].equals("concat")) {}
		
		
		
		
		
		
		
		
		
		
	}
}
