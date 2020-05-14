package com.bluemacro.hangman;
import java.util.Scanner;
/** This class contains the main game logic allowing the user to guess a word,
 * and forces the user to set a username by calling setUserName from UserName class.
 * @author Brandon Myers and Brad Smialek
 * @author Blue Macro
 */
public class GameEngine {
    /**
     * While the user has less than 7 incorrect guesses and the string still contains underscores, the game will
     * allow the user to keep making guesses.
     */
    public static void runGame() {
        UserName.setUserName();
        CategorySelector.pickCategory();
        Scanner sc = new Scanner(System.in);


        while (Hangman.count < 7 && Hangman.emptyString.contains("_")) {

            System.out.println("Guess any letter in the word");
            System.out.println(Hangman.emptyString);
            String guess = sc.next();
            Hangman.guessWords(guess);
        }

            sc.close();
    }
}

