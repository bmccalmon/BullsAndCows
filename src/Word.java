
public class Word {
	
	private String answer;
	private LinkedList<String> guesses;
	
	public Word(String ans) {
		guesses = new LinkedList<String>();
		this.answer = ans;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public LinkedList<String> getGuesses() {
		// TODO: return a copy of the list guesses
		return null;
	}
	
	/**
	 * Adds a guess to the list.
	 * @Precondition Guess must be same length as answer.
	 * @return True if guess is correct, false if not.
	 */
	public boolean addGuess(String guess) {
		if (guess.length() != answer.length())
			return false;
		guesses.add(guess);
		if (guess.equals(answer))
			return true;
		return false;
	}
	
	/**
	 * Calculates the amount of bulls (matching characters in right position) based on the latest guess in the list.
	 */
	public int getBulls() {
		int count = 0;
		String guess = guesses.getEntry(guesses.getLength());
		for (int i = 0; i < guess.length(); i++) {
			char c = guess.charAt(i);
			String t = Character.toString(c);
			if (answer.contains(t) && inRightPosition(t,i))
				count++;
		}
		return count;
	}
	
	/**
	 * Calculates the amount of cows (matching characters in wrong position) based on the latest guess in the list.
	 */
	public int getCows() {
		int count = 0;
		String guess = guesses.getEntry(guesses.getLength());
		for (int i = 0; i < guess.length(); i++) {
			char c = guess.charAt(i);
			String t = Character.toString(c);
			if (answer.contains(t) && !inRightPosition(t,i))
				count++;
		}
		return count;
	}
	
	private boolean inRightPosition(String c, int pos) {
		if (answer.indexOf(c) == pos)
			return true;
		return false;
	}
	
}
