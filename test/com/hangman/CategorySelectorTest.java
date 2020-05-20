package com.hangman;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bradsmialek on Thu - 5/14/20 @ 8:09 AM
 */
public class CategorySelectorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void pickCategory() {
        CategorySelector.word = "ball";

        assertTrue(CategorySelector.word.contains("a") );
        assertFalse(CategorySelector.word.contains("z"));
    }

    @Test
    public void randomWord() {
    }
}
