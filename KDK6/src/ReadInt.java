import java.util.Scanner;

public class ReadInt {

	static int inputInt;

	static public int createIntegerNumber() {
		boolean correct = false;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Podaj liczbę: ");			
			String input = in.nextLine();			
			if (!(input.equals(""))) {
				input = input.substring(0, 1);
				try {
					inputInt = Integer.parseInt(input);
					correct = true;
				} catch (NumberFormatException e) {				
					System.out.println("Wprowadzony ciąg nie jest Integerem");
					correct = false;
				}
			}
		} while (!correct);		
		return inputInt;
	}	
}