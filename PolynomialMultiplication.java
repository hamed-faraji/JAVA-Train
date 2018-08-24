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
			
				ArrayList<String> allList = new ArrayList<String>();
		String[] allArr = new String[allList.size()];
		for (int i = 0; i < term1.length; i++) {
			
			// for doing multiplication:(for terms1)
			// ghesmate marboot be amaliate tavan:(baraye term1)
			if (term1[i].contains("x")) {
				if (term1[i].equals("+1x")) {
					int a = 1;
					// for doing polynomial:(for terms2):
					// ghesmate marboot be amaliate tavan:(baraye term2)
					for (int j = 0; j < term2.length; j++) {
						if (term2[j].contains("x")) {
							// special ifs for exeptions:
							if (term2[j].equals("+1x")) {
								int c = 1, e = a * c;
								allList.add(e + "x" + "^" + 2);
							} else if (term2[j].equals("-1x")) {
								int c = -1, e = a * c;
								allList.add(e + "x" + "^" + 2);
							} else {
								String[] temp2 = term2[j].split("x");
								int c = Integer.parseInt(temp2[0]);
								if (term2[j].contains("^")) {
									temp2[1] = temp2[1].replace("^", "");
									int d = Integer.parseInt(temp2[1]), e = a * c, f = d + 1;
									allList.add(e + "x" + "^" + f);
								} // ghesmate marboot be x ha: (baraye term2)
								else {//
									int e = a * c;
									allList.add(e + "x" + "^" + 2);

								}
							}
						} else {
							int c = Integer.parseInt(term2[j]), e = a * c;
							allList.add(e + "x");
						}
					}
					// ghesmate marboot be x ha:(baraye term1)
				} 
				else if (term1[i].equals("-1x")) {
					int a = -1;
					for (int j = 0; j < term2.length; j++) {
						// for seprate terms that contain "x":
						if (term2[j].contains("x")) {
							if (term2[j].equals("+1x")) {
								int c = 1, e = a * c;
								allList.add(e + "x" + "^" + 2);
							} else if (term2[j].equals("-1x")) {
								int c = -1, e = a * c;
								allList.add(e + "x" + "^" + 2);
							} else {
								String[] temp2 = term2[j].split("x");
								int c = Integer.parseInt(temp2[0]);
								if (term2[j].contains("^")) {
									temp2[1] = temp2[1].replace("^", "");
									int d = Integer.parseInt(temp2[1]), e = a * c, f = d + 1;
									allList.add(e + "x" + "^" + f);

								} else {
									int e = a * c;
									allList.add(e + "x" + "^" + 2);

								}
							}

						}

						else {
							int c = Integer.parseInt(term2[j]), e = a * c;
							allList.add(e + "x");

						}
					}

				}
				// ghesmate marboot be x ha:(baraye term1)
				else {	
					String[] temp1 = term1[i].split("x");
					// a is coefficient of special term that change to
					// integer:
					int a = Integer.parseInt(temp1[0]);
					// for seprate terms that contain "^":
					if (term1[i].contains("^")) {
						temp1[1] = temp1[1].replace("^", "");
						// b is exponentiation of special term that change to
						// integer:
						int b = Integer.parseInt(temp1[1]);
						for (int j = 0; j < term2.length; j++) {
							// for seprate terms that contain "x":
							if (term2[j].contains("x")) {
								if (term2[j].equals("+1x")) {
									int c = 1, e = a * c, f = b + 1;
									allList.add(e + "x" + "^" + f);
								} else if (term2[j].equals("-1x")) {
									int c = -1, e = a * c, f = b + 1;
									allList.add(e + "x" + "^" + f);
								}

								else {
									String[] temp2 = term2[j].split("x");
									int c = Integer.parseInt(temp2[0]);
									if (term2[j].contains("^")) {
										temp2[1] = temp2[1].replace("^", "");
										int d = Integer.parseInt(temp2[1]), e = a * c, f = b + d;
										allList.add(e + "x" + "^" + f);

									} else {
										int e = a * c, f = b + 1;
										allList.add(e + "x" + "^" + f);

									}

								}
							}

							else {
								int c = Integer.parseInt(term2[j]), e = a * c;
								allList.add(e + "x" + "^" + b);

							}
						}

					} 
					else {
						
						for (int j = 0; j < term2.length; j++) {
							// for seprate terms that contain "x":
							if (term2[j].contains("x")) {
								if (term2[j].equals("+1x")) {
									int c = 1, e = a * c;
									allList.add(e + "x" + "^" + 2);
								} 
								else if (term2[j].equals("-1x")) {
									int c = -1, e = a * c;
									allList.add(e + "x" + "^" + 2);

								} 
								else {
									String[] temp2 = term2[j].split("x");
									int c = Integer.parseInt(temp2[0]);
									if (term2[j].contains("^")) {
										temp2[1] = temp2[1].replace("^", "");
										int d = Integer.parseInt(temp2[1]), e = a * c, f = d + 1;
										allList.add(e + "x" + "^" + f);
									} 
									else {
										int e = a * c;
										allList.add(e + "x" + "^" + 2);
									}

								}
							}

							else {
								int c = Integer.parseInt(term2[j]),e = a * c;
								allList.add(e + "x");

							}
						}
						
					}
				}
			}
			// ghesmate marboot be adade sahih:
			else {
				int a = Integer.parseInt(term1[i]);
				for (int j = 0; j < term2.length; j++) {
					// for seprate terms that contain "x":
					if (term2[j].contains("x")) {
						if (term2[j].equals("+1x")) {
							int c = 1,e = a * c;
							allList.add(e + "x");
						} else if (term2[j].equals("-1x")) {
							int c = -1,e = a * c;
							allList.add(e + "x");
						} else {
							String[] temp2 = term2[j].split("x");
							int c = Integer.parseInt(temp2[0]);
							if (term2[j].contains("^")) {
								temp2[1] = temp2[1].replace("^", "");
								int d = Integer.parseInt(temp2[1]), e = a * c, f = d;
								allList.add(e + "x" + "^" + f);

							} else {
								int e = a * c;
								allList.add(e + "x");
								}

						}
					}

					else {
						int c = Integer.parseInt(term2[j]), e = a * c;
						allList.add(e + "");

					}
				}
			}
		}

		ArrayList<String> allList2 = new ArrayList<String>();
		allArr = allList.toArray(allArr);
		//ghesmate jame tavan haye barabar va x ha va adade sahih:
		for (int i = 0; i < allArr.length; i++)

		{	//jame tavanha:
			if (allArr[i].contains("x")) {
				if (allArr[i].contains("^")) {
					
					String[] temp1 = allArr[i].split("x");
					int a = Integer.parseInt(temp1[0]),c = 0,counter = 0;
					for (int j = allArr.length - 1; j > i; j--) {
						if (allArr[j].contains("x")) {
							if (allArr[j].contains("^")) {
								String[] temp2 = allArr[j].split("x");
								int b = Integer.parseInt(temp2[0]);

								if (temp1[1].equals(temp2[1])) {
									c = c + (a + b);
									counter++;
									a = 0;
								}
							}
						}
					}
					if (counter == 0)
						allList2.add(allArr[i]);
					else
						allList2.add(c + "x" + temp1[1]);
				
				}
				//jame x ha:
				else {
					
				}
			}
			//jame adade sahih:
			else {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public static void main(String args[]) {

		String polynomial1, polynomial2;
		scanner2 = new Scanner(System.in);
		polynomial1 = scanner2.nextLine();

		polynomial2 = scanner2.nextLine();

		process(polynomial1, polynomial2);

	}

}