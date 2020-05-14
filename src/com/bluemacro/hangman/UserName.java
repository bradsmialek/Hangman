package com.bluemacro.hangman;
import java.util.Scanner;
/** This class allows the user to set a username and returns the name for other classes to use.
 * @author Brandon Myers and Brad Smialek
 * @author Blue Macro
 */
public class UserName {
    private static String userName;
/**
 *  Sets the username based on user input.
 */
        public static void setUserName() {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter username");

            userName = myObj.nextLine();  // Read user input
        }

    /**
     *
     * @return Returns username input by user
     */
    public static String getUserName() {
        return userName;
    }
}
