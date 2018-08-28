package conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        String userInput;
        System.out.print("Enter a word: ");

        Scanner scanner = new Scanner(System.in);

        // get input from user
        userInput = scanner.next();

        // we want to compare characters regardless of their case
        String lowercaseUserInput = userInput.toLowerCase();

        // declare needed variables below
        char letter;
        int index = 0;
        boolean vowelFound = false;

        // loop over each character of the userInput
        while (index < userInput.length() && !vowelFound) {

            // get the letter at a specific index within userInput
            letter = userInput.charAt(index);

            // run a switch statement to check to see if it is a vowel
            switch (letter) {
                case 'a':
                    System.out.println("The first vowel in " + userInput + " is \"a\"");
                    vowelFound = true;
                    break;
                case 'e':
                    System.out.println("The first vowel in " + userInput + " is \"e\"");
                    vowelFound = true;
                    break;
                case 'i':
                    System.out.println("The first vowel " + userInput + " is \"i\"");
                    vowelFound = true;
                    break;
                case 'o':
                    System.out.println("The first vowel in " + userInput + " is \"o\"");
                    vowelFound = true;
                    break;
                case 'u':
                    System.out.println("The first vowel in " + userInput + " is \"u\"");
                    vowelFound = true;
                    break;
                case 'y':
                    System.out.println("The first vowel in " + userInput + " is (sometimes) \"y\"");
                    vowelFound = true;
                    break;
            }
            // increment index and keep looking if necessary
            index++;
        }

        if (!vowelFound){
            System.out.println("We could not locate a vowel in the word you entered (" + userInput + ").");
        }
    }
}



