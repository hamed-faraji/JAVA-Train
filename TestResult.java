import java.util.Scanner;

public class TestResult {

	private static Scanner scanner2;
	static void process(String answer, String data) {
		String[] parts = data.split(" ");

	
	//joda kardan asami va javabha:
	double correct = 0;
	double incorrect = 0;
	double nazadeh = 0;
	char a, b;
	double part[] = new double[parts.length / 2];
	
	//moghayese javabha
	for (int i = 1; i <= parts.length; i += 2)
	{

		for (int j = 0; j < answer.length(); j++)
		{
			a = parts[i].charAt(j);

			b = answer.charAt(j);

			if (a == b)
				correct++;
			else if (a == 'Z')
				nazadeh++;
			else
				incorrect++;
		}

		
		
	}

	
	public static void main(String args[]) {/// do not edit main method, input
										/// should be entered as described
										/// before
	String answer, data;
	scanner2 = new Scanner(System.in);
	answer = scanner2.nextLine();/// first line of input is the correct
								/// answer
	data = scanner2.nextLine();/// second line of input is data as described
								/// before
	process(answer, data);
}
}