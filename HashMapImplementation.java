import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapImplementation {
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String NewWord;
		Map<String, Integer> WordMap = new HashMap<>();
		System.out.print("Enter some text (quit to stop): ");
		NewWord = scnr.nextLine();
		while (!NewWord.equalsIgnoreCase("quit")) {
			//here we are adding the NewWord as key, and for value, we are checking if it returns null, which means it is not already a key
			//if not a key, we get 0, and we add 1 to it, otherwise, we simply increment the value
			WordMap.put(NewWord.toLowerCase(), (WordMap.get(NewWord.toLowerCase())==null?0:WordMap.get(NewWord.toLowerCase()))+1);
			System.out.println("You entered \"" + NewWord + "\" " + WordMap.get(NewWord.toLowerCase()) + " time(s)\n");
			System.out.print("Enter some text (quit to stop): ");
			NewWord = scnr.nextLine();
		}
		System.out.println("Goodbye");
		scnr.close();

	}
}
