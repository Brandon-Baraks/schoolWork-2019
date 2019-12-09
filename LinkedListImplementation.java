import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListImplementation {
	
	public static int getAmount(List<String> sentences, String sentence) {
		int amount = 0;
		for (String s : sentences) {
			if (s.equalsIgnoreCase(sentence))
				amount += 1;
		}
		return amount;
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String sentence;
		List<String> sentences = new LinkedList<>();
		System.out.print("Enter some text (quit to stop): ");
		sentence = scnr.nextLine();
		while (!sentence.equalsIgnoreCase("quit")) {
			sentences.add(sentence);
			System.out.println("You entered \"" + sentence + "\" " + getAmount(sentences, sentence) + " time(s)\n");

			System.out.print("Enter some text (quit to stop): ");
			sentence = scnr.nextLine();
		}
		System.out.println("Goodbye");
		scnr.close();

	}

}
