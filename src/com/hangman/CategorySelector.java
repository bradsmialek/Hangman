package com.hangman;
import java.util.Scanner;

/** This class allows the user to select a category which each contain a different set of words.
 * after the user has selected a category, the words go through a random word method to give the user one random word.
 * @author Brandon Myers and Brad Smialek
 * @author Blue Macro
 */

public class CategorySelector {
    private static String[] sportWords = {"football", "baseball", "soccer", "tennis", "basketball"};
    private static String[] foodWords = {"pizza", "burger", "ramen", "sandwich", "burrito"};
    private static String[] animalWords = {"cat", "dog", "fish", "bird", "monkey"};
    public static String word;
    private static CategoryType category;

    public static void pickCategory() throws IllegalArgumentException {
        boolean repeat = true;
        Scanner s = new Scanner(System.in);
        System.out.print("Hello " + UserName.getUserName() + "! Pick a category. Your categories are:"
                + java.util.Arrays.asList(CategoryType.values())); // Lists Enum Choices
        System.out.println("");

        while (repeat) {
            try {
                String categoryStr = s.nextLine(); //grabs input
                category = CategoryType.valueOf(categoryStr.toUpperCase()); // input to upper then checks input against ENUMs - implicit
                repeat = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong input, you must enter one of the following categories: " +
                        java.util.Arrays.asList(CategoryType.values()));
                repeat = true;
            }
        }

        switch (category) {
            case SPORTS:
                word = randomWord(sportWords);
                break;
            case FOOD:
                word = randomWord(foodWords);
                break;
            case ANIMALS:
                word = randomWord(animalWords);
                break;
        }
    }

    public static String randomWord(String[] array) {

        int position = (int) (Math.random() * array.length);
        System.out.println(position);
        String result = array[position];
        System.out.println(result);
        return result;
    }
}




