package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 100;

        int randomInt;

        Random random = new Random(MIN, MAX);
        randomInt = random.getValue();

        Interaction interaction = new Interaction(MIN, MAX, randomInt);
        interaction.start();
    }
}
