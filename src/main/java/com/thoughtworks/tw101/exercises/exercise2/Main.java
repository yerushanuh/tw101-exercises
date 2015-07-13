package com.thoughtworks.tw101.exercises.exercise2;

// Exercise #2: Create a class that counts how many times you call the method increment() and prints out that number
// when you call total(). Create a main method that calls increment() 5 times and then calls total().
// By: Yerusha Nuh

public class Main {
    private static final int TIMES = 5;

    public static void main(String[] args) {

        Accumulator accumulator = new Accumulator();

        for (int i = 0; i < TIMES; i++) {
            accumulator.increment();
        }

        accumulator.total();
    }
}
