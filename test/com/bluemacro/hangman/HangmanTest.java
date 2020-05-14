package com.bluemacro.hangman;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bradsmialek on Thu - 5/14/20 @ 8:10 AM
 */
public class HangmanTest {

    @Test
    public void guessWords() {
        Hangman hang = new Hangman();
        hang.guessWords("s");
        CategorySelector.word = "soccer";

        assertTrue(Hangman.emptyString.contains("s_____"));

    }

    @Test
    public void paintHangman() {
//        Hangman hangman = new Hangman();
//        hangman.paintHangman();
    }
}