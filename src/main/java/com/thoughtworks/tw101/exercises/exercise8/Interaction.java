package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Yerusha on 2015-07-17.
 */
public class Interaction {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static String input = "";
    private static int guess = 0;
    private static ArrayList list = new ArrayList();

    private Interaction() {

    }

    public static void summarizeProgram() {
        System.out.println("Guess a random integer between 1 and 100.");
    }

    public static void requestInput() {
        System.out.print("Enter your guess: ");
    }

    public static int getInput() {
        try {
            input = reader.readLine();
        } catch (IOException e) {
            System.err.println("Caught IOException: " + e.getMessage());
        }

        try {
            if (input != null) {
                guess = Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " + e.getMessage());
        }

        return guess;
    }

    public static boolean giveHintIfWrong(int guess, int random) {
        list.add(new Integer(guess));

        if (guess == random) {
            System.out.println("You win!");

            System.out.print("Your guesses: ");
            for (int i = 0; i < (list.size() - 1); i++) {
                System.out.print(list.get(i) + ", ");
            }
            System.out.println(list.get(list.size() - 1));

            return true;
        }
        else {
            if (guess < random) {
                System.out.println("You guessed too low.");
            }
            else {
                System.out.println("You guessed too high.");
            }

            return false;
        }
    }
}
