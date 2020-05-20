package com.hangman;

/** This class represents the logic for the actual Hangman game that involves user input,
 *  and paints the Hangman whenever the input is incorrect.
 * @author Brandon Myers and Brad Smialek
 * @author Blue Macro
 */
public class Hangman {
    /**
     *  For every character within a string(word), an underscore is put in its place.
     */
    protected static String emptyString =
            new String(new char[CategorySelector.word.length()]).replace("\0", "_"); // grabs word

    /** Does this:
    public void guess(String word) {
        System.out.println(word);
        this.word = word;

        char[] charSpaces = new char[word.length()];
        int i = 0;
        while (i < word.length()) {
            charSpaces[i] = '_';
            if (word.charAt(i) == ' ') {
                charSpaces[i] = ' ';
            }
            i+
        }
        str = String.valueOf(charSpaces);
    }
     */

    /**
     *  The counter starts at zero as a default when the user has not yet input a character guess.
     */
    protected static int count = 0;

    /** Checks to see if the user's input character matches the character within the word
     *  string (word) uses a for loop to go down every character starting at 0 (the first character in the word).
     *  If the guess is correct then the underscore is replaced with the correct character.
     *  If not correct, the underscore stays there, the counter goes up by 1 and a body part is drawn on the hangman.
     *  If all characters match the word, then the user wins the game.
     * @param guess A string that contains the user's guess at what the character in the word is.
     */

    public static void guessWords(String guess) {
        String newEmptyString = "";
        for (int i = 0; i < CategorySelector.word.length(); i++) {  // Grabbing word
            if (CategorySelector.word.charAt(i) == guess.charAt(0)) {
                newEmptyString += guess.charAt(0);
            } else if (emptyString.charAt(i) != '_') {
                newEmptyString += CategorySelector.word.charAt(i);
            } else {
                newEmptyString += "_";
            }
        }

        if (emptyString.equals(newEmptyString)) {
            count++;
            paintHangman();
        } else {
            emptyString = newEmptyString;
        }
        if (emptyString.equals(CategorySelector.word)) {
            System.out.println("Correct! You win! The word was " + CategorySelector.word);
        }
    }

    /**
     * This paints the actual hangman to the console, and displays how many times you've guessed incorrectly.
     */
    public static void paintHangman() {
        if (count == 1) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("1 incorrect guess, 6 guesses left");
        }
        if (count == 2) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |            |");
            System.out.println("    |            |");
            System.out.println("    |            |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("2 incorrect guesses, 5 guesses left");
        }
        if (count == 3) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|");
            System.out.println("    |         /  |");
            System.out.println("    |        /   |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("3 incorrect guesses, 4 guesses left");
        }
        if (count == 4) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|__");
            System.out.println("    |         /  |  \\");
            System.out.println("    |        /   |   \\");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("4 incorrect guesses, 3 guesses left");
        }
        if (count == 5) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|__");
            System.out.println("    |         /  |  \\");
            System.out.println("    |        /   |   \\");
            System.out.println("    |           /");
            System.out.println("    |          /");
            System.out.println("    |        _/");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("5 incorrect guesses, 2 guesses left");
        }
        if (count == 6) {
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / 0 0 \\");
            System.out.println("    |         |  < ' |");
            System.out.println("    |         |  ~~  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|__");
            System.out.println("    |         /  |  \\");
            System.out.println("    |        /   |   \\");
            System.out.println("    |           / \\");
            System.out.println("    |          /   \\");
            System.out.println("    |        _/     \\_");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("6 incorrect guesses, only 1 guess left!");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("7 incorrect guesses");
            System.out.println("Wrong guess, try again");
            System.out.println("    ______________");
            System.out.println("    |           _|_");
            System.out.println("    |         / X X \\");
            System.out.println("    |         |  <   |");
            System.out.println("    |         |  __  |");
            System.out.println("    |         \\_____/");
            System.out.println("    |            |");
            System.out.println("    |          __|__");
            System.out.println("    |         /  |  \\");
            System.out.println("    |        /   |   \\");
            System.out.println("    |           / \\");
            System.out.println("    |          /   \\");
            System.out.println("    |        _/     \\_");
            System.out.println("    |");
            System.out.println("    |");
            System.out.println("____|____");
            System.out.println("RIP " + UserName.getUserName());
            System.out.println("GAME OVER! The word was " + CategorySelector.word);
        }
    }
}

