package com.hangman;
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
            System.out.println(
            " 88        88                                                                                                ad888888b,     ,a8888a,     ad888888b,     ,a8888a,      \n" +
            " 88        88                                                                                               d8       88   ,8P      Y8,  d8      88   ,88       Y8,    \n" +
            " 88        88                                                                                                       a8P  ,8P        Y8,         a8P  ,8P        Y8,   \n" +
            " 88aaaaaaaa88  ,adPPYYba,  8b,dPPYba,    ,adPPYb,d8  88,dPYba,,adPYba,   ,adPPYYba,  8b,dPPYba,                  ,d8P    88          88      ,d8P    88          88   \n" +
            " 88        88          Y8  88P'     ll  /a8    `Y88  88P'    88      8a          44  88       88               38P       88          88    a8P       88          88   \n" +
            " 88        88  ,adPPPPP88  88       88  8b       88  88      88      88  ,adPPPPP88  88       88             a8P'        `8b        d8'  a8P'        `8b        d8'   \n" +
            " 88        88  88,    ,88  88       88   8a,   ,d88  88      88      88  88,    ,88  88       88            d8            `8ba,  ,ad8'  d8            `8ba,  ,ad8'    \n" +
            " 88        88  ` 8bbdP Y8  88       88   ` YbbdP Y8  88      88      88  ` 8bbdP Y8  88       88            88888888888      Y8888P     88888888888      Y8888P       \n" +
            "                                         aa,    ,88                                                                                                                   \n" +
            "                                           Y8bbdP                                               888888888888                                                          \n" );

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
