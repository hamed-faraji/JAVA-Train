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
		//mohasebeye darsad va sakhtan array baraye darsadha:			
		part[(i - 1) / 2] = (((correct * 3) - incorrect) / ((correct + incorrect + nazadeh) * 3)*100);

	
		correct = 0;
		incorrect = 0;
		nazadeh = 0;
		
		
	}
	
	//rikhtan asami dar array jodagane:	
    String[] name = new String[parts.length/2];
	for(int i=0;i<parts.length;i+=2)
		name [i/2] = parts[i];
		
		
		int p;
	for (p = part.length - 1; p >= 0; p--) {
		double max = part[p];
		for (int k = 0; k <= p; k++)
			if (max < part[k]) {
				max = part[k];
				double index = part[p];
				part[p] = part[k];
				part[k] = index;
				
				String nameIndex = name[p];
				name[p] = name[k];
				name[k] = nameIndex;
				
				
			}
	}
	
	//chape khoroji:
	for (int i = name.length - 1; i >= 0; i--)
		System.out.printf("%s %.2f\n", name[i], part[i]);
	
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