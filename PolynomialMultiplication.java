import java.util.ArrayList;
import java.util.Scanner;

public class PolynomialMultiplication {

	private static Scanner scanner2;

	static void process(String polynomial1, String polynamial2) {
		String[] term1 = polynomial1.split(" ");
		String[] term2 = polynamial2.split(" ");
		// if first term be x change it to +x:
		if (term1[0].contains("x")) {
			if (term1[0].charAt(0) == 'x')
				term1[0] = String.join("", "+", term1[0]);
		}
		if (term2[0].contains("x")) {
			if (term2[0].charAt(0) == 'x')
				term2[0] = String.join("", "+", term2[0]);
		}
		// if special term be -x or +x change it to -1x and +1x for next
		// processes:
		for (int i = 0; i < term1.length; i++)
			if (term1[i].contains("-x"))
				term1[i] = term1[i].replace("-", "-1");
			else if (term1[i].contains("+x"))
				term1[i] = term1[i].replace("+", "+1");
		for (int i = 0; i < term2.length; i++)
			if (term2[i].contains("-x"))
				term2[i] = term2[i].replace("-", "-1");
			else if (term2[i].contains("+x"))
				term2[i] = term2[i].replace("+", "+1");

		
		
		}

	public static void main(String args[]) {

		String polynomial1, polynomial2;
		scanner2 = new Scanner(System.in);
		polynomial1 = scanner2.nextLine();

		polynomial2 = scanner2.nextLine();

		process(polynomial1, polynomial2);

	}

}