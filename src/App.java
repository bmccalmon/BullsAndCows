import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Author: Benjamin McCalmon
 * Version: alpha-1.0
 * Date last modified: 12/09/2022
 * Bulls and Cows McCalmon implementation all rights reserved
 */

// TODO implement ListInterface using an array

public class App {
	
	public static void main(String[] args) {
		LinkedList<String> ansList = new LinkedList<String>();
		try {
			File ansFile = new File("./src/data/wordlist.txt");
			Scanner reader = new Scanner(ansFile);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				ansList.insert(1, data);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int index = 1 + (int) (Math.random() * ansList.getLength());
		String answer = ansList.getEntry(index);
		Word word = new Word(answer);
		
		System.out.println("Answer: " + answer.length() + " letters\tGuess only isogram words (letters can't repeat)\n");
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print(":: ");
			String guess = input.next();
			if (guess.length() != answer.length())
				continue;
			if (word.addGuess(guess)) {
				System.out.println("You guessed the word!");
				break;
			}
			System.out.println("Bulls: " + word.getBulls() + " | Cows: " + word.getCows());
		}
	}

}
