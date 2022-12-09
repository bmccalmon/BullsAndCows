# Bulls and Cows

## Game Description
Bulls and Cows is a popular word guessing game where the objective is to guess a hidden word. The game provides the player with a number of bulls and cows, which are hints about the hidden word. A bull indicates that a letter in the player's guess is correct and is in the correct position. A cow indicates that a letter in the player's guess is correct but is in the wrong position.

For example, if the hidden word is "heat" and the player guesses "teal", the game will provide the player with 2 bulls and 1 cow. The player must use these hints to guess the hidden word before running out of attempts.

Bulls and Cows is a fun and challenging game that tests the player's ability to think logically and make deductions. It is suitable for players of all ages.

## Usage
The Word class is the main component of this implementation. It provides everything you need to play the game. I provided an App class that tests the implementation. I also provided a list of 5-letter isogram words that the test program uses for the answer (you can use words of any length, and not just limited to one length).

The Word class requires my Linked implementation of a list (it is actually more efficient to use Java's built-in ArrayList implementation, but I wanted the practice for my college course). It's simple enough to change, if needed.