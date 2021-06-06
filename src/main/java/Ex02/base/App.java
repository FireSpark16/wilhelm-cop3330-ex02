/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex02.base;

import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String []args) {
        App myApp = new App();

        String inputString = myApp.readWord();
        int count = myApp.count(inputString);
        String output = myApp.generateOutput(inputString, count);
        myApp.printOutput(output);
    }


    public String generateOutput(String inputString, int count) {
        return inputString + " has " + count + " characters.";
    }

    public void printOutput(String output) {
        System.out.print(output);
    }

    public int count(String inputString) {
        return inputString.length();
    }

    public String readWord() {
        System.out.print("What is the input string? ");
        return in.nextLine();
    }
}
